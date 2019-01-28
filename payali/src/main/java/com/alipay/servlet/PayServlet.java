package com.alipay.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PayServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Order o = new Order();
		o.setOderNum("430528111195632545");
		o.setName("小辣椒");
		o.setPrice(0.04);
		req.setAttribute("order", o);
		req.getRequestDispatcher("/index.jsp").forward(req, res);
	}


}

