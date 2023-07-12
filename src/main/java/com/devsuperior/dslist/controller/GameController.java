package com.devsuperior.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameService;

//Classe reponsavel em disponibilizar dados para Api "Porta de entrada"
//Implementa a API

@RestController // defini a classe como controladora
@RequestMapping(value = "/games") // defini o mapeamento do recurso
public class GameController {
	
	@Autowired // Injeta o gameService
	private GameService gameService;
	
	@GetMapping //mapea com verbo http get
	public List<GameMinDTO> findAll(){ // metodo retorna uma lista de game service
		List<GameMinDTO> resultado = gameService.findAll();
		return resultado;
	}
	

}
