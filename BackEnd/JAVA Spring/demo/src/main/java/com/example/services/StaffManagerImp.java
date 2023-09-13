package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Staff;
import com.example.repositories.StaffRepository;

@Service
public class StaffManagerImp implements StaffManager {

	@Autowired
	StaffRepository srep;

	@Override
	public void addStaff(Staff s) {
		// TODO Auto-generated method stub
		srep.save(s);
	}

	@Override
	public List<Staff> getStaff() {
		// TODO Auto-generated method stub

		return srep.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		srep.deleteById(id);
	}

	@Override
	public void update(Staff s, int id) {
		// TODO Auto-generated method stub
		srep.update(s.getStaff_name(), s.getPhoto_url(), s.getStaff_mobile(), s.getStaff_email(), 
				s.getStaff_username(), s.getStaff_password(), s.getStaff_role(), id);
	}

	@Override
	public Optional<Staff> getStaff(int id) {
		// TODO Auto-generated method stub
		return srep.findById(id);
	}

}