package model.dao;

import model.dao.impl.SellerDaoJDCBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDCBC();
	}

}
