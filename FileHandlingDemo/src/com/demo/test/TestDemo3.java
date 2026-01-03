package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDemo3 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("firstFile.txt");
				FileOutputStream fos = new FileOutputStream("firstFileCopy.txt");){
			int i = fis.read();
			while(i!=-1)
			{
				fos.write(i);
				i = fis.read();
			}
			fis.close();
			fos.close();
		} 
		 catch (IOException e) {
			System.out.println(e.getMessage());
		}
     
	}

}
