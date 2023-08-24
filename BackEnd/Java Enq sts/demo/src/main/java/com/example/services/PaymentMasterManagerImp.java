//package com.example.servicesPayment;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.entityPayment.PaymentMaster;
//import com.example.repositoryPayment.PaymentMasterRepository;
//
//
//
//
//@Service
//public class PaymentMasterManagerImp implements PaymentMasterManager {
//	@Autowired
//	private PaymentMasterRepository paymentmaster;
//
//	@Override
//	public void addPayment(PaymentMaster payment) {
//		// TODO Auto-generated method stub
//		paymentmaster.save(payment);
//	}
//
//	@Override
//	public List<PaymentMaster> getAllPayment() {
//		// TODO Auto-generated method stub
//		return paymentmaster.findAll();
//	}
//
//	@Override
//	public Optional<PaymentMaster> getPaymentMaster(int id) {
//		// TODO Auto-generated method stub
//		return paymentmaster.findById(id);
//	}
//
//	@Override
//	public void delete(int id) {
//		// TODO Auto-generated method stub
//		paymentmaster.deleteById(id);
//		
//	}
//
//}
