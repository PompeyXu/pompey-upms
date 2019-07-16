package com.pompey.upms.config;

import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName: FastJsonConfiguration
 * @Description: 全局JSON配置
 * @author PompeyXu
 * @date: 2019-04-08 22:18
 *
 */
@Configuration
public class FastJsonConfiguration implements WebMvcConfigurer{
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

		/**
		 * 创建配置类
		 * WriteNullListAsEmpty：List字段如果为null，输出为[]，而非null。
		 * WriteNullStringAsEmpty：字符类型字段如果为null，输出为""，而非null。
		 * DisableCircularReferenceDetect：消除对同一对象循环引用的问题，默认为false（如果不配置有可能会进入死循环）
		 * WriteNullBooleanAsFalse：Boolean字段如果为null，输出为false，而非null。
		 * WriteMapNullValue：是否输出值为null的字段，默认为false。
		 **/
		// 清除默认 Json 转换器
		converters.removeIf(converter -> converter instanceof MappingJackson2HttpMessageConverter);

		// 配置 FastJson
		FastJsonConfig config = new FastJsonConfig();
		config.setSerializerFeatures(SerializerFeature.QuoteFieldNames, SerializerFeature.WriteEnumUsingToString,
				SerializerFeature.WriteMapNullValue, SerializerFeature.WriteDateUseDateFormat,
				SerializerFeature.DisableCircularReferenceDetect);

		// 添加 FastJsonHttpMessageConverter
		FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
		fastJsonHttpMessageConverter.setFastJsonConfig(config);
		List<MediaType> fastMediaTypes = new ArrayList<>();
		fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		fastJsonHttpMessageConverter.setSupportedMediaTypes(fastMediaTypes);
		converters.add(fastJsonHttpMessageConverter);

		// 添加 StringHttpMessageConverter，解决中文乱码问题
		StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
		converters.add(stringHttpMessageConverter);
	}
}
