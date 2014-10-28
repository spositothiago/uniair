package basicas;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customerId")
	private int id;
	private String name;
	private String cpf;
	private String email;
	private Date birthday;
	private String gender;
	private String phone;
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection<Ticket> ticketsCustomer;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection<Purchase> purchases;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Collection<Ticket> getTickets() {
		return ticketsCustomer;
	}
	public void setTickets(Collection<Ticket> tickets) {
		this.ticketsCustomer = tickets;
	}
	public Collection<Purchase> getPurchases() {
		return purchases;
	}
	public void setPurchases(Collection<Purchase> purchases) {
		this.purchases = purchases;
	}
}