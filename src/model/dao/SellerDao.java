package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void upddate(Seller obj);
	void deleteBy(Seller obj);
	Seller findById(Integer id);
	List<Seller> findAll();
}
