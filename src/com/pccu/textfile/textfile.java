 package com.pccu.textfile;
 import java.io.FileNotFoundException;
 import java.io.FileReader;
 import java.io.FileWriter;
 import java.io.IOException;
 public class textfile {
 public static void main(String[] args) {
 FileReader reader = null;
 FileWriter writer = null;
 try {
 reader = new FileReader("src/textfile/abstract1.txt");
 writer = new FileWriter("src/textfile/clonedabstract1.txt");
 int flag = 0;
 while ((flag = reader.read()) != -1) {
 writer.write(flag);
 }
 } catch (FileNotFoundException e) {
 e.printStackTrace();
 e.printStackTrace();
 } catch (IOException e) {
 } finally {
	 if (writer != null) {
	 try {
		  writer.close();
		  } catch (IOException e) {
		  e.printStackTrace();
		  }
		  }
		  if (reader != null) {
		  try {
		  reader.close();
		  } catch (IOException e) {
		  e.printStackTrace();
		  }
		  }
		  }
		  }
		  }