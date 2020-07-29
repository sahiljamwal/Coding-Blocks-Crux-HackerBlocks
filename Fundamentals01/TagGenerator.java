package Fundamentals01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TagGenerator {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner s=new Scanner(new File("/home/sahil/Documents/filled.csv"));
		s.useDelimiter("[,]");
		
		ArrayList<String> filledStudents =new ArrayList<String>();
		while(s.hasNextLine()) {
			String student=s.next();
			filledStudents.add(student.toLowerCase());
		}
		
		
		s=new Scanner(new File("/home/sahil/Documents/total.csv"));
		s.useDelimiter("[,]");
		
		ArrayList<String> totalStudents =new ArrayList<String>();
		while(s.hasNextLine()) {
			String student=s.next();
			totalStudents.add(student.toLowerCase());
		}
		
		for(int student=0;student<filledStudents.size();student++) {
			if(totalStudents.contains(filledStudents.get(student)))
				totalStudents.remove(filledStudents.get(student));
		}
		
		for (String student : totalStudents) {
			System.out.print("@"+student.substring(0, 1).toUpperCase()+student.substring(1)+" ");
		}
		
		
		
		s.close();
	}
}
