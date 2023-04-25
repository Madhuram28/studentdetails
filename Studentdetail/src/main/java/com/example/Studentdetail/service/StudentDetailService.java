package com.example.Studentdetail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Studentdetail.model.StudentDetail;
import com.example.Studentdetail.repository.StudentDetailRepository;

@Service
public class StudentDetailService {
    @Autowired
    StudentDetailRepository studentDetailservice;
	
	public List<StudentDetail> getAllStudentdetail()
	{
		List<StudentDetail>studentDetailList=studentDetailservice.findAll();
		return studentDetailList;
	}
	public StudentDetail saveStudentdetail(StudentDetail s) {
		return studentDetailservice.save(s);
	}
	
	public void deleteStudentDetail(int age) {
		studentDetailservice.deleteById(age);
	}
	}

