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
//
//@Entity
//public class PaymentMaster {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int payment_master_id;
//	private double course_fees;
//
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "payment_master_id")
//	private Set<Payment> payment;
//
//	public int getPayment_master_id() {
//		return payment_master_id;
//	}
//
//	public void setPayment_master_id(int payment_master_id) {
//		this.payment_master_id = payment_master_id;
//	}
//
//	public double getCourse_fees() {
//		return course_fees;
//	}
//
//	public void setCourse_fees(double course_fees) {
//		this.course_fees = course_fees;
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
//	public PaymentMaster() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	
//
//}
