package com.example.lab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.lab.services.ClienteService;


@Controller
@RequestMapping(value = {"","cliente"})
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("clientes",clienteService.findAll());
		return "cliente/index";
	}
	
}
