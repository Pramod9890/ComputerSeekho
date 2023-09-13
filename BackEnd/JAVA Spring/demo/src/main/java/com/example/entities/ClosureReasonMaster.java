package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ClosureReasonMaster {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Closure_ReasonID;
	private String Closure_Reason_Desc;
	
	public int getClosure_ReasonID() {
		return Closure_ReasonID;
	}
	public void setClosure_ReasonID(int closure_ReasonID) {
		Closure_ReasonID = closure_ReasonID;
	}
	public String getClosure_Reason_Desc() {
		return Closure_Reason_Desc;
	}
	public void setClosure_Reason_Desc(String closure_Reason_Desc) {
		Closure_Reason_Desc = closure_Reason_Desc;
	}
}
