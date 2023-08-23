package com.example.repositories;


import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entities.Enquiry;

import jakarta.transaction.Transactional;

@Transactional
public interface EnquriyRepository extends JpaRepository<Enquiry, Integer> {
	
	@Query(value = "select * from enquiry where Enquirer_name = :sname",nativeQuery=true)
	Optional<Enquiry> findByName(@Param("sname")String sname);	
	
	@Modifying
	@Query(value="update enquiry e set e.enquirer_name=:name,e.enquirer_address=:address,e.enquirer_mobile=:mobile,e.enquiry_date=:edate,e.enquirer_email_id=:email,e.enquirer_query=:equery,e.closure_reason=:creason,e.closure_reason_id=:clid,e.enquiry_processed_flag=:eflag,e.follow_up_date=DATE_ADD(enquiry_date, INTERVAL 3 DAY),e.student_name=:sname,e.inquiry_counter=:inc where enquiry_id=:id",nativeQuery=true)
	void update(@Param("name")String enquirer_name,@Param("address")String enquirer_address,@Param("mobile")long enquirer_mobile,@Param("edate") Date enquiry_date,@Param("email") String enquirer_email_id,@Param("equery") String enquirer_query,@Param("creason")String closure_reason,@Param("clid")int closure_reason_id,@Param("eflag")boolean enquiry_processed_flag,@Param("sname") String student_name,@Param("inc") int inquiry_counter,@Param("id")int id);
	

}
