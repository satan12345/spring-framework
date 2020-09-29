package com.able.servlet3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @param
 * @author jipeng
 * @date 2020-09-22 18:05
 */
@WebServlet(value="/helloServlet")
public class HelloServlet extends HttpServlet {


	private static final long serialVersionUID = 2908562131543562623L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.getWriter().write("hello servlet3.0");
	}
}

