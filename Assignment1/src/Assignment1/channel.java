package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class channel
{
	private List<subscriber> subs = new ArrayList<>();
	private String title;
	
	public void  subscribe(subscriber sub)
	{
		subs.add(sub);
	
	}
	public void  unsubscribe(subscriber sub)
	{
		subs.remove(sub);	
		}


        public void notifysubscribers()
        {
        	for(subscriber sub : subs)
        	{
        		sub.update();
        		
        	}
        }
        public void upload(String title)
        {
        	this.setTitle(title);
        	notifysubscribers();
        }
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
}
        	
        
