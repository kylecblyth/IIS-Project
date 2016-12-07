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
		partitions = partition(items);
		// TODO: remove. this finds max, min
		float min;
		float max;
		System.out.println(items.size());
		for(int i = 0; i < 25; i++) {
			min = items.get(0).attr.get(i);
			max = min;
			for(int j = 0; j < items.size(); j++) {
				if(min > items.get(j).attr.get(i)) min = items.get(j).attr.get(i);
				if(max < items.get(j).attr.get(i)) max = items.get(j).attr.get(i);
			}
			System.out.println("[" + i + "]" + "min: " + min + " max:" + max);
		}
		
		// build tree
		//buildTree(partitions);
		
		// perform testing
		for(int t = 0; t < NUM_PARTITIONS; t++) { // t is the test partition
			// train on sets that aren't 't'
			
		}
	}
	
	/**
	 * Builds the decision tree
	 */
	private static DT buildTree(ArrayList<ArrayList<Item>> items) {
		DT tree = new DT();
		
		// create the features
		Feature blue  = new Feature(300, 1000);
		Feature green = new Feature(300, 1000);
		Feature red   = new Feature(300, 1000);
		Feature nearlR = new Feature(200, 1400);
		Feature conB = new Feature(0, 100);	
		/*
		Feature asmB = new Feature();	
		Feature corB = new Feature();
		Feature homB = new Feature(); 
		Feature conG = new Feature(); 
		Feature asmG = new Feature();
		Feature corG = new Feature();
		Feature homG = new Feature(); 
		Feature conR = new Feature(); 
		Feature asmR = new Feature();; 
		Feature corR = new Feature(); 
		Feature homR = new Feature(); 
		Feature conIR = new Feature(); 
		Feature asmIR = new Feature(); 
		Feature corIR = new Feature(); 
		Feature homIR = new Feature(); 
		Feature brightness = new Feature();
		Feature greeness = new Feature();
		Feature wetness = new Feature();
		Feature intensity = new Feature();
		Feature hue = new Feature();
		*/
		
		return tree;
	}
	
	/**
	 * Partitions the data into PARTITION_SIZE equal-sized groups
	 * @param items list of data
	 * @param NUM_PARTITIONS number of partitions to divide the list into
	 * @return
	 */
	public static ArrayList<ArrayList<Item>> partition(ArrayList<Item> items) {

		ArrayList<ArrayList<Item>> result = new ArrayList<>();
		int partSize = items.size() / NUM_PARTITIONS;
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
