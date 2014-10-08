package DAO;

import javax.persistence.EntityManager;

import basicas.Flight;;

public class DAOFlight extends DAOGenerico<Flight>{
	public DAOFlight(EntityManager em){
		super(em);
	}
}
