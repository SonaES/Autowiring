package ustbatchno3.Com.autowiring;

public class SMSservices implements MessageServices {

	public void sendmessage(String message) {
		
		
		System.out.println("I AM FROM SMS SERVICES:"+message);
	}

}
