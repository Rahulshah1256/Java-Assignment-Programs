package com.rahul.java.assignment;

import java.io.FileWriter;

class Write_File {
public static void main(String args[]) {

  String data = "This is the data in the output file";
  try {
  
    FileWriter output = new FileWriter("output.txt");

    output.write(data);
    System.out.println("Data is written to the file.");

    output.close();
  }
  catch (Exception e) {
    e.getStackTrace();
  }
}
}