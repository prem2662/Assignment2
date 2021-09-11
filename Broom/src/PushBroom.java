package Brooms;

public class PushBroom extends Brooms {

	BroomsMaterialFactory MaterialFactory;
	 
	public PushBroom(BroomsMaterialFactory MaterialFactory) {
		this.MaterialFactory = MaterialFactory;
	}
 
	void prepare() {
		handle = MaterialFactory.createHandle();
		bristles = MaterialFactory.createBristles();
		knob = MaterialFactory.createKnob();
	}

}
