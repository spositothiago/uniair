package DAO;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;


public class DAOGenerico<T> {
	private EntityManager entityManager;
	private Class<T> classPersistence;
	
	@SuppressWarnings("unchecked")
	public DAOGenerico(EntityManager em){
		this.setEntityManager(em);
		ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
		classPersistence = (Class<T>)parameterizedType.getActualTypeArguments()[0];
	}
	
	public void inserir(T obj){
		EntityTransaction tx = getEntityManager().getTransaction();
		try{
			tx.begin();
			getEntityManager().persist(obj);
			tx.commit();
		}catch(PersistenceException e){
			tx.rollback();
		}
	}
	
	public final void inserirColecao(Collection<T> colecao){
		EntityTransaction tx = getEntityManager().getTransaction();
		try{
			tx.begin();
			for(T item: colecao){
				getEntityManager().persist(item);
			}
			
			tx.commit();
		}catch(PersistenceException e){
			tx.rollback();
		}
	}
	
	public T alterar(T obj){
		EntityTransaction tx = getEntityManager().getTransaction();
		tx.begin();
		
		obj = getEntityManager().merge(obj);
		tx.commit();
		
		return obj;
	}
	
	public T remover(T obj){
		EntityTransaction tx = getEntityManager().getTransaction();
		tx.begin();
		
		obj = getEntityManager().merge(obj);
		getEntityManager().remove(obj);
		tx.commit();
		
		return obj;
	}
	
	public final T buscarPorChave(Serializable key){
		T instance = null;
		try{
			instance = (T) getEntityManager().find(getClassPersistence(), key);
		}catch (PersistenceException e){
			e.printStackTrace();
		}
		return instance;
	}
	
	public final void refresh(T obj){
		getEntityManager().refresh(obj);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	protected final Class<T> getClassPersistence() {
		return classPersistence;
	}

}
