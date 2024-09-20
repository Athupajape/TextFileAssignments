package Text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClassA {

	public void readData() throws IOException {
		File f= new File("../TextExcelProj/datafile1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
//		int a;
//		while((a=fr.read())!=-1) {
//			System.out.println((char)a);
//		}
		
		String s;
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
		
	}
	
	public void writeData() throws IOException {
		File f= new File("../TextExcelProj/datafile1.txt");
		FileWriter fw=new FileWriter(f, true);
		BufferedWriter br=new BufferedWriter(fw);
//		br.write("This is the first Line");
		br.newLine();
		for(int i=1;i<=10;i++) {
			br.write("Atharva Paranjape");
			br.newLine();
		}
		br.close();
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		ClassA obj=new ClassA();
//		obj.readData();
		obj.writeData();
	}
	
}
