package Fachada;

import java.util.Collection;

import basicas.AirPlane;
import basicas.Customer;
import basicas.Destination;
import basicas.Flight;
import basicas.Payment;
import basicas.Purchase;
import basicas.Ticket;
import basicas.Tripulation;
import basicas.User;
import Negocio.NegAirPlane;
import Negocio.NegCustomer;
import Negocio.NegDestination;
import Negocio.NegFlight;
import Negocio.NegPayment;
import Negocio.NegPurchase;
import Negocio.NegTicket;
import Negocio.NegTripulation;
import Negocio.NegUser;

public class Fachada {
	private static Fachada instance;
	
	private NegAirPlane negAirPlane;
	private NegCustomer negCustomer;
	private NegDestination negDestination;
	private NegFlight negFlight;
	private NegPayment negPayment;
	private NegPurchase negPurchase;
	private NegTicket negTicket;
	private NegTripulation negTripulation;
	private NegUser negUser;
	
	private Fachada(){
		this.negAirPlane = new NegAirPlane();
		this.negCustomer = new NegCustomer();
		this.negDestination = new NegDestination();
		this.negFlight = new NegFlight();
		this.negPayment = new NegPayment();
		this.negPurchase = new NegPurchase();
		this.negTicket = new NegTicket();
		this.negTripulation = new NegTripulation();
		this.negUser = new NegUser();
	}
	
	public static Fachada GetInstance(){
		if(instance == null){
			instance = new Fachada();
		}
		return instance;
	}
	
	//################### AIRPLANE ####################
	public void AirPlaneCadastrar(AirPlane a){
		this.negAirPlane.cadastrar(a);
	}
	public void AirPlaneEditar(AirPlane a){
		this.negAirPlane.editar(a);
	}
	public AirPlane AirPlaneBuscar(int id){
		return this.negAirPlane.pesquisar(id);
	}
	public Collection<AirPlane> AirPlaneListar(){
		return this.negAirPlane.listar();
	}
	public void AirPlaneRemover(AirPlane a){
		this.negAirPlane.remover(a);
	}
	
	//################### Customer ####################
	public void CustomerCadastrar(Customer a){
		this.negCustomer.cadastrar(a);
	}
	public void CustomerEditar(Customer a){
		this.negCustomer.editar(a);
	}
	public Customer CustomerBuscar(int id){
		return this.negCustomer.pesquisar(id);
	}
	public Collection<Customer> CustomerListar(){
		return this.negCustomer.listar();
	}
	public void CustomerRemover(Customer a){
		this.negCustomer.remover(a);
	}
	
	//################### Destination ####################
	public void DestinationCadastrar(Destination a){
		this.negDestination.cadastrar(a);
	}
	public void DestinationEditar(Destination a){
		this.negDestination.editar(a);
	}
	public Destination DestinationBuscar(int id){
		return this.negDestination.pesquisar(id);
	}
	public Collection<Destination> DestinationListar(){
		return this.negDestination.listar();
	}
	public void DestinationRemover(Destination a){
		this.negDestination.remover(a);
	}
	
	//################### Flight ####################
	public void FlightCadastrar(Flight a){
		this.negFlight.cadastrar(a);
	}
	public void FlightEditar(Flight a){
		this.negFlight.editar(a);
	}
	public Flight FlightBuscar(int id){
		return this.negFlight.pesquisar(id);
	}
	public Collection<Flight> FlightListar(){
		return this.negFlight.listar();
	}
	public void FlightRemover(Flight a){
		this.negFlight.remover(a);
	}
	
	//################### Payment ####################
	public void PaymentCadastrar(Payment a){
		this.negPayment.cadastrar(a);
	}
	public void PaymentEditar(Payment a){
		this.negPayment.editar(a);
	}
	public Payment PaymentBuscar(int id){
		return this.negPayment.pesquisar(id);
	}
	public Collection<Payment> PaymentListar(){
		return this.negPayment.listar();
	}
	public void PaymentRemover(Payment a){
		this.negPayment.remover(a);
	}
	
	//################### Purchase ####################
	public void PurchaseCadastrar(Purchase a){
		this.negPurchase.cadastrar(a);
	}
	public void PurchaseEditar(Purchase a){
		this.negPurchase.editar(a);
	}
	public Purchase PurchaseBuscar(int id){
		return this.negPurchase.pesquisar(id);
	}
	public Collection<Purchase> PurchaseListar(){
		return this.negPurchase.listar();
	}
	public void PurchaseRemover(Purchase a){
		this.negPurchase.remover(a);
	}
	
	//################### Ticket ####################
	public void TicketCadastrar(Ticket a){
		this.negTicket.cadastrar(a);
	}
	public void TicketEditar(Ticket a){
		this.negTicket.editar(a);
	}
	public Ticket TicketBuscar(int id){
		return this.negTicket.pesquisar(id);
	}
	public Collection<Ticket> TicketListar(){
		return this.negTicket.listar();
	}
	public void TicketRemover(Ticket a){
		this.negTicket.remover(a);
	}
	
	//################### Tripulation ####################
	public void TripulationCadastrar(Tripulation a){
		this.negTripulation.cadastrar(a);
	}
	public void TripulationEditar(Tripulation a){
		this.negTripulation.editar(a);
	}
	public Tripulation TripulationBuscar(int id){
		return this.negTripulation.pesquisar(id);
	}
	public Collection<Tripulation> TripulationListar(){
		return this.negTripulation.listar();
	}
	public void TripulationRemover(Tripulation a){
		this.negTripulation.remover(a);
	}
	
	//################### User ####################
	public void UserCadastrar(User a){
		this.negUser.cadastrar(a);
	}
	public void UserEditar(User a){
		this.negUser.editar(a);
	}
	public User UserBuscar(int id){
		return this.negUser.pesquisar(id);
	}
	public Collection<User> UserListar(){
		return this.negUser.listar();
	}
	public void UserRemover(User a){
		this.negUser.remover(a);
	}
}
