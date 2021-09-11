package Brooms;

public class BroomsFactory implements BroomsMaterialFactory {

	@Override
	public Handle createHandle() {
		// TODO Auto-generated method stub
		return new HHandle();
	}

	@Override
	public Bristles createBristles() {
		// TODO Auto-generated method stub
		return new BBristles();
	}

	@Override
	public Knob createKnob() {
		// TODO Auto-generated method stub
		return new KKnob();
	}

}
