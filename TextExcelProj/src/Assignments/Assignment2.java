package Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Assignment2 {
	public void readDataOfRange(int startrange,int endrange) throws IOException {
		File f=new File("../TextExcelProj/AssignmentFile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String s;
		int count=1;
		while((s=br.readLine())!=null) {
			if(count>=startrange && count<=endrange) {
				System.out.println(s);
			}
			count++;
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		Assignment2 obj=new Assignment2();
		obj.readDataOfRange(1,2);
	}
}
