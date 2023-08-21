package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Course;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface CourseRepository extends JpaRepository<Course, Integer>{
	@Modifying
	@Query("update Course c set c.course_name = :name, c.course_description=:description,c.course_duration = :duration, c.course_syllabus=:syllabus where c.course_id = :id")
	void update(@Param("name") String name,@Param("description")String description,@Param("duration") int duration,@Param("syllabus") String syllabus,@Param("id")int id);
	
}
