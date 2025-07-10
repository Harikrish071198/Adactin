package org.demo11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataIntoTextFile {
	public static void main(String[] args) throws IOException {

	FileReader fr=new FileReader("C:\\Users\\harik\\OneDrive\\Pictures\\Screenshots\\Test123.txt");
	
	BufferedReader br=new BufferedReader(fr);
	
	String str;
	
	while((str=br.readLine())!=null) {
	System.out.println(str);
	}
	br.close();
	}
}
