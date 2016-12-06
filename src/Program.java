/**
 * Program.java
 *     Contains the main class of the program
 * @author Kyle Blyth
 *
 */
public class Program {
	
	/*
	 * Initialization point. Read in the data and pass to the relevant
	 * functions.
	 */
	public static void main(String[] args) {
		// read in file from arguments
		try {
			
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Invalid number of arguments.");
			usage();
		}
	}
	
	private static void usage() {
		System.out.println("usage: java IIS-Project <data_file>");
	}
}
