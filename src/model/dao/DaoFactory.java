package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJBDBC;

public class DaoFactory {

	public static SellerDao createSellerDao(){
		return new SellerDaoJBDBC(DB.getConnection());
	}
}
