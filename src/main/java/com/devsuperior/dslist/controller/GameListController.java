package com.devsuperior.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.services.GameListService;

//Classe reponsavel em disponibilizar dados para Api "Porta de entrada"
//Implementa a API

@RestController // defini a classe como controladora
@RequestMapping(value = "/lists") // defini o mapeamento do recurso
public class GameListController {
	
	@Autowired // Injeta o gameService
	private GameListService gameListService;
	
	
	@GetMapping //mapea com verbo http get
	public List<GameListDTO> findAll(){ // metodo retorna uma lista de game service
		List<GameListDTO> resultado = gameListService.findAll();
		return resultado;
	}
	

}
