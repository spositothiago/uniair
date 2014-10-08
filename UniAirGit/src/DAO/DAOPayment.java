package DAO;

import javax.persistence.EntityManager;

import basicas.Payment;

public class DAOPayment extends DAOGenerico<Payment>{
	public DAOPayment(EntityManager em){
		super(em);
	}
}
