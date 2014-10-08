package DAO;

import javax.persistence.EntityManager;

import basicas.Customer;

public class DAOCustomer extends DAOGenerico<Customer>{
	public DAOCustomer(EntityManager em){
		super(em);
	}
}
