/**
 * Represents a feature of the dataset
 * @author Kyle Blyth
 *
 */
public class Feature {
	
	// state
	float min;
	float max;
	int mSplit; // how many ranges to do
	
	// constructor. default split is 10
	public Feature(float minVal, float maxVal) {
		min = minVal;
		max = maxVal;
		mSplit = 10;
	}
	
	// constructor with split
	public Feature(float minVal, float maxVal, int split) {
		min = minVal;
		max = maxVal;
		mSplit = split;
	}
}
