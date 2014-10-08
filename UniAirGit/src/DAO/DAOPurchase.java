package DAO;

import javax.persistence.EntityManager;

import basicas.Purchase;

public class DAOPurchase extends DAOGenerico<Purchase> {
	public DAOPurchase(EntityManager em){
		super(em);
	}
}
