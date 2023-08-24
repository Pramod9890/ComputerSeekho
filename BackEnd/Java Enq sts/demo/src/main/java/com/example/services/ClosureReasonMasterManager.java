package com.example.services;

import java.util.List;

import com.example.entities.ClosureReasonMaster;



public interface ClosureReasonMasterManager {
	void addReason(ClosureReasonMaster c1);
	List<ClosureReasonMaster>getReason();
}
