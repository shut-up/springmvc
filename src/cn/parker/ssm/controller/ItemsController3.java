package cn.parker.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.parker.ssm.po.Items;

//使用@Controller标识它是一个控制器
@Controller
public class ItemsController3{
	
	//@RequestMapping实现 对queryItems方法和url进行映射，一个方法对应一个url
	//一般建议将url和方法写成一样
	@RequestMapping("/queryItems")
	public ModelAndView queryItems()throws Exception{
		
		List<Items> itemsList = new ArrayList<Items>();
		
		Items item_1 = new Items();
		item_1.setName("注解的华硕笔记本");
		item_1.setPrice(225000f);
		item_1.setDetail("注解的华硕最新款笔记本");
		
		Items item_2 = new Items();
		item_2.setName("注解的iphone X");
		item_2.setPrice(229000f);
		item_2.setDetail("注解的最新款苹果手机，苹果十周年产品");
		
		itemsList.add(item_1);
		itemsList.add(item_2);
		
		//创建ModelAndView来填充数据，设置试图
		ModelAndView modelAndView = new ModelAndView();
		//填充数据,相当于request.setAttribute,在jsp页面通过${itemsList }取出数据
		modelAndView.addObject("itemsList", itemsList);
		//指定试图
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
			
		return modelAndView;
}


}
