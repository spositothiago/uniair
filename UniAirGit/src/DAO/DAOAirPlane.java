package DAO;

import javax.persistence.EntityManager;

import basicas.AirPlane;

public class DAOAirPlane extends DAOGenerico<AirPlane> {
	public DAOAirPlane(EntityManager em){
		super(em);
	}
}
