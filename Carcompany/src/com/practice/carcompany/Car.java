package com.practice.carcompany;
/*
 * 14.Car company stock maintenance & buying using collections
a. Add a main car company --> it should have type of cars ---> Each type should have list of cars & quantity
Ex: Mercedes --> SUV , Sedan , Compact SUV , crossover etc --> SUV{GLC 330D , GLE 220D , GLD 450},
 Hatchback(Glc 200, E class, c class), Coupe{530d}
b. one user can register and select a type of car and buy it , on buying that specific count should 
be decreased & in console we have to show the details & generate a txt file with all details.
c.Initial data has to be read from Excel file
 */

import java.util.ArrayList;

public class Car {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		ListOfCars obj1=new ListOfCars();
		
				al.add("Ford");
				al.add("Benz");
				al.add("TataMotors");
		
				obj1.List(al);

	}

}
