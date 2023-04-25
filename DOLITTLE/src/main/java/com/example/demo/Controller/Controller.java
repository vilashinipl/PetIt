package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.PetModel.PetDetails;
import com.example.demo.PetService.PetServes;

@RestController
@RequestMapping("/petit")
public class Controller {
	@Autowired
	PetServes cusservice;
	@PostMapping(" ")
	public String create(@RequestBody PetDetails petit)
	{
		return cusservice.addPetit(petit);
	}
	@GetMapping(" ")
	public List<PetDetails> read()
	{
		return cusservice.getPetit();
	}
	@GetMapping("/{String}")
	public Optional<PetDetails> readById(@PathVariable String Name)
	{
		return cusservice.getPetitById(Name);
	}
	@PutMapping("/put")
	public String update(@RequestBody PetDetails petit)
	{
		return cusservice.updatePetit(petit);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam ("cid") String Name)
	{
		return cusservice.deleteByRequestParamId(Name);
	}
}