package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDCBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDCBC(DB.getConnection());
	}

}
