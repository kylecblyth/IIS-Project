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
	int fIndex; // index of this feature in the item array
	
	// constructor. default split is 10
	public Feature(float minVal, float maxVal, int index) {
		min = minVal;
		max = maxVal;
		mSplit = 10;
		fIndex = index;
	}
	
	// constructor with split
	public Feature(float minVal, float maxVal, int split, int index) {
		min = minVal;
		max = maxVal;
		mSplit = split;
		fIndex = index;
	}
	
	public float getMin(int i) {
		return (float) i * (max - min) / mSplit;
	}
	
	public float getMax(int i) {
		return (float) (i + 1) * (max - min) / mSplit;
	}
}
