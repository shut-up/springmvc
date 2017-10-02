package cn.parker.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.parker.ssm.po.Items;

public class ItemsController2 implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Items> itemsList = new ArrayList<Items>();
		
		Items item_1 = new Items();
		item_1.setName("华硕笔记本22");
		item_1.setPrice(225000f);
		item_1.setDetail("华硕最新款笔记本22");
		
		Items item_2 = new Items();
		item_2.setName("iphone X22");
		item_2.setPrice(229000f);
		item_2.setDetail("最新款苹果手机，苹果十周年产品22");
		
		itemsList.add(item_1);
		itemsList.add(item_2);
		
		request.setAttribute("itemsList", itemsList);
		request.getRequestDispatcher("/WEB-INF/jsp/items/itemsList.jsp").forward(request, response);
	}


}
