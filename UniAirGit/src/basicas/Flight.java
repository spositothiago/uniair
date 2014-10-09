package basicas;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


public class Flight {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="flightId")
	private int id;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="airplaneId", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private AirPlane airPlane;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="iata", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Destination from;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="iata", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Destination to;
	private Date flightDate;
	private Date LandingDate;
	private String code;
	private Date logAt;
	private int userId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AirPlane getAirPlane() {
		return airPlane;
	}
	public void setAirPlane(AirPlane airPlane) {
		this.airPlane = airPlane;
	}
	public Destination getFrom() {
		return from;
	}
	public void setFrom(Destination from) {
		this.from = from;
	}
	public Destination getTo() {
		return to;
	}
	public void setTo(Destination to) {
		this.to = to;
	}
	public Date getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}
	public Date getLandingDate() {
		return LandingDate;
	}
	public void setLandingDate(Date landingDate) {
		LandingDate = landingDate;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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