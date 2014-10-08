package DAO;

import javax.persistence.EntityManager;

import basicas.Ticket;

public class DAOTicket extends DAOGenerico<Ticket> {
	public DAOTicket(EntityManager em){
		super(em);
	}
}
