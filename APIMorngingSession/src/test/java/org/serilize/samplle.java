package org.serilize;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class samplle {
public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
	
	System.out.println("Berfore fileeeeeeeee");
	File f=new File("C:\\Users\\harik\\eclipse-workspace\\APIMorngingSession\\src\\test\\java\\write.json");
	System.out.println("After fileeeeeeeeeeeeeee");
	ObjectMapper objectMapper=new ObjectMapper();
	ArrayList<Batter> batter=new ArrayList();
	Batter batter2 = new Batter("1001", "Regular");
	Batter batter3= new Batter("1002" , "Choclate");
	Batter batter4=new Batter("1003","Blueberry");
	Batter batter5=new Batter("1004","Devil's Food");
	batter.add(batter2);
	batter.add(batter3);
	batter.add(batter4);
	batter.add(batter5);
	
	Batters batters=new Batters(batter);
	
	ArrayList<Topping> topping = new ArrayList();
	topping.add(new Topping("5001", "Java"));
	topping.add(new Topping("5002","Python"));
	topping.add(new Topping("1003","Selenium"));
	
	Root root =new Root("1001","donut","cake", 0.55, batters , topping) ;
	System.out.println("befire wtrioeeeeeeeeeeeeeeee");
	objectMapper.writeValue(f, root);
	System.out.println("writeeeeeeeeeeeeeeeeeeeeeee");
	
	
	}
}
