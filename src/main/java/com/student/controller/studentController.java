package com.student.controller;

import java.util.List;

import javax.validation.Valid;

import com.student.GlobalException.GlobalException;
import com.student.dto.studentDTO;
import com.student.model.studentModel;
import com.student.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class studentController {
	
	@Autowired
	private studentService service;
	
	@PostMapping("/add")
	
	public ResponseEntity<studentModel> addStudent(@RequestBody @Valid studentDTO s1){
		return new ResponseEntity<>(service.addStudent(s1),HttpStatus.OK);
	}
	
	@GetMapping("/retrive")
	public ResponseEntity<List<studentModel>> getStudent(){
		
		return new ResponseEntity<>(service.getStudent(),HttpStatus.ACCEPTED);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<studentModel> deleteStudent(@PathVariable int id) throws GlobalException {
			
			return new ResponseEntity<>(service.deleteStudent(id),HttpStatus.ACCEPTED);
		
		}
	
	@PutMapping("/update")
	public ResponseEntity<studentModel> updateStudent(@RequestBody @Valid studentDTO s1){
	
		return new ResponseEntity<>(service.addStudent(s1),HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<studentModel> getStudent(@PathVariable int id) throws GlobalException{
		return new ResponseEntity<>(service.getStudent(id),HttpStatus.OK);
	}
}
