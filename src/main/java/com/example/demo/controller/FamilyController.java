package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.FamilyVO;
import com.example.demo.service.FamilyService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/f")
public class FamilyController {
	@Autowired
	FamilyService familyService;
@GetMapping("/get")
public List<FamilyVO>GetAllDetails(){
	List<FamilyVO>details=familyService.GetAllDetails();
	
	return details;
}
	@GetMapping("/get/{id}")
	public FamilyVO GetAllDetailsById(@PathVariable int id){
		FamilyVO details=familyService.GetAllDetailsById(id);
	return details;
	}
	@PostMapping("/post")
	public FamilyVO createDeatails(@RequestBody FamilyVO familyVO )
	{
		FamilyVO updateDetails=familyService.createDeatails(familyVO);
		return updateDetails;
		
	}
	
	@DeleteMapping("/delete")
	public FamilyVO deleteDetails(@PathVariable int id) {
	FamilyVO delete=familyService.deleteDetails();
	return delete;
}
}