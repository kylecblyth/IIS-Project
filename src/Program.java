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
		String line;
		
		try {
			String file_name = args[0];
			
			br = new BufferedReader(new FileReader(file_name));
			while((line = br.readLine()) != null) {
				String[] strdata = line.split(";");
				float[] data = new float[strdata.length];
				// create the data
				for(int i = 0; i < strdata.length; i++) {
					String holder = strdata[i].replace(',', '.');
					data[i] = Float.parseFloat(holder);
				}

				if(strdata.length == 26) {
					Item item = new Item(data);
					items.add(item);
				} else {
					System.out.println("Data incorrectly formated.");
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
		
		try{
			Classifier.train(items);
			System.out.println("Done training");
			int numCorrect = 0;
			for(Item i: items){
				float clss = Classifier.classify(i);
				if(clss == i.mData[25]){
					System.out.println("I GOT ONE, "+numCorrect);
					numCorrect++;
				}
			}
			System.out.println(numCorrect*1.0/items.size());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private static void usage() {
		System.out.println("usage: java IIS-Project <data_file>");
	}
}
