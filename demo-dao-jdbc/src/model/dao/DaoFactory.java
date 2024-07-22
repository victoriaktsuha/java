package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

//classe para instanciar os daos
public class DaoFactory {
	
	public static SellerDao creatSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
