package com.chainsys.file;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;


public class FileOperations {

	public static void main(String[] args) throws IOException {
		  Createfile();
	      renamefile();
		  appendfile();
		  readfile();
		  DeleteFile();
		 Copy();
		 Move();
		 modify();
		
	}

private static void modify() throws IOException {
	    FileWriter f = new FileWriter("D:\\Java Training SW\\sansa.txt");
	    try (FileWriter filewriter = new FileWriter("D:\\Java Training SW\\sansa.txt");) {
	        f.write("hello mr.venkat");
	        f.close();
	        System.out.println("Modify the file");
	    } catch (Exception e) {
	        System.out.println("Error");
	    }

	}
	
		
	

public static void Move() {
    
    File SourceFile=new File("D:\\Java Training SW\\zoe1.txt");
    File DestinationFile=new File("D:\\Java Training SW\\New folder"); 
    try {
        Files.copy(SourceFile.toPath(),DestinationFile.toPath() ,StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied Successfully");
    } catch(IOException e) {
        e.printStackTrace();
    }
}

		 
public static void Copy()
{
    File zoe1=new File("D:\\Java Training SW\\zoe1"); 
    File zoe2=new File("D:\\Java Training SW\\zoe2"); 
    FileInputStream fileInputStream = null;
    FileOutputStream fileOutputStream = null;
         
        
    try {
        fileInputStream = new FileInputStream(zoe1);
        fileOutputStream = new FileOutputStream(zoe2);
    } catch (IOException e) {
        e.printStackTrace();
    }
}


private static void DeleteFile() {
	File zoe1 = new File("D:\\Java Training SW\\sansa.txt");
	System.out.println(zoe1.delete());
	
	 
	}


private static void renamefile() {
		// TODO Auto-generated method stub
	 File oldfile=new File("D:\\Java Training SW\\zoe1.txt");
	 File newfile=new File("D:\\Java Training SW\\sansa.txt");
	 
	 if(oldfile.renameTo(newfile)) {
		 System.out.println("Old file was renamed");
	 }
	 else {
		 System.out.println("Old file was not renamed");
	 }
		
	}
private static void Createfile() 
{
		// TODO Auto-generated method stub
	File zoe=new File("D:\\Java Training SW\\zoe1.txt"); 
	try {
		zoe.createNewFile();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
private static void appendfile() {
	
 
 try {
	 FileWriter Writer = new FileWriter("D:\\Java Training SW\\sansa.txt", true);
	 Writer.append("This is sansa");
	 Writer.close();
 }
 catch(IOException e) {
	 System.out.println(e);
 
 }
}


private static void readfile() throws IOException {
	
        try {
              File zoe = new File("D:\\Java Training SW\\sansa.txt");
              Scanner myReader = new Scanner(zoe);
              while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
              }
              myReader.close();
            } catch (FileNotFoundException e) {
              System.out.println("An error occurred.");
              e.printStackTrace();
    }

}
}









 
	

	

