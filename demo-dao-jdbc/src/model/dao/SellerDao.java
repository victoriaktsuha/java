package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	//operação responsável por inserir no db o objeto como parâmetro
		void insert(Seller obj);
		void update(Seller obj);
		void deleteById(Integer id);
		Seller findById(Integer id);
		List<Seller> findAll();
	
}
