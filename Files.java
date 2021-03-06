/* Creating a new file

 import java.io.*;
public class Files{
	public static void main(String[] args) {
		try{
		File f =  new File("F:\\java 567\\Files_java\\prac.txt");
		if(f.createNewFile()){
			System.out.println("File is created.");
		}
		else{
			System.out.println("File exists.");
		}
	}
	catch(Exception e){}
	}
}*/

/*Writing into file

import java.io.*;
public class Files{
	public static void main(String[] args) {
		try{
		String s = "dear";
		byte sc[]= s.getBytes();
		FileOutputStream fos = new FileOutputStream("F:\\java 567\\Files_java\\prac.txt");
				 for(int b=0;b<s.length();b++){
		 	fos.write(sc[b]);
		 }
		 fos.close();
		}
		catch(Exception e){ }
	}
} */

/* Reading frm file

import java.io.*;
public class Files{
	public static void main(String[] args) {
		try{
			FileInputStream fis =  new FileInputStream("F:\\java 567\\Files_java\\prac.txt");
			int s = 0;
			while((s=fis.read())!= -1){
				System.out.print((char)s);
			}
			fis.close();
		}
		catch(Exception e){ }
	}
}
*/

/* Reader class

import java.io.*;
public class Files{
	public static void main(String[] args) {
		try{

		String s = "Close-up";
		
		FileWriter fw = new FileWriter("F:\\java 567\\Files_java\\prac.txt");
		fw.write(s);
		fw.close();
				}

			catch(Exception e){ }
	}
}
*/

/* Write a file
import java.io.*;
public class Files{
	public static void main(String[] args) {
		try{
		
		FileReader fr = new FileReader("F:\\java 567\\Files_java\\prac.txt");
		int a ;
		while((a=fr.read())!= -1){
			System.out.print((char)a);
		}


		fr.close();
				}

			catch(Exception e){ }
	}
}

*/

/*
prg 15
spliting a file 

import java.util.Scanner;
import java.io.*;
import java.io.PrintWriter;
	public class Files{
	public static void main(String[] args) throws IOException{
		try{
		//File f = new File("D:\\filesjava\\Rough.txt");
		Scanner s = new Scanner(new File("F:\\java 567\\Files_java\\prac.txt"));
		String str = s.nextLine();
		String[] str1 = str.split("[.,!-?]");
		for( int i = 0;i<str1.length;i++) {
			System.out.println("text.part"+i+" "+str1[i]);
		}
	}catch(Exception e){}
}}
*/

