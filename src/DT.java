import java.util.ArrayList;

/**
 * Represents a decision tree
 * @author Kyle Blyth
 *
 */

public class DT {
	// state
	TreeNode root;
	
	public DT() {
		//TODO: actually build the tree
		// if examples is empty then return default
		// else if all examples have same classification then return classification
		// else if attributes is empty, return mode(examples)
		// else
			// best <-- choose_atr(attributes, examples)
			// tree <-- a new decision tree with root test best
			// for each val vi of best do
				// examples_i <-- { elements of examples with best = vi }
				// subtree <-- DT(examples_i, attr - best, mode(examples))
				// add a branch to tree with label vi and subtree subtree
			// return tree
		root = null;
	}
	
	public void build(ArrayList<Item> items, ArrayList<Feature> features) {
		DT dflt = new DT(); // empty tree
		builder(items, features, dflt);
	}
	
	/*
	 * 
	 */
	public DT builder(ArrayList<Item> items, ArrayList<Feature> features, DT dflt) {
		if(items.size() == 0) return dflt;
		else if(all_same(items)) { // all classes the same
			// return classification
		} else if(features.size() == 0) {
			// return mode(examples)
		} else {
			// choose best
			Feature best_feature = chooseFeature(items, features);
		}
	}
	
	public Feature chooseFeature(ArrayList<Item> items, ArrayList<Feature> features) {
		//TODO: do
		return features.get(0);
	}
	
	private boolean all_same(ArrayList<Item> items) {
		//TODO: do
		return false;
	}
} 