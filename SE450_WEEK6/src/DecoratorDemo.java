/***
 * Decorator Pattern
 * 
 * Wrap functionality around objects that implement a certain interface.
 * The decorator objects implement the same interface as the objects you want to augment.
 * The decorator has a reference to another object which implements the interface, and accents it via constructor.
 * 
 * @author kaichengyan
 *
 */
public class DecoratorDemo {
	public static void main(String[] args) {
		Processor p = new Processor();
		
		/**
		 * Combination: 
		 * new EmailMessage()
		 * new SmsMessage()
		 * new EncryptedMessage(new SmsMessage())
		 * new LoggedMessage(new EmailMessage())
		 * new EncryptedMessage(new LoggedMessage(new SmsMessage()))
		 */
		IMessage message = new EmailMessage();
		
		
		p.process(message);
	}
}

interface IMessage {
	String getMessage();
}

class EmailMessage implements IMessage {

	@Override
	public String getMessage() {
		// do something
		return null;
	}
}

class SmsMessage implements IMessage {

	@Override
	public String getMessage() {
		// do something
		return null;
	}
	
}

interface IMessageDecorator extends IMessage {
	// want to add some method to decorator class
	// eg: IMessage getMessageObject();
}

// Decorator class
class EncryptedMessage implements IMessageDecorator {
	private IMessage message;
	
	public EncryptedMessage(IMessage message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		String messageString = message.getMessage();
		return encrypt(messageString);
	}
	
}

//Decorator class
class LoggedMessage implements IMessageDecorator {

	private IMessage message;
	
	public LoggedMessage(IMessage message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		String messageString = message.getMessage();
		return log(messageString);
	}
}

class Processor {
	private MessageWriter messageWriter;
	void process(IMessage message) {
		messageWriter.writeMessageToStream(message, Stream);
	}
}


