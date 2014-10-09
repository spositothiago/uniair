package basicas;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class PurchaseTicket {
	@OneToMany(mappedBy = "purchaseTicketp", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Purchase purchase;
	@OneToMany(mappedBy = "purchaseTickett", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Ticket ticket;
	private Date logAt;
	private int userId;
	public Purchase getPurchase() {
		return purchase;
	}
	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public Date getLogAt() {
		return logAt;
	}
	public void setLogAt(Date logAt) {
		this.logAt = logAt;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}