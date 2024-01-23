package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FamilyVO;
import com.example.demo.repo.FamilyRepo;
@Service
public class FamilyServiceImpl implements FamilyService{
	@Autowired
	FamilyRepo familyRepo ;

	@Override
	public List<FamilyVO> GetAllDetails() {
		// TODO Auto-generated method stub
		return familyRepo.findAll();
	}

	@Override
	public FamilyVO GetAllDetailsById(int id) {
		// TODO Auto-generated method stub
		return familyRepo.findById(id).orElse(null);
				}

	@Override
	public FamilyVO createDeatails(FamilyVO familyVO) {
		// TODO Auto-generated method stub
		return familyRepo.save(familyVO);
	}


	@Override
	public FamilyVO deleteDetails() {
		// TODO Auto-generated method stub
		return familyRepo.save(null);
	}

	@Override
	public FamilyVO updateFamily(int id, FamilyVO familyVO) {
		// TODO Auto-generated method stub
		return null;
	}

}

