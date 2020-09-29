package com.able.servlet3;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @param
 * @author jipeng
 * @date 2020-09-22 18:18
 */
@WebFilter("/*")
public class HelloFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("HelloFilter.init");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("HelloFilter.doFilter");
		chain.doFilter(request,response);
	}

	@Override
	public void destroy() {
		System.out.println("HelloFilter.destroy");
	}
}

