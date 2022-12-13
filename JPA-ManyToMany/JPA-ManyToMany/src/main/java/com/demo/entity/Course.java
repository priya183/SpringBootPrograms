package com.demo.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private int id;
	private String title;
	private int fee;
	
	@ManyToMany(mappedBy="course",fetch=FetchType.LAZY)
	//bind jason to the object
	@JsonBackReference
	private Set<Student> students;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Course(int id, String title, int fee, Set<Student> students) {
		super();
		this.id = id;
		this.title = title;
		this.fee = fee;
		this.students = students;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", fee=" + fee + ", students=" + students + "]";
	}
	
	

}
