package basicas;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tripulation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String document;
	private TripulationType tripulationType;
	private Date logAt;
	private int userId;
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
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public TripulationType getTripulationType() {
		return tripulationType;
	}
	public void setTripulationType(TripulationType tripulationType) {
		this.tripulationType = tripulationType;
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