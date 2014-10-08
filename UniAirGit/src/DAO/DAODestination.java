package DAO;

import javax.persistence.EntityManager;

import basicas.Destination;

public class DAODestination extends DAOGenerico<Destination> {
	public DAODestination(EntityManager em){
		super(em);
	}
}
