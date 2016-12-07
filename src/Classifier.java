import java.util.ArrayList;
import java.util.Collections;

public class Classifier {
	final static int NUM_PARTITIONS = 10;
	
	// state
	static ArrayList<ArrayList<Item>> partitions;
	
	/*
	 * Takes an arraylist of data and trains the classifier
	 */
	public static void train(ArrayList<Item> items) {
		partitions = partition(items, NUM_PARTITIONS);
	}
	
	/**
	 * Partitions the data into PARTITION_SIZE equal-sized groups
	 * @param items list of data
	 * @param numParts number of partitions to divide the list into
	 * @return
	 */
	public static ArrayList<ArrayList<Item>> partition(ArrayList<Item> items, int numParts) {

		ArrayList<ArrayList<Item>> result = new ArrayList<>();
		int partSize = items.size()/numParts;
		// populate the ArrayLists
		for(int i=0;i<numParts;i++){
			// generate a random ordering
			Collections.shuffle(items);

			// put things before the split into training, things after the split into testing
			ArrayList<Item> training = new ArrayList<>(items.subList(0,(i+1)*partSize));
			ArrayList<Item> testing = new ArrayList<>(items.subList((i+1)*partSize,items.size()));

			// even indexes are training, odd are testing.
			result.add(training);
			result.add(testing);
		}
		return result;
	}
}
