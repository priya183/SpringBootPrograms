package com.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>{
	
	List<Course> findByFeeLessThan(int fee);

}
