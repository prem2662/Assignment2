package Brooms;

public class AngleBroom extends Brooms {

	BroomsMaterialFactory MaterialFactory;
	 
	public AngleBroom(BroomsMaterialFactory MaterialFactory) {
		this.MaterialFactory = MaterialFactory;
	}
 
	void prepare() {
		handle = MaterialFactory.createHandle();
		bristles = MaterialFactory.createBristles();
		knob = MaterialFactory.createKnob();
	}


}
