package Assignment1;

public class Youtube {
	
	public static void main (String[] args)
	{
		channel prem = new channel();
		subscriber s1 = new subscriber("Venkat");
		subscriber s2 = new subscriber("sarru");
		subscriber s3 = new subscriber("gopal");
		
		prem.subscribe(s1);
		prem.subscribe(s2);
		prem.subscribe(s3);

		s1.subscribechannel(prem);
		s2.subscribechannel(prem);
		s3.subscribechannel(prem);

         prem.upload("how to create git hub");

        

}



}
