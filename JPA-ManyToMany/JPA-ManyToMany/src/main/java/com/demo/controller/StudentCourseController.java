package com.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Course;
import com.demo.entity.Student;
import com.demo.repo.CourseRepository;
import com.demo.repo.StudentRepository;

@RestController
@RequestMapping("/student/course")
public class StudentCourseController {
	
	private StudentRepository studentRepo;
	private CourseRepository courseRepo;
	
	public StudentCourseController(StudentRepository studentRepo,CourseRepository courseRepo)
	{
		this.studentRepo=studentRepo;
		this.courseRepo=courseRepo;
	}
	
	@PostMapping("/addStud")
	public Student saveStudentWithCourse(@RequestBody Student student)
	{
	return studentRepo.save(student);	
	}
	@GetMapping("/getAll")
	public List<Student> findAllStudents()
	{
		return studentRepo.findAll();
	}
	@GetMapping("/getById/{id}")
	public Student getById(@PathVariable int id)
	{
		return studentRepo.findById(id).orElse(null);
	}
	@GetMapping("/getByName/{name}")
	public List<Student> findByName(@PathVariable String name)
	{
		return studentRepo.findByName(name);
	}
	@GetMapping("getByFee/{fee}")
	public List<Course> findByFee(@PathVariable int fee)
	{
		return courseRepo.findByFeeLessThan(fee);
	}

}
/*{
    "name":"priya",
    "age":16,
    "course":[
        {
            "title":"CSS",
            "fee":5000
        },
        {
            "title":"HTML",
            "fee":3000
        }

    ]
}
*/
