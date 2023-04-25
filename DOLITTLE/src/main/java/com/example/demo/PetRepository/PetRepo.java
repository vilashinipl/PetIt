package com.example.demo.PetRepository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.PetModel.PetDetails;

public interface PetRepo extends JpaRepository<PetDetails,String>
{
	
}
