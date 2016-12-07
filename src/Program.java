/**
 * Program.java
 *     Contains the main class of the program
 * @author Kyle Blyth
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Program {
	
	static ArrayList<Item> items = new ArrayList<Item>();
	
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
				String[] data = line.split(";");
				// create the data
				for(int i = 0; i < data.length; i++) {
					data[i] = data[i].replace(',', '.');
				}
				
				for(int i = 0; i < data.length; i++) {
					if(data.length == 26) {
						Item item = new Item(
							Integer.parseInt(data[0]),
							Integer.parseInt(data[1]), 
							Integer.parseInt(data[2]), 
							Integer.parseInt(data[3]),
							Float.parseFloat(data[4]),
							Float.parseFloat(data[5]),
							Float.parseFloat(data[6]),
							Float.parseFloat(data[7]),
							Float.parseFloat(data[8]),
							Float.parseFloat(data[9]),
							Float.parseFloat(data[10]),
							Float.parseFloat(data[11]),
							Float.parseFloat(data[12]),
							Float.parseFloat(data[13]),
							Float.parseFloat(data[14]),
							Float.parseFloat(data[15]),
							Float.parseFloat(data[16]),
							Float.parseFloat(data[17]),
							Float.parseFloat(data[18]),
							Float.parseFloat(data[19]),
							Float.parseFloat(data[20]),
							Float.parseFloat(data[21]),
							Float.parseFloat(data[22]),
							Float.parseFloat(data[23]),
							Float.parseFloat(data[24]),
							Integer.parseInt(data[25]));
						items.add(item);
					} else {
						System.out.println("Data incorrectly formated.");
					}
				}
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
		
		Classifier.train(items);
	}
	
	private static void usage() {
		System.out.println("usage: java IIS-Project <data_file>");
	}
}
