package com.pompey.upms.config;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * @ClassName: DateFormatConfig
 * @Description: 全局日期格式化
 * @author Pompey
 * @date: 2019-04-08 22:36
 *
 */
@JsonComponent
public class DateFormatConfig {
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * @ClassName: DateJsonSerializer
	 * @Description: 日期格式化
	 * @author Pompey
	 * @date: 2019-04-08 22:35
	 *
	 */
	public static class DateJsonSerializer extends JsonSerializer<Date> {
		@Override
		public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
				throws IOException {
			jsonGenerator.writeString(dateFormat.format(date));
		}
	}

	/**
	 * @ClassName: DateJsonDeserializer
	 * @Description: 解析日期字符串
	 * @author Pompey
	 * @date: 2019-04-08 22:35
	 *
	 */
	public static class DateJsonDeserializer extends JsonDeserializer<Date> {
		@Override
		public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
				throws IOException, JsonProcessingException {
			try {
				return dateFormat.parse(jsonParser.getText());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}

		}
	}
}
