package Brooms;

public abstract class Brooms {

	Handle handle; 
	Bristles bristles;
	Knob knob ;
	String name;
	void prepare() {
		System.out.println("Bristles are cut samesize");
		System.out.println("Knob is tested");
		System.out.println("Brisles are Tied to handle using Knob");
	}
	void pack() {
		System.out.println("Broom is Packed");

	}
	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (handle != null) {
			result.append(handle);
			result.append("\n");
		}
		if (bristles != null) {
			result.append(bristles);
			result.append("\n");
		}
		if (knob != null) {
			result.append(knob);
			
		}
		
		return result.toString();
	}
}
