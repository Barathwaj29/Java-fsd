package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackDAO {
	@Autowired
	FeedbackRepo repo;
	
	public Feedback insert(Feedback d) {
		return repo.save(d);
	}
	public List <Feedback> insertall(List <Feedback> d){
		return repo.saveAll(d);
	}
	public List<Feedback> getall(){
		return repo.findAll();
	}




}
