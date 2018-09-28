package com.thd.ajaxserver.yml;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 使用@PropertySource的例子
 * @author wangl
 * 
 */
@Component
@PropertySource(value={"classpath:com/thd/ajaxserver/yml/propertiesExample.properties"},encoding="utf-8") 

public class PropertiesExample {
	//如果配置文件中没有propertiesexample.name配置,则使用默认值"devil13th"
	@Value("${propertiesexample.name:devil13th}") 
	private String name;
	@Value("${propertiesexample.age}") 
	private Integer age;
	@Value("${propertiesexample.birthday}") 
	private Date birthday;
	@Value("somethings")
	private String str ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
