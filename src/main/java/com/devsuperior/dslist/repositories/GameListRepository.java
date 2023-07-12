package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

// Responsavel por fazer consulta a base de dados

//Configura um componente que  inseri, atualiza, consulta e deleta do bancos de dados
public interface GameListRepository extends JpaRepository<GameList, Long> {

	
}
