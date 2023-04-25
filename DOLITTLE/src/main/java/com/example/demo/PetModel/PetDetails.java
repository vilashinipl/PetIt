package com.example.demo.PetModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PetDetails {
	@Id
	private String Name;
	private String breed;
	private int age;
	private String features;
	private int price;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "PetDetails [Name=" + Name + ", breed=" + breed + ", age=" + age + ", features=" + features + ", price="
				+ price + "]";
	}
}

	