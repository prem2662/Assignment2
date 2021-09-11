package Brooms;

public class HardBroom extends Brooms {

	BroomsMaterialFactory MaterialFactory;
	 
	public HardBroom(BroomsMaterialFactory MaterialFactory) {
		this.MaterialFactory = MaterialFactory;
	}
 
	void prepare() {
		handle = MaterialFactory.createHandle();
		bristles = MaterialFactory.createBristles();
		knob = MaterialFactory.createKnob();
	}

}
