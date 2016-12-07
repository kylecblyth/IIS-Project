import java.util.ArrayList;
import java.util.HashMap;

/**
 * Represents a decision tree
 * @author Kyle Blyth
 *
 */

public class DT {
	// state
    float classification;

    private DT(float classification, Feature testFeature){
        this.classification = classification;
        this.testFeature = testFeature;
        this.branches = new HashMap<>();
    }
	
	/*
	 * recursive helper to build
	 */
	public static DT build(ArrayList<Item> items, ArrayList<Feature> features,
			float dflt) {
		if(items.size() == 0) return new DT(dflt,null);
		else if(all_same(items)) { // all classes the same
			return new DT(items.get(0).mData[25],null);
		} else if(features.size() == 0) {
			// return mode(examples)
            return new DT(mode(items),null);
		} else {
			// choose best
			Feature bestFeature = chooseFeature(items, features);
            DT tree = new DT(0, bestFeature);
			ArrayList<Item> examples_i = new ArrayList<>();
			for(int i = 0; i < bestFeature.mSplit; i++) {
				
				// push examples in a range
				float min = bestFeature.getMin(i);
				float max = bestFeature.getMax(i);
				for(int j = 0; j < items.size(); j++) {
					//System.out.println(items.size());
					//System.out.println(items.get(j).mData.length-1 + " " + best_feature.fIndex);
					if(items.get(j).mData[bestFeature.fIndex] > min &&
					   items.get(j).mData[bestFeature.fIndex] < max) {
						examples_i.add(items.get(j));
					}
				}
                // create subtree
                ArrayList<Feature> tempfeatures = (ArrayList<Feature>)features.clone();
                tempfeatures.remove(bestFeature);
                DT sub = DT.build(examples_i, tempfeatures, mode(items));
                tree.branches.put((float)i,sub);
            }

            return tree;

		}
	}
	
	public static Feature chooseFeature(ArrayList<Item> items,
			ArrayList<Feature> features) {
		//TODO: do
		return features.get(0);
	}
	
	private static boolean all_same(ArrayList<Item> items) {
        for (int i = 1; i < items.size(); i++) {
            if(items.get(i).mData[25] != items.get(i-1).mData[25]){
                return false;
            }
        }
        return true;
	}


    /**
     * return the most common classification from items.
     *
     */
    private static float mode(ArrayList<Item> items){
        float[] classifications = new float[items.size()];
        for (int i = 0; i < items.size(); i++) {
            classifications[i] = items.get(i).mData[25];
        }
        float mode = 0;
        int count = 0;

        for (int i = 0; i < classifications.length; i++) {
            float classification = classifications[i];
            int tempCount = 1;
            for (int j = 1; j< classifications.length; j++){
                if(classification == classifications[j]){
                    tempCount++;
                }
            }
            if( tempCount > count){
                count = tempCount;
                mode = classification;
            }
        }
        return mode;
    }


    /*
    Kyle this is for classify stuff. I don't know if you used these or used
    different names for building, but these are what I'm using so feel free to
    rework them in the classify function to fit what you have.
     */
    // feature that this node is testing.
    Feature testFeature;
    // branches connected to this node.
    HashMap<Float, DT> branches;

    /**
     * Classify the item if you can, or return -1
     * @param item
     * @return
     */
    public float classify(Item item){
        if(this.classification != 0){
            return this.classification;
        }
        if(this.branches.isEmpty()){
            return -1;
        }
        if(this.testFeature == null){
            return -1;
        }
        int index = this.testFeature.fIndex;
        // TODO
        // find a way to get this to be the proper number.
        // up above I store it as which iteration it was on,
        // so you should be able to figure out the min/max of
        // each iteration and then figure out where this value falls.
        float fValue = item.mData[index];

        return this.branches.get(fValue).classify(item);
    }
} 