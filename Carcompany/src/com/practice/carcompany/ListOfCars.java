package com.practice.carcompany;
/*
 * 14.Car company stock maintenance & buying using collections
a. Add a main car company --> it should have type of cars ---> Each type should have list of cars & quantity
Ex: Mercedes --> SUV , Sedan , Compact SUV , crossover etc --> SUV{GLC 330D , GLE 220D , GLD 450}, 
Hatchback(Glc 200, E class, c class), Coupe{530d}
b. one user can register and select a type of car and buy it , on buying that specific count 
should be decreased & in console we have to show the details & generate a txt file with all details.
c.Initial data has to be read from Excel file
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class ListOfCars {
	
	public void List(ArrayList<String> al)
	{
		
		HashMap<String,Integer> Ford=new HashMap<String ,Integer>();
		Ford.put("Ford EcoSport	",12);
		
		Ford.put("Ford Endeavoud",9);
		Ford.put("Ford Figo	",7);
		Ford.put("Ford Aspire",16);
		Ford.put("Ford respire",10);
		
		HashMap<String,Integer>Benz =new HashMap<String ,Integer>();
		Benz.put("Benz GLB",12);
		Benz.put("Benz EQS",8);
		Benz.put("Benz EQSSUV ",6);
		Benz.put("Benz EQA ",4);
		HashMap<String,Integer>TataMotors =new HashMap<String ,Integer>();
		TataMotors.put("Tata Tiago",3);
		TataMotors.put("Tata Tigor",2);
		TataMotors.put("Tata Harrier ",9);
		TataMotors.put("Tata Altroz ",1);
		
	}

}
