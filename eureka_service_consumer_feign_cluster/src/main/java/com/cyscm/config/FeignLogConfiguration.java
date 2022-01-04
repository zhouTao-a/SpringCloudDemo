package com.cyscm.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * NONE 不记录任何信息，默认
 * BASIC 记录请求方法，请求URL，状态码和用时
 * HEADERS 在BASIC基础上在记录一些常用信息
 * FULL 记录请求和相应的所有信息
 * @author zhoutao
 */
@Configuration
public class FeignLogConfiguration {

	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}
}