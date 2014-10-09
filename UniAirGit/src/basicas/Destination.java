package basicas;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Destination {
	@Id
	private String iata;
	private String airportName;
	private String city;
	private Date logAt;
	private int userId;
	@OneToMany(mappedBy = "to", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection<Flight> toDestination;
	@OneToMany(mappedBy = "from", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection<Flight> fromDestination;
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	public Collection<Flight> getTo() {
		return toDestination;
	}
	public void setTo(Collection<Flight> toDestination) {
		this.toDestination = toDestination;
	}
	public Collection<Flight> getFrom() {
		return fromDestination;
	}
	public void setFrom(Collection<Flight> fromDestination) {
		this.fromDestination = fromDestination;
	}
}