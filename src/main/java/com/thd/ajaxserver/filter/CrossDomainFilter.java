package com.thd.ajaxserver.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
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
		HttpServletResponse response = (HttpServletResponse) res;
		response.setHeader("Access-Control-Allow-Origin", "*");
		//response.setHeader("Access-Control-Allow-Origin", "aa,access-control-allow-origin,content-type");
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers", "*");
		System.out.println("*********************************" + this.getClass().getName() + " start **************************");
		chain.doFilter(req, res);
		System.out.println("*********************************" + this.getClass().getName() + " end **************************");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("load " + this.getClass().getName() + " ... ");

	}

}
