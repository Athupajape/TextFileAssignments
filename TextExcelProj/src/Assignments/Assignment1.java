package Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment1 {

	public void readData(int rownum) throws IOException {
		File f=new File("../TextExcelProj/AssignmentFile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String s;
		int count=1;
		while((s=br.readLine())!=null) {
			if(count==rownum) {
				System.out.println(s);
				break;
			}
			count++;
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		Assignment1 obj=new Assignment1();
		obj.readData(2);
	}
	
	
}
