package com.bsoft.cn.servlet;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class SessionShareServlet
 */
public class SessionShareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SessionShareServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String id = request.getSession().getId();
			request.getSession().setAttribute("session", id);
			System.out.println(id);
			OutputStream out = response.getOutputStream();
			out.write(id.getBytes());
			
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
