package com.thd.ajaxserver.yml;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/** 
 * 使用yml文件进行配置的例子 
 * 将配置文件中配置的每一个属性的值，映射到这个组件中  
 * @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
 * prefix = "children"：配置文件中哪个下面的所有属性进行一一映射
 * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能  
 */
@Component
@ConfigurationProperties(prefix="children")
public class Children {
	private String name;
	private int age;
	private Date birthday;
	private Map<String,Object> m;
	private List<String> l;
	private Dog dog;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Map<String, Object> getM() {
		return m;
	}
	public void setM(Map<String, Object> m) {
		this.m = m;
	}
	public List<String> getL() {
		return l;
	}
	public void setL(List<String> l) {
		this.l = l;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
}
