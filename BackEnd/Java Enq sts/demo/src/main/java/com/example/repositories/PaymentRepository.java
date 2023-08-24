package com.example.repositories;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	
//	@Query(value = "select * from Payment p where p.student_id= :stdid ",nativeQuery = true)
	@Query(value = "select p.* from Payment p , Student s where p.student_id = s.student_id and p.student_id =:stdid",nativeQuery = true)
	List<Payment> paymentByStdID(@Param("stdid") int stdid);
//	
//	@Query(value = "select * from Batch b where b.batch_id=:batchid ",nativeQuery = true)
//	List<Payment> paymentByBatchID(@Param("batchid") int batchid);
	
	//@Query(value = "select * from Payment p , Student s where p.student_id = s.student_id and p.student_id =:stdid",nativeQuery = true)
	
}
