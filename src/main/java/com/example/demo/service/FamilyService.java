package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.FamilyVO;

@Service
public interface FamilyService {

	List<FamilyVO> GetAllDetails();

	FamilyVO GetAllDetailsById(int id);

	FamilyVO createDeatails(FamilyVO familyVO);

	FamilyVO updateFamily( int id,FamilyVO familyVO);

	FamilyVO deleteDetails();

	

}

