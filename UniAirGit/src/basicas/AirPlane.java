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
public class AirPlane {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="airplaneId")
	private int id;
	@OneToMany(mappedBy = "airPlane", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection<Flight> voos;
	private String model;
	private int capacity;
	private int year;
	private Date logAt;
	private int userId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
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
	public Collection<Flight> getVoos() {
		return voos;
	}
	public void setVoos(Collection<Flight> voos) {
		this.voos = voos;
	}
}