package com.thd.ajaxserver.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
@Component
public class LogInterceptor implements HandlerInterceptor {
	//拦截的方法执行之前执行
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle");
		request.setAttribute("__startTime", System.currentTimeMillis());
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
	
	//拦截的方法执行之后执行(被拦截的方法正确执行)
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle");
		Long startTime = (Long)request.getAttribute("__startTime");
		System.out.println("LogInterceptor拦截器记录执行时间:" + ( System.currentTimeMillis() - startTime));
		//HandlerMethod method = (HandlerMethod)handler;
		//System.out.println(method.getBean().getClass().getName() + "." + method.getMethod().getName() + " 开始执行 ");
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	//拦截的方法执行之后执行(无论被拦截的方法是否正确执行)
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion");
		Long startTime = (Long)request.getAttribute("__startTime");
		System.out.println("LogInterceptor拦截器记录执行时间:" + ( System.currentTimeMillis() - startTime));
		//HandlerMethod method = (HandlerMethod)handler;
		//System.out.println(method.getBean().getClass().getName() + "." + method.getMethod().getName() + " 执行结束 ");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
