package com.example.controller;

import com.example.model.BeerExpert;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.List;
import java.util.Iterator;

public class BeerSelect extends HttpServlet {
	
	public void doPost(HttpServletRequest request,
					HttpServletResponse response)
					throws IOException, ServletException {
		
				
		String color = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(color);
		
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}
}