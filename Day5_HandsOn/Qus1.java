package Day5_Ass;

import java.io.*;

public class Qus1 {

   public static void main(String[] args) {

	   	File infile = new File("data.txt");
	   	File ofile = new File("data1.txt");

	   	FileReader fr=null;
	   	FileWriter fw=null;

	   	try {
	   		fr=new FileReader(infile);
	   		fw=new FileWriter(ofile);
	   		int ch;
	   		while((ch=fr.read())!=-1)
	   		{
	   			fw.write(ch);
	   		}
	   	}
	   	catch()
	   	{
	   		
	   	}
	   	finally {
	   		try {
	   			fr.close();
	   			fw.close();
	   		}
	   	}
   }  

}