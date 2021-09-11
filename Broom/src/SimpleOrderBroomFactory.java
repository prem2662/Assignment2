package Brooms;

public abstract class SimpleOrderBroomFactory  {
	protected Brooms createBroom(String item) {
		Brooms br = null;
		BroomsMaterialFactory BMF = null;
		BMF = new BroomsFactory();
		if (item.equals("Soft")) {
  
			br = new SoftBroom(BMF);
			br.setName("Soft Broom");
  
		} else if (item.equals("Push")) {
 
			br = new PushBroom(BMF);
			br.setName("Push Broom");
 
		} else if (item.equals("Hard")) {
 
			br = new HardBroom(BMF);
			br.setName("Hard Broom");
 
		} else if (item.equals("Angle")) {

			br = new AngleBroom(BMF);
			br.setName("Angle Broom");
 
		} 
		return br;
	}
	 
	public Brooms orderBroom(String type) {
		Brooms brm = createBroom(type);
		System.out.println("---Creating a Broom---");
		brm.prepare();
		brm.pack();
		
		return brm;
	}

}
