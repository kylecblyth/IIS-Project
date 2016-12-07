import java.util.ArrayList;

public class Classifier {
	final static int PARTITION_SIZE = 10;
	
	// state
	static ArrayList<ArrayList<Item>> partitions;
	
	/*
	 * Takes an arraylist of data and trains the classifier
	 */
	public static void train(ArrayList<Item> items) {
		partitions = partition(items, PARTITION_SIZE);
	}
	
	/**
	 * Partitions the data into PARTITION_SIZE equal-sized groups
	 * @param items
	 * @param size
	 * @return
	 */
	public static ArrayList<ArrayList<Item>> partition(ArrayList<Item> items, int size) {
		
		ArrayList<ArrayList<Item>> result = new ArrayList<ArrayList<Item>>();
		
		// generate a random ordering
		
		// populate the ArrayLists
		for(int i = 0; i < size; i++) {
			result.add(new ArrayList<Item>()); // "size" ArrayLists
			// choose items to add at random
			for(int j = 0; j < items.size() / size; j++) {
				
			}
		}
		
		return result;
	}
}
