import java.util.ArrayList;

/**
 * Contains a line of data from a given dataset
 */
public class Item {

	public float[] mData;

	int _class = -1;
	/*
		blue,green,red,
		nearlR,conB,asmB,
		corB,homB,conG,
		asmG,corG,homG,
		conR,asmR,corR,
		homR,conIR,asmIR,
		corIR,homIR,brightness,
		greeness,wetness,intensity,hue,
	*/
	public ArrayList<Float> attr;
	
	// default constructor
	public Item(float[] data) {
		if(data.length == 26) {
			mData = data;
		} else{
			System.err.println("Item can not be created. Data must have 26 attributes.");
			System.exit(1);
		}
	}
	
	// constructor with given class
	public Item(float[] data, int _class) {
		if(data.length == 26) {
			mData = data;
			this._class = _class;
		} else{
			System.err.println("Item can not be created. Data must have 26 attributes.");
			System.exit(1);
		}
	}
}
