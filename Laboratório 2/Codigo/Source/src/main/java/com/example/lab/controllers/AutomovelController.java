package com.example.lab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.lab.services.AutomovelService;


@Controller
@RequestMapping("/automoveis")
public class AutomovelController {
	
	@Autowired
	private AutomovelService automovelService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("automoveis", automovelService.findAll());
		return "/index/automoveis";
	}

}
