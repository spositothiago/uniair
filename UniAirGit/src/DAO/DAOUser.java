package DAO;

import javax.persistence.EntityManager;

import basicas.User;

public class DAOUser extends DAOGenerico<User>{
	public DAOUser(EntityManager em){
		super(em);
	}
}
