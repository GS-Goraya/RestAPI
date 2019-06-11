package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try 
  {
      // create object mapper
	  ObjectMapper mapper=new ObjectMapper();
	  // read json file and map/convert  to java Pojo
	  //data simple-lite.json
	  Student mystudent =mapper.readValue(new File ("data/sample-lite.json" ),Student.class);
	 
	  //print first name and last name 
	  System.out.println("FirstName "+ mystudent.getFirstName());
	  System.out.println("LastName "+ mystudent.getLastName());
	  
  }
  
  catch(Exception ex)
  {
	  ex.printStackTrace();
  }
  
  
	}

}
