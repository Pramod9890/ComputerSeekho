//package com.example.entityPayment;
//
//import java.util.Set;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "PaymentTypeMaster")
//public class PaymentTypeMaster {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int payment_typeId;
//	private String payment_type_desc;
//	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="payment_type_master_ID",referencedColumnName="payment_typeID" )
//	private Set<Payment> payment;
//
//	public int getPayment_typeId() {
//		return payment_typeId;
//	}
//
//	public void setPayment_typeId(int payment_typeId) {
//		this.payment_typeId = payment_typeId;
//	}
//
//	public String getPayment_type_desc() {
//		return payment_type_desc;
//	}
//
//	public void setPayment_type_desc(String payment_type_desc) {
//		this.payment_type_desc = payment_type_desc;
//	}
//
//	public Set<Payment> getPayment() {
//		return payment;
//	}
//
//	public void setPayment(Set<Payment> payment) {
//		this.payment = payment;
//	}
//
//	public PaymentTypeMaster() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//
//	
//	
//	
//	
//	
//}
