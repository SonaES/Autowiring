package ustbatchno3.Com.autowiring;

public class Notificationservices {
	private MessageServices messageservices;
	public void notifyservice() {
		messageservices.sendmessage("i am autowired");
	}
	
	public void setMessageservices(MessageServices messageservices) {
		this.messageservices = messageservices;
	}
	
	
	
	
}
