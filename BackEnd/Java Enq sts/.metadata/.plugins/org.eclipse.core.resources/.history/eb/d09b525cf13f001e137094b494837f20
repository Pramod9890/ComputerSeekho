package com.example.repositories;
import jakarta.transaction.Transactional;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Staff;


@Repository
@Transactional
public interface StaffRepository extends JpaRepository<Staff,Integer>{

	@Modifying
	@Query("update Staff s set s.staff_name = :name, s.photo_url= :photo, s.staff_mobile = :mobile, s.staff_email = :email, s.staff_username = :uname, s.staff_password = :pass, s.staff_role = :role where s.staff_id = :id" )
	void update(@Param("name") String name, @Param("photo") String photo,@Param("mobile") BigInteger bigInteger, @Param("email") String email, @Param("uname") String uname, @Param("pass") String pass, @Param("role") String role, @Param("id") int id);
	
	
//	@Query("update Course c set c.course_name = :name, c.course_description=:description,c.course_duration = :duration, c.course_syllabus=:syllabus where c.course_id = :id")
//	void update2(@Param("name") String name,@Param("description")String description,@Param("duration") int duration,@Param("syllabus") String syllabus,@Param("id")int id);
	
}
