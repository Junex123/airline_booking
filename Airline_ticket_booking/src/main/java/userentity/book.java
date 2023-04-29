package userentity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="booking")
public class book implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
int id;

@Column(name="class")
String class1;

@Column(name="seat")
String seat;

@Column(name="adult")
String adult;

@Column(name="children")
String child;

@Column(name="infant")
String infant;

public String getClass1() {
	return class1;
}

public void setClass1(String class1) {
	this.class1 = class1;
}

public String getSeat() {
	return seat;
}

public void setSeat(String seat) {
	this.seat = seat;
}

public String getAdult() {
	return adult;
}

public void setAdult(String adult) {
	this.adult = adult;
}

public String getChild() {
	return child;
}

public void setChild(String child) {
	this.child = child;
}

public String getInfant() {
	return infant;
}

public void setInfant(String infant) {
	this.infant = infant;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

}
