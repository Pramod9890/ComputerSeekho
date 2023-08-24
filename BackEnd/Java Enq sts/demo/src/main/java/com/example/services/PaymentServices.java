package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.example.entities.Payment;

public interface PaymentServices {

	void addPayment(Payment payment);
	void deletePayment(int id);
	List<Payment> getAllPayment ();
	Optional<Payment> getPaymentbyID(int id);
	List<Payment> paymentByStdID(int studentid);
//	List<Payment> paymentByBatchID(int batchid);
}
