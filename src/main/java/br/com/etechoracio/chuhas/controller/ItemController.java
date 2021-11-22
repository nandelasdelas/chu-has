package br.com.etechoracio.chuhas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.etechoracio.chuhas.dao.ItemDAO;
import br.com.etechoracio.chuhas.model.Item;

@RestController
@RequestMapping("itens")
public class ItemController {

	@Autowired
	private ItemDAO dao;
	
	@GetMapping
	public List<Item> buscarTodos() {
		return dao.findAll();
	}
	
	
	
}
