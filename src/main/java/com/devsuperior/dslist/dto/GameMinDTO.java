package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

//classe auxiliar  que exponhei apenas alguns dados dos games
public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
	}

	//Construtor que recebe a entidade "copia os dados da entidade Game"
	public GameMinDTO(Game entity) { 
		
		id = entity.getId();// Pega o id da entidade e salva no dto
		title = entity.getTitle(); //Pega o titulo da entidade e salva no dto
		year = entity.getYear();//Pega o ano da entidade e salva no dto
		imgUrl = entity.getImgUrl();//Pega a imagem da entidade e salva no dto
		shortDescription = entity.getShortDescription();//Pega a descrição da entidade e salva no dto
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
}
