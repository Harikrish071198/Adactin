package org.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SampleJava {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader=new FileReader("C:\\Users\\harik\\eclipse-workspace\\GitHub\\src\\test\\resources\\Read.json");
		
		JSONParser jsonParser = new JSONParser();
		
		Object parse = jsonParser.parse(fileReader);
		
		//Type Casting between Java object and JSONObject
		
		//syntax LowerOrder objname=(lowerOrder) higherOrderObjName;
		JSONObject jsonObject=(JSONObject)parse;
		
		System.out.println(jsonObject.get("name"));
		
		System.out.println(jsonObject.get("age"));
		
		System.out.println(jsonObject.get("status"));
		
		System.out.println(jsonObject.get("address"));
		
		System.out.println(jsonObject.get("course"));
		
	}
}
