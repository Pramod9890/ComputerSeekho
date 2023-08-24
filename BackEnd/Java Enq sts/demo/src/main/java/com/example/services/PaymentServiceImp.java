package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Payment;
import com.example.repositories.PaymentRepository;


@Service
public class PaymentServiceImp implements PaymentServices {
	
	@Autowired
	private PaymentRepository payment_repository;
	

	@Override
	public void addPayment(Payment payment) {
		// TODO Auto-generated method stub
		payment_repository.save(payment);
		
		
	}

	@Override
	public void deletePayment(int id) {
		// TODO Auto-generated method stub
		payment_repository.deleteById(id);
		
	}

	@Override
	public List<Payment> getAllPayment() {
		// TODO Auto-generated method stub
		List<Payment> list = payment_repository.findAll();
		return list;
	}

	@Override
	public Optional<Payment> getPaymentbyID(int id) {
		// TODO Auto-generated method stub
		Optional<Payment> payment = payment_repository.findById(id);
		return payment;
	}

	@Override
	public  List<Payment> paymentByStdID(int studentid) {
		// TODO Auto-generated method stub
		List<Payment> stdPaymet = payment_repository.paymentByStdID(studentid);	
		return stdPaymet ;
	}
//
//	@Override
//	public List<Payment> paymentByBatchID(int batchid) {
//		// TODO Auto-generated method stub
//		List<Payment> batchPaymet = payment_repository.paymentByBatchID(batchid);
//		return batchPaymet;
//	}

}
