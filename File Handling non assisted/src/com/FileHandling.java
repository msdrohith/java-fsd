package com;


import java.io.BufferedWriter; 
import java.io.FileWriter;
import java.io.IOException; 
import java.io.PrintWriter; 

public class FileHandling{ 
	public static void main(String args[]) throws IOException {
		
		FileWriter fw = null; 
		BufferedWriter bw = null;
		PrintWriter pw = null;

     try {
    	 
    	 fw = new FileWriter("names.txt", true);
    	 bw = new BufferedWriter(fw); 
    	 pw = new PrintWriter(bw);
    	 
         pw.println("Shane");
         pw.println("Root");
         pw.println("Ben");
         
         System.out.println("Data Successfully appended into file"); 
         pw.flush(); }
     finally { 
    	 try {
    		 pw.close();
    		 bw.close(); 
    		 fw.close(); } 
    	 catch (IOException io) {
    	 }
     }
    		 try (FileWriter f = new FileWriter("names.txt", true);
    				 BufferedWriter b = new BufferedWriter(f);
    				 PrintWriter p = new PrintWriter(b);) { 
    			 
    			 p.println("appending text into file"); 
    			 p.println("Gaura"); 
    			 p.println("Bori"); } 
    		 
    		 catch (IOException i) { 
    			 i.printStackTrace(); 
    		 }
    		  		 		 
    	 } 
    	 }
     
     

