package Assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment3 {
	
	public void writeData(int rownum) throws IOException {
		
		File f=new File("../TextExcelProj/AssignmentFile3.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		
		for(int i=1;i<=rownum;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter data to enter in row "+i+ ":");
			String s=sc.nextLine();
			bw.write(s);
			bw.newLine();
		}
		bw.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		Assignment3 obj=new Assignment3();
		obj.writeData(2);
	}
}
