package model.dao;

import model.dao.impl.SellerDaoJDBC;

//classe para instanciar os daos
public class DaoFactory {

	
	public static SellerDao creatSellerDao() {
		return new SellerDaoJDBC();
	}
}
