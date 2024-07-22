package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	//opera��o respons�vel por inserir no db o objeto como par�metro
		void insert(Seller obj);
		void update(Seller obj);
		void deleteById(Integer id);
		Seller findById(Integer id);
		List<Seller> findAll();
	
}
