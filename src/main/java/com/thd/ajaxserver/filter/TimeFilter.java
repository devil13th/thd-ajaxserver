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

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.core.annotation.Order;
@Order(2)
//重点
@WebFilter(filterName = "TimeFilter", urlPatterns = "/*")
public class TimeFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("destroy " + this.getClass().getName() + " ... ");

	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) 
			throws IOException, ServletException {
		
		long beginTime = System.currentTimeMillis();
		
		System.out.println("*********************************" + this.getClass().getName() + " start **************************");
		chain.doFilter(req, res);
		System.out.println("*********************************" + this.getClass().getName() + " end **************************");
		System.out.println(" 总执行时间:" +  (System.currentTimeMillis() - beginTime));
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("load " + this.getClass().getName() + " ... ");
	}
	
	/**
	 * 1.在主配置类上添加注释@ServletComponentScan
	 * 2.在Filter类上添加注释@WebFilter(filterName = "TimeFilter", urlPatterns = "/*")
	 * 3.编写Filter内容
	 */

}
