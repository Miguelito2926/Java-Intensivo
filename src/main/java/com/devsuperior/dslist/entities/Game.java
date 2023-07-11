package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // configura classe java para que ela seja equivalente a uma tabela do banco realcional
@Table(name = "tb_game") // configura o nome da tabela no banco
public class Game {
	
	@Id // Coloca o id como chave primaria no banco
	@GeneratedValue(strategy = GenerationType.IDENTITY) //configura a chave primaria para auto incremento
	private Long id;
	private String title;
	
	@Column(name = "game_year") // Configuração para modificar o nome da coluna no banco de year para year_game
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescriptio;
	private String longDescription;
	
	
	public Game() {
		
	}


	public Game(Long id, String title, int year, String genre, String platforms, Double score, String imgUrl,
			String shortDescriptio, String longDescription) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescriptio = shortDescriptio;
		this.longDescription = longDescription;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getPlatforms() {
		return platforms;
	}


	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}


	public Double getScore() {
		return score;
	}


	public void setScore(Double score) {
		this.score = score;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public String getShortDescriptio() {
		return shortDescriptio;
	}


	public void setShortDescriptio(String shortDescriptio) {
		this.shortDescriptio = shortDescriptio;
	}


	public String getLongDescription() {
		return longDescription;
	}


	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}

	
	
}
