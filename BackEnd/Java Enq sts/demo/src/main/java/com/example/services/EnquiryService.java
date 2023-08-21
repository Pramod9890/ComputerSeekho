package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.entities.Enquiry;
@Service
public interface EnquiryService {

	public void Formsubmit(@RequestBody Enquiry enquiry);
//	public void DeleteById(@PathVariable int id);
	public List<Enquiry> GetAll();
	public Optional<Enquiry> FindById(@PathVariable int id);
	public Optional<Enquiry> GetByName(String name);
	public void update(Enquiry e,int id);
}
