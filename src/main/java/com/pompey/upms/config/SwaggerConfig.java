package com.pompey.upms.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName: Swagger2Config
 * @Description: swagger配置类
 * @author PompeyXu
 * @date: 2019-04-09 21:38
 *
 */
@Configuration
@EnableSwagger2
@ConditionalOnProperty(name = "swagger.enable", havingValue = "true")
public class SwaggerConfig {
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(new ApiInfoBuilder().title("标题：upms_接口文档").description("upms接口信息")
						.contact(new Contact("Socks", null, null)).version("版本号:1.0").build())
				.select().apis(RequestHandlerSelectors.basePackage("com.pompey.upms.system.controller"))
				.paths(PathSelectors.any()).build();
	}

}
