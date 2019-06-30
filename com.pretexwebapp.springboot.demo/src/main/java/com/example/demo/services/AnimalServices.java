package com.example.demo.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.AnimalRepository;

@Service
public class AnimalServices<T, ID extends Serializable> {

	@Autowired
	AnimalRepository<T,ID> repo;

	public T add(T t) {
		return repo.save(t);
	}

	public T get(ID id) {
		return repo.findById(id).orElse(null);
	}

	public T update(T t) {
		return repo.saveAndFlush(t);
	}

	public void delete(ID id) {
		repo.deleteById(id);		
	}
	
	public List<T> list(){
		return repo.findAll();
	}
}  
