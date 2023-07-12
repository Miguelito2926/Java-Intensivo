package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

//Classe auxiliar  com as duas referencias para representar uma PK multipla
@Embeddable // encapsulando dois atributos  em uma classe so
public class BelongingPK {

	//Associação de Referencia para entidade Game
	@ManyToOne // Mapeamento jpa muitos para um
	@JoinColumn(name = "game_id") //Defini o nome da chave estrangeira 
	private Game game;
	
	
	//Associação de Referencia para entidade GameList
	@ManyToOne // Mapeamento jpa muitos para um
	@JoinColumn(name = "list_id") //Defini o nome da chave estrangeira 
	private GameList list;
	
	public BelongingPK() {
		
	}

	public BelongingPK(Game game, GameList list) {
		this.game = game;
		this.list = list;
	}
	
	
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameList getList() {
		return list;
	}

	public void setList(GameList list) {
		this.list = list;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(game, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(list, other.list);
	}
}
