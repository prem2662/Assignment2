package Brooms;

public class SoftBroom extends Brooms {
	BroomsMaterialFactory MaterialFactory;
	 
	public SoftBroom(BroomsMaterialFactory MaterialFactory) {
		this.MaterialFactory = MaterialFactory;
	}
 
	void prepare() {
		handle = MaterialFactory.createHandle();
		bristles = MaterialFactory.createBristles();
		knob = MaterialFactory.createKnob();
	}

}
	