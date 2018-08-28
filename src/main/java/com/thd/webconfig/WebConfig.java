package com.thd.webconfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.thd.ajaxserver.filter.TimeFilter;
import com.thd.ajaxserver.interceptor.LogInterceptor;
@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Autowired
	private LogInterceptor loginterceptor;
	
	/**
	 * 拦截器的配置
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(loginterceptor);
		//WebMvcConfigurer.super.addInterceptors(registry);
	}
	
	
	/**
	 * Filter 的配置
	 * @return
	 */
	@Bean
	public FilterRegistrationBean TimeFilter() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		TimeFilter timeFilter = new TimeFilter();
		registrationBean.setFilter(timeFilter);
		
		List<String> urls = new ArrayList<String>();
		urls.add("/*");
		registrationBean.setUrlPatterns(urls);
		registrationBean.setOrder(3);
		return registrationBean;
	}

}
