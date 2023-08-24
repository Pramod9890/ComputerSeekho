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
	@Query(value="update enquiry e set e.enquirer_name=:name,e.enquirer_address=:address,e.enquirer_mobile=:mobile,e.enquiry_date=current_date(),e.enquirer_email_id=:email,e.enquirer_query=:equery,e.closure_reason=:creason,e.closure_reason_id=:clid,e.enquiry_processed_flag=:eflag,e.follow_up_date=DATE_ADD(enquiry_date, INTERVAL 3 DAY),e.student_name=:sname,e.inquiry_counter=:inc where enquiry_id=:id",nativeQuery=true)
	void update(@Param("name")String enquirer_name,@Param("address")String enquirer_address,@Param("mobile")long enquirer_mobile,@Param("email") String enquirer_email_id,@Param("equery") String enquirer_query,@Param("creason")String closure_reason,@Param("clid")int closure_reason_id,@Param("eflag")boolean enquiry_processed_flag,@Param("sname") String student_name,@Param("inc") int inquiry_counter,@Param("id")int id);
	

	
	@Modifying
	@Query(value="update Enquiry e set e.enquirer_name=:enquirer_name,e.enquirer_email_id=:enquirer_email_id,e.enquirer_mobile=:enquirer_mobile,e.enquirer_address=:enquirer_address,e.enquirer_query=:enquirer_query,e.enquiry_date=:enquiry_date,e.enquiry_processed_flag=:enquiry_processed_flag,e.inquiry_counter=:inquiry_counter,e.Follow_up_date=DATE_ADD(enquiry_date, INTERVAL 3 DAY) where e.enquiry_id=:enquiry_id",nativeQuery = true)
	void submit(@Param("enquirer_name")String enquirer_name,@Param("enquirer_email_id")String enquirer_email_id,@Param("enquirer_mobile")String enquirer_mobile,@Param("enquirer_address")String enquirer_address,@Param("enquirer_query")String enquirer_query,@Param("enquiry_date")Date date,@Param("enquiry_processed_flag")boolean b,@Param("inquiry_counter")int i,@Param("enquiry_id")int id);

}
