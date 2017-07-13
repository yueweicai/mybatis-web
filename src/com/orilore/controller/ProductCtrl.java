package com.orilore.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.pagehelper.Page;
import com.orilore.biz.IProductBiz;
import com.orilore.biz.ProductBiz;
import com.orilore.entitys.Product;

@WebServlet("/product.do")
public class ProductCtrl extends HttpServlet {
	private IProductBiz biz = new ProductBiz();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int p = 1;
		String page = request.getParameter("page");
		if(page!=null){
			p = Integer.parseInt(page);
		}
		Page plist = (Page)biz.findProduct(p);
		request.setAttribute("pages",plist.getPages());
		request.setAttribute("products", plist.getResult());
		request.getRequestDispatcher("products.jsp").forward(request, response);;
	}
}
