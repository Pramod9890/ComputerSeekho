//package com.example.controllerPayment;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.entityPayment.PaymentTypeMaster;
//import com.example.servicesPayment.PaymentTypeMasterManager;
//
//@RestController
//public class PaymentTypeMasterController {
//	
//	@Autowired
//	private PaymentTypeMasterManager servicemanager;
//
//	@GetMapping("/api/request")
//	public List<PaymentTypeMaster> getall() {
//		return servicemanager.getAllPaymenttype();
//
//	}
//
//	@GetMapping("/api/request/{id}")
//	public Optional<PaymentTypeMaster> getbyid(@PathVariable int id) {
//
//		return servicemanager.getPaymenttypeById(id);
//	}
//
//	@PostMapping("/api/request")
//	public void Add(@RequestBody PaymentTypeMaster paytype) {
//		servicemanager.AddPaymenttype(paytype);
//
//	}
//
//	@DeleteMapping("/api/request/{id}")
//	public void deletebyid(@PathVariable int id) {
//		servicemanager.deletPaymentDetailsMaster(id);
//	}
//
//}
