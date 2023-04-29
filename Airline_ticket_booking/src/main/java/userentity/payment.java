package userentity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="paymentcard")
public class payment implements Serializable {
	 private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 int id;
	 
	 @Column(name="card_name")
	 String name;
	 
	 @Column(name="card_no")
	 String no;
	 
	 @Column(name="card_exmonth")
	 String exmonth;
	 
	 @Column(name="card_exyear")
	 String exyear;
	 
	 @Column(name="card_cvv")
	 String cvv;
	 
	 @Column(name="card_state")
	 String state;
	 
	 @Column(name="card_zipcode")
	 String zipcode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getExmonth() {
		return exmonth;
	}
	public void setExmonth(String exmonth) {
		this.exmonth = exmonth;
	}
	public String getExyear() {
		return exyear;
	}
	public void setExyear(String exyear) {
		this.exyear = exyear;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	 
	 
}
