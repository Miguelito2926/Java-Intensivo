package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;



// Classe respponsavel pelas regras de negocios e também que executa os metodos consulta, exclusão, adição e atualização ao banco.

@Service //Configura a  classe como um componente de sistema
public class GameService {
	
	@Autowired // injeta uma instancia de repositorio
	private GameRepository gameRepository;
	
	//Retorna um consulta por id
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game resultado = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(resultado);
		return dto;
		
	}
	
	
	// Metodo para retonar uma lista de todos que esxiste em GameMinDTO 
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> resultado = gameRepository.findAll();
		
		//Converte uma Lista de Game para uma  nova lista de GameMinDTO. 
		List<GameMinDTO> dto = resultado.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}

}
