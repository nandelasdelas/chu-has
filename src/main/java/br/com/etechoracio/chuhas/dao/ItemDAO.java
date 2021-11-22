package br.com.etechoracio.chuhas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.chuhas.model.Item;

public interface ItemDAO extends JpaRepository<Item, Integer> {

}
