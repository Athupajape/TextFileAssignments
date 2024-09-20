package Assignments;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment4 {
	
	public void writeDataInRange(int startrange,int endrange) throws IOException {
		
		File f=new File("../TextExcelProj/AssignmentFile4.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		for(int i=startrange;i<=endrange;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter data to enter in row "+i+ ":");
			String s=sc.nextLine();
			bw.write(s);
			bw.newLine();
		}
		bw.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		Assignment4 obj=new Assignment4();
		obj.writeDataInRange(2,4);
	}
}
