package com.luv2code.serveletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class studentDataUtil {
	
	
	public static List<student> getStudent(){
		
		//create an empty list
		List<student> students = new ArrayList<>();
		//add sample data
		students.add(new student("sahil","pratap","sahilpratap7200@gmail.com"));
		students.add(new student("Rishi","Bundela","sahilbundela72@gmail.com"));
		students.add(new student("hrishi","pratap","sahilbundela230@gmail.com"));
		//return the list
		
		return students;
	}

}
