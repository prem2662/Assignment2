package Assignment1;

public class subscriber
{
	private String name;
	private channel channel = new channel();
	
	public subscriber(String name) {
		super();
		this.setName(name);
	}
	public void update ()
	{
	System.out.println("Hi "+ name +" ,video is uploaded");
	


	}
	public void subscribechannel(channel ch)
	{
		setChannel(ch);
	}
	public channel getChannel() {
		return channel;
	}
	public void setChannel(channel channel) {
		this.channel = channel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void unsubscribechannel(Assignment1.channel prem) {
		// TODO Auto-generated method stub
		
	}

}
