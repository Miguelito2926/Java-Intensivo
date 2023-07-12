package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

	private Long id; 
	private String name;
	
	public GameListDTO() {
		
	}
	
	public GameListDTO(GameList entity) {
		id = entity.getId(); // OBS: Neste caso em  que não usei o BeanUltls, não é necessário implementar os sets
		name = entity.getName();
		
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
	
	
}
