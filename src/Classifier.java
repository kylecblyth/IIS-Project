import java.util.ArrayList;
import java.util.Collections;

public class Classifier {
	final static int NUM_PARTITIONS = 10;
	
	// state
	static ArrayList<ArrayList<Item>> partitions;
	static ArrayList<Feature> features;
    static DT tree;
	
	/*
	 * Takes an arraylist of data and trains the classifier
	 */
	public static void train(ArrayList<Item> items) {
		
		// create features
		features = new ArrayList<>();
		float min;
		float max;
		for(int i = 0; i < 25; i++) {
			min = items.get(0).mData[i];
			max = min;
			for(int j = 0; j < items.size(); j++) {
				if(min > items.get(j).mData[i]) min = items.get(j).mData[i];
				if(max < items.get(j).mData[i]) max = items.get(j).mData[i];
			}

			Feature f = new Feature(min, max, i);
			features.add(f);
		}
		
		// build tree
		tree = DT.build(items, features, 0);

		partitions = partition(items);

		// perform testing
		for(int t = 0; t < NUM_PARTITIONS; t++) { // t is the test partition
			// train on sets that aren't 't'
			//TODO: do
		}
	}

	public static float classify(Item item){
        return tree.classify(item);
    }
	
	/**
	 * Partitions the data into PARTITION_SIZE equal-sized groups
	 * @param items list of data
	 * @return
	 */
	public static ArrayList<ArrayList<Item>> partition(ArrayList<Item> items) {

		ArrayList<ArrayList<Item>> result = new ArrayList<>();
		int partSize = items.size() / NUM_PARTITIONS;
		@SuppressWarnings("unchecked")
		ArrayList<Item> shuffled = (ArrayList<Item>) items.clone();
		ArrayList<Item> part;
		
		// generate a random ordering
		Collections.shuffle(shuffled);
		
		// populate the ArrayLists
		for(int i = 0; i < NUM_PARTITIONS - 1; i++){
			part = new ArrayList<Item>(shuffled.subList(i * partSize, (i+1) * partSize));
			result.add(part);
		}
		
		// used for unevenly divisible data
		part = new ArrayList<Item>(shuffled.subList((NUM_PARTITIONS - 1) * partSize, items.size()));
		result.add(part);
		
		return result;
	}
}
