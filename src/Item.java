/**
 * Contains a line of data from a given dataset
 */
public class Item {
	// state
	int blue; int green; int red;
	int nearlR;
	float conB;	float asmB;	float corB; float homB; 
	float conG; float asmG; float corG; float homG; 
	float conR; float asmR; float corR; float homR; 
	float conIR; float asmIR; float corIR; float homIR; 
	float brightness; float greeness; float wetness; float intensity; float hue; 
	int _class = -1;
	
	// default constructor
	public Item(int blue, int green, int red, int nearlR, float conB, 
			float asmB, float corB, float homB, float conG, float asmG, 
			float corG, float homG, float conR, float asmR, float corR, 
			float homR, float conIR, float asmIR, float corIR, float homIR, 
			float brightness, float greeness, float wetness, float intensity, 
			float hue) {
		this.blue = blue; 
		this.green = green; 
		this.red = red;
		this.nearlR = nearlR;
		this.conB = conB;	
		this.asmB = asmB;	
		this.corB = corB;
		this.homB = homB; 
		this.conG = conG; 
		this.asmG = asmG;
		this.corG = corG;
		this.homG = homG; 
		this.conR = conR; 
		this.asmR = asmR; 
		this.corR = corR; 
		this.homR = homR; 
		this.conIR = conIR; 
		this.asmIR = asmIR; 
		this.corIR = corIR; 
		this.homIR = homIR; 
		this.brightness = brightness;
		this.greeness = greeness;
		this.wetness = wetness; 
		this.intensity = intensity;
		this.hue = hue; 
	}
	
	// constructor with given class
	public Item(int blue, int green, int red, int nearlR, float conB, 
			float asmB, float corB, float homB, float conG, float asmG, 
			float corG, float homG, float conR, float asmR, float corR, 
			float homR, float conIR, float asmIR, float corIR, float homIR, 
			float brightness, float greeness, float wetness, float intensity, 
			float hue, int _class) {
		this.blue = blue; 
		this.green = green; 
		this.red = red;
		this.nearlR = nearlR;
		this.conB = conB;	
		this.asmB = asmB;	
		this.corB = corB;
		this.homB = homB; 
		this.conG = conG; 
		this.asmG = asmG;
		this.corG = corG;
		this.homG = homG; 
		this.conR = conR; 
		this.asmR = asmR; 
		this.corR = corR; 
		this.homR = homR; 
		this.conIR = conIR; 
		this.asmIR = asmIR; 
		this.corIR = corIR; 
		this.homIR = homIR; 
		this.brightness = brightness;
		this.greeness = greeness;
		this.wetness = wetness; 
		this.intensity = intensity;
		this.hue = hue; 
		this._class = _class;
	}
}
