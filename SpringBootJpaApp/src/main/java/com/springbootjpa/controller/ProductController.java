package com.springbootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springbootjpa.model.Product;
import com.springbootjpa.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/list" ,method = RequestMethod.GET)
	public ModelAndView list() 
	{
		ModelAndView model = new ModelAndView("product_list");
		List<Product> productList = productService.getAllProducts();
		model.addObject("productList", productList);
		return model;
	}

	@RequestMapping(value="/addProduct" ,method = RequestMethod.GET)
	public ModelAndView addProduct() 
	{
		ModelAndView model = new ModelAndView();
		Product product = new Product();
		model.addObject("productForm", product);
		model.setViewName("product_form");
		return model;
	}
	@RequestMapping(value = "/addProduct" , method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("productForm") Product product) 
	{
		productService.addProduct(product);
		return new ModelAndView("redirect:/product/list");
	}
	@RequestMapping(value = "/editProduct/{id}" , method = RequestMethod.GET)
	public ModelAndView editProduct(@PathVariable int id) 
	{
		ModelAndView model = new ModelAndView();
		Product product = productService.getProductById(id);
		model.addObject("productForm", product);
		model.setViewName("product_form");
		return model;
	}
	
	@RequestMapping(value = "/deleteProduct/{id}" , method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id)
	{
		ModelAndView model = new ModelAndView();
		productService.deleteProduct(id);
		model.setViewName("product_form");
		return new ModelAndView("redirect:/product/list");
		
	}
}
