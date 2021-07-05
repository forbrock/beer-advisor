package com.example.model;

import java.util.List;
import java.util.Arrays;

public class BeerExpertTest {
	public static void main(String[] args) {
		List<String> lightList = Arrays.asList("Allesgut", "Kronenbourg 1664 Blanc", "Черниговское Белое");
		BeerExpert beerExpert = new BeerExpert();
		System.out.println(lightList.equals(beerExpert.getBrands("light")));
	}
}