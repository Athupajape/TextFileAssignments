package Assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment5 {

	public void CopyPaste() throws IOException {
		
		//Read from file
		File f=new File("../TextExcelProj/AssignmentFile5.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		File fs=new File("../TextExcelProj/AssignmentFile5write.txt");
		FileWriter fw=new FileWriter(fs);
		BufferedWriter bw=new BufferedWriter(fw);
		
		String s;
		while((s=br.readLine())!=null) {
			bw.write(s);
			bw.newLine();
		}
		bw.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		Assignment5 obj=new Assignment5();
		obj.CopyPaste();
	}
	
}
