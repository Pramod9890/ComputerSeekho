package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Payment;
import com.example.services.PaymentServices;

@RestController
@CrossOrigin("*")
public class paymentController {

	@Autowired
	private PaymentServices payment_services;

	@GetMapping("api/getPayment")
	public List<Payment> getAllPayment() {
		return payment_services.getAllPayment();
	}

	@GetMapping("api/getPaymentbyID/{ID}")
	public Optional<Payment> getPaymentByID(@PathVariable int ID) {
		return payment_services.getPaymentbyID(ID);
	}

	@PostMapping("api/postPayment")
	public void postPayment(@RequestBody Payment payment) {
		payment_services.addPayment(payment);
	}

	@DeleteMapping("api/deletePaymet/{id}")
	public void deletePaymentbyID(@RequestBody int id) {
		payment_services.deletePayment(id);
	}
	
	@GetMapping("api/getPaymentbystdID/{ID}")
	public List<Payment> getPaymentByStdID(@PathVariable int ID) {
		return payment_services.paymentByStdID(ID);
	}
	
//	@GetMapping("api/getPaymentbybatchID/{ID}")
//	public Optional<Payment> getPaymentByID(@PathVariable int ID) {
//		return payment_services.getPaymentbyID(ID);
//	}

}
