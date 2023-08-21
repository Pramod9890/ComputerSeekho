package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.Staff;

public interface StaffManager {

	void addStaff(Staff s);
	List<Staff> getStaff();
	void delete(int id);
	void update(Staff s,int id);
	Optional<Staff> getStaff(int id);
}
