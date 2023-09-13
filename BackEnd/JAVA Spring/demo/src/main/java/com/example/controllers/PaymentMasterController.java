//package com.example.controllerPayment;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.entityPayment.PaymentMaster;
//import com.example.servicesPayment.PaymentMasterManager;
//
//
//
//@RestController
////@CrossOrigin("http://127.0.0.1:*")
//public class PaymentMasterController {
//	@Autowired
//	private PaymentMasterManager manager;
//	
//	@GetMapping(value = "/PaymentMaster")
//	public List<PaymentMaster> getPaymentMaster()
//	{
//		return manager.getAllPayment();
//	}
//	@PostMapping(value = "/PaymentMaster")
//	 public void addpro(@RequestBody PaymentMaster payment)
//	 {
//		manager.addPayment(payment);
//	 }
//	@DeleteMapping(value = "/PaymentMaster/{id}")
//	public void delete(@PathVariable int id)
//	{
//		manager.delete(id);
//	}
//	@GetMapping(value = "/PaymentMaster/{id}")
//	public Optional<PaymentMaster> getImages(@PathVariable int id)
//	 {
//		
//		Optional<PaymentMaster> p = manager.getPaymentMaster(id);
//		return p;
//	 }
//}
