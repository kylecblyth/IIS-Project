/**
 * Program.java
 *     Contains the main class of the program
 * @author Kyle Blyth
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;

public class Program {
	
	/*
	 * Initialization point. Read in the data and pass to the relevant
	 * functions.
	 */
	public static void main(String[] args) {
		
		// read in file from arguments
		BufferedReader br = null;
		String line = "";
		
		try {
			String file_name = args[0];
			
			br = new BufferedReader(new FileReader(file_name));
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Invalid number of arguments.");
			usage();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private static void usage() {
		System.out.println("usage: java IIS-Project <data_file>");
	}
}
