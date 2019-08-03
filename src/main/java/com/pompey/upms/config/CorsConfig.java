package com.pompey.upms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

import java.util.Arrays;

/**
 * 处理跨域请求问题
 * 
 * @author PompeyXu
 * @date 2019-04-15 21:01
 */
@Configuration
public class CorsConfig implements WebFluxConfigurer{

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowedMethods("*")
                .exposedHeaders(HttpHeaders.SET_COOKIE);
    }

    @Bean
    public CorsFilter corsFilter(){
        CorsConfiguration config = new CorsConfiguration();
        // 放行哪些原始域
        config.addAllowedOrigin("*");
        // 放行哪些原始域(头部信息)
        config.addAllowedHeader("*");
        // 是否发送Cookie信息
        config.setAllowCredentials(true);
        // 放行哪些原始域(请求方式)
        config.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE"));
        config.addExposedHeader(HttpHeaders.SET_COOKIE);
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        // 添加映射路径
        configurationSource.registerCorsConfiguration("/**", config);
        return new CorsFilter(configurationSource);
    }

}
