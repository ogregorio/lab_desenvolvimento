package com.example.lab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.lab.models.Pedido;
import com.example.lab.services.PedidoService;


@Controller
@RequestMapping("/pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("pedidos", pedidoService.findAll());
		return "/index/pedidos/pedidos";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add(ModelMap modelMap) {
		modelMap.put("pedido", new Pedido());
		return "/index/pedidos/add";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(@ModelAttribute("pedido") Pedido pedido) {
		pedidoService.save(pedido);
		return "redirect:/pedidos";
	}
	
	@RequestMapping(value = "/cliente/{cpf}", method = RequestMethod.GET)
	public String find(@PathVariable String cpf, ModelMap modelMap) {
		modelMap.put("pedidos", pedidoService.findByCpf(cpf));
		System.out.println(cpf);
		return "/index/pedidos/cliente";
	}
}
