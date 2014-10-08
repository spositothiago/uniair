package DAO;

import javax.persistence.EntityManager;

import basicas.Tripulation;

public class DAOTripulation extends DAOGenerico<Tripulation> {
	public DAOTripulation(EntityManager em){
		super(em);
	}
}
