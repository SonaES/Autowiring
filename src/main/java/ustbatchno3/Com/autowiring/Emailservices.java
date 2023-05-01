package ustbatchno3.Com.autowiring;

public class Emailservices implements MessageServices {

	public void sendmessage(String message) {
		
		System.out.println("I AM FROM EMAIL SERVICES:"+message);	
	}

}