package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Enquiry;
import com.example.repositories.EnquriyRepository;

@Service
public class EnquiryImpl implements EnquiryService {

	@Autowired
	private EnquriyRepository e;

	public void Formsubmit(Enquiry enquiry) {
		e.save(enquiry);
	//	e.submit(String enquirer_name,String enquirer_email_id,String enquirer_mobile,String enquirer_address,String enquirer_query,Date date,boolean b,int enquiry_id);
	}

//	public void DeleteById(int id) {
//		e.deleteById(id);
//	}

	public List<Enquiry> GetAll() {
		return e.findAll();
	}

	public Optional<Enquiry> FindById(int id) {
		return e.findById(id);
	}

	@Override
	public Optional<Enquiry> GetByName(String name) {

		Optional<Enquiry> p = e.findByName(name);
		return p;
	}
	
	public void update(Enquiry enq ,int id)
	{
		e.update(enq.getEnquirer_name(),enq.getEnquirer_address(), enq.getEnquirer_mobile(),enq.getEnquirer_email_id(), enq.getEnquirer_query(), enq.getClosure_reason(),enq.getClosure_reasonId(),enq.isEnquiry_processed_flag(), enq.getStudent_name(), enq.getInquiry_counter(),id);
	
	}

}
