package com.example.model;

import java.util.List;
import java.util.ArrayList;

public class BeerExpert {
	
	public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<>();
		switch (color) {
			case "light":
				brands.add("Allesgut");
				brands.add("Kronenbourg 1664 Blanc");
				brands.add("Черниговское Белое");
				break;
			case "dark":
				brands.add("Braunwald");
				brands.add("BIERWELLE \"BITTER\"");
				brands.add("Kozel");
				break;
		}
		return brands;
	}
}