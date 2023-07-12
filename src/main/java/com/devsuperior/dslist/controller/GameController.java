package com.devsuperior.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameService;

//Classe reponsavel em disponibilizar dados para Api "Porta de entrada"
//Implementa a API

@RestController // defini a classe como controladora
@RequestMapping(value = "/games") // defini o mapeamento do recurso
public class GameController {
	
	@Autowired // Injeta o gameService
	private GameService gameService;
	
	@GetMapping(value = "/{id}") // configura o mapeamento passando o id como parametro
	public  GameDTO findById(@PathVariable Long id) { // @PathVariable indentifica o paramentro passado na url do recurso 
		GameDTO resultado = gameService.findById(id);
		return resultado;
	}
	
	@GetMapping //mapea com verbo http get
	public List<GameMinDTO> findAll(){ // metodo retorna uma lista de game service
		List<GameMinDTO> resultado = gameService.findAll();
		return resultado;
	}
	

}
