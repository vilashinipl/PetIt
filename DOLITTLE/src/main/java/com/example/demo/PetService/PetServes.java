package com.example.demo.PetService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.PetModel.PetDetails;
import com.example.demo.PetRepository.PetRepo;

@Service
public class PetServes {
	@Autowired
	PetRepo repository;
	public String addPetit(PetDetails petit)
	{
		repository.save(petit);
		return "Added Successfully";
	}
	public List<PetDetails> getPetit()
	{
		return repository.findAll();
	}
	public Optional<PetDetails> getPetitById(String Name)
	{
		return repository.findById(Name);
	}
	public String updatePetit(PetDetails petit)
	{
		repository.save(petit);
		return "Updated Successfully";
	}
	public String deleteByRequestParamId(String Name)
	{
		repository.deleteById(Name);
		return "Deleted Successfully";
	}
	
}
