package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAOFactory {
	private static EntityManager manager;
	private static final EntityManagerFactory factory;
	static {
		factory = Persistence.createEntityManagerFactory("persistence");
		if(manager == null || !manager.isOpen()){
			manager = factory.createEntityManager();
		}
	}
	
	public static DAOAirPlane getAirPlaneDAO(){
		DAOAirPlane airplaneDAO = new DAOAirPlane(manager);
		return airplaneDAO;
	}
	public static DAOCustomer getCustomerDAO(){
		DAOCustomer customerDAO = new DAOCustomer(manager);
		return customerDAO;
	}
	public static DAODestination getDestinationDAO(){
		DAODestination destinationDAO = new DAODestination(manager);
		return destinationDAO;
	}
	public static DAOFlight getFlightDAO(){
		DAOFlight flightDAO = new DAOFlight(manager);
		return flightDAO;
	}
	public static DAOPayment getPaymentDAO(){
		DAOPayment paymentDAO = new DAOPayment(manager);
		return paymentDAO;
	}
	public static DAOPurchase getPurchaseDAO(){
		DAOPurchase purchaseDAO = new DAOPurchase(manager);
		return purchaseDAO;
	}
	public static DAOTicket getTicketDAO(){
		DAOTicket ticketDAO = new DAOTicket(manager);
		return ticketDAO;
	}
	public static DAOTripulation getTripulationDAO(){
		DAOTripulation tripulationDAO = new DAOTripulation(manager);
		return tripulationDAO;
	}
	public static DAOUser getUserDAO(){
		DAOUser userDAO = new DAOUser(manager);
		return userDAO;
	}
}
