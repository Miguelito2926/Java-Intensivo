package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;



// Classe respponsavel pelas regras de negocios e também que executa os metodos consulta, exclusão, adição e atualização ao banco.

@Service //Configura a  classe como um componente de sistema
public class GameListService {
	
	@Autowired // injeta uma instancia de repositorio
	private GameListRepository gameListRepository;
	
		
	// Metodo para retonar uma lista de todos que esxiste em GameListDTO
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> resultado = gameListRepository.findAll();
		
		//Converte uma Lista de Game para uma  nova lista de GameMinDTO. 
		List<GameListDTO> dto = resultado.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}

}
