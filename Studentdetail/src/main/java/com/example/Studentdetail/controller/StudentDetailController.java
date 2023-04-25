package com.example.Studentdetail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Studentdetail.model.StudentDetail;
import com.example.Studentdetail.service.StudentDetailService;

@RestController
public class StudentDetailController {

	@Autowired
	StudentDetailService StudentdetailController;
	
	@GetMapping("/fetchstudents")
	public List<StudentDetail> getAllStudentdetail()
	{
		List<StudentDetail>StudentdetailList=StudentdetailController.getAllStudentdetail();
		return StudentdetailList;
	}
	@PostMapping("/save-student")
	public StudentDetail saveStudentdetail(@RequestBody StudentDetail s)
	{
	  return StudentdetailController.saveStudentdetail(s);
	}
	
  @PutMapping("/update-student")
  public StudentDetail update(@RequestBody StudentDetail s) {
  return StudentdetailController.saveStudentdetail(s);
}
  @DeleteMapping("/delete-student/{regno}")
  public void deleteStudentDetail(@PathVariable("regno") int id) {
	  StudentdetailController.deleteStudentDetail(id);
  }
}
