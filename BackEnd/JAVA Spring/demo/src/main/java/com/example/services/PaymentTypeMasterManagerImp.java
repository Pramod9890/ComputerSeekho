//package com.example.servicesPayment;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.entityPayment.PaymentTypeMaster;
//import com.example.repositoryPayment.PaymentTypeMasterRepository;
//
//
//@Service
//public class PaymentTypeMasterManagerImp implements PaymentTypeMasterManager {
//
//	@Autowired
//	private PaymentTypeMasterRepository repository;
//
//	@Override
//	public List<PaymentTypeMaster> getAllPaymenttype() {
//		// TODO Auto-generated method stub
//		return repository.findAll();
//	}
//
//	@Override
//	public Optional<PaymentTypeMaster> getPaymenttypeById(int id) {
//		// TODO Auto-generated method stub
//		return repository.findById(id);
//	}
//
//	@Override
//	public void deletPaymentDetailsMaster(int id) {
//		// TODO Auto-generated method stub
//		repository.deleteById(id);
//		
//	}
//
//	@Override
//	public void AddPaymenttype(PaymentTypeMaster paytypemaster) {
//
//		repository.save(paytypemaster);
//		
//	}
//
//	
//
//}
