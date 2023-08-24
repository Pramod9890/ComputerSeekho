package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.ClosureReasonMaster;
import com.example.services.ClosureReasonMasterManager;




@RestController
public class ClosureReasonMasterController {
	
	@Autowired
	ClosureReasonMasterManager reason;
	
	@GetMapping(value = "/Reason")
	public List<ClosureReasonMaster>get()
	{
		return reason.getReason();
	}
	@PostMapping(value = "/Reason")
	public void add(@RequestBody ClosureReasonMaster c1)
	{
		reason.addReason(c1);
	}

}
