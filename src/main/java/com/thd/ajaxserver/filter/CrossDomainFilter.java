package com.thd.ajaxserver.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
@Order(1)
//重点
@WebFilter(filterName = "crossDomainFilter", urlPatterns = "/*")
public class CrossDomainFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("destroy " + this.getClass().getName() + " ... ");

	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) 
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse) res;
		// 来允许来自所有域的跨域请求访问
		response.setHeader("Access-Control-Allow-Origin", "*"); 
		//只允许来自特定域 http://my.domain.cn:8080 的跨域访问
		//response.setHeader("Access-Control-Allow-Origin", "http://my.domain.cn:8080");
		
		//较灵活的设置方式，允许所有包含 mydomain.com 的域名访问.
		//if(request.getHeader("Origin").contains("mydomain.com")) {
		//    response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		//}
		
		
		//response.setHeader("Access-Control-Allow-Origin",request.getHeader("Origin"));
		
		
		//
		//服务器端 Access-Control-Allow-Credentials = true时，参数Access-Control-Allow-Origin 的值不能为 '*'
		//response.setHeader("Access-Control-Allow-Credentials", "true");
		
		
		//允许的http方法
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
		
		//（预检请求）的返回结果（即 Access-Control-Allow-Methods 和Access-Control-Allow-Headers 提供的信息） 可以被缓存多久。
		//response.setHeader("Access-Control-Max-Age", "3600");
		
		//请求头中设置允许的请求header的属性,多个属性使用逗号","隔开。
		response.setHeader("Access-Control-Allow-Headers", "aab,access-control-allow-origin,content-type");
		//response.setHeader("Access-Control-Allow-Headers", "*");
		
		
		System.out.println("*********************************" + this.getClass().getName() + " start **************************");
		chain.doFilter(req, res);
		System.out.println("*********************************" + this.getClass().getName() + " end **************************");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("load " + this.getClass().getName() + " ... ");

	}

}
