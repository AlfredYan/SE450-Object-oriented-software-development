import java.util.Date;
/***
 * Template Method Pattern
 * 
 * 1.Create an abstract class with a concrete method and an abstract method.
 * 2.The concrete method calls the abstract method.
 * 3.Create classes to extend that abstract class and implement that abstract method.
 * 
 * Strategy pattern uses delegation to complete an algorithm, Template Method pattern uses inheritance.
 * Use Template Method if you want to permanently bind a class to an algorithm.
 * 
 * @author kaichengyan
 *
 */
public class TemplateMethodDemo {

}

class Connection {
	public Connection(String url) {
		// TODO Auto-generated constructor stub
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void send(int id) {
		// TODO Auto-generated method stub
		
	}

	public void send(String name) {
		// TODO Auto-generated method stub
		
	}

	public void send(Date birthday) {
		// TODO Auto-generated method stub
		
	}
}

// Template Method Pattern
abstract class PersonInfoTransmitter {
	protected int id;
	protected String name;
	protected Date birthday;
	public void transmitData(String dataToTransmit) {
		Connection conn = new Connection("www.url.com");
		sendData(conn);
		conn.close();
	}
	
	public abstract void sendData(Connection conn);
}

class IdTransmitter extends PersonInfoTransmitter {
	@Override
	public void sendData(Connection conn) {
		conn.send(id);
	}	
}

class NameTransmitter extends PersonInfoTransmitter {
	@Override
	public void sendData(Connection conn) {
		conn.send(name);
	}	
}

class BirthdayTransmitter extends PersonInfoTransmitter {
	@Override
	public void sendData(Connection conn) {
		conn.send(birthday);
	}
}


// Without Template Method Pattern
//public class PersonInformationTransmitter { 
//	private int id; 
//	private String name; 
//	private Date birthday; 
//	public void transmitData(String dataToTransmit){ 
//		Connection conn = new Connection("www.url.com"); 
//		if(dataToTransmit.equals("id")) 
//			conn.send(id.toString()); 
//		else if(dataToTransmit.equals("name")) 
//			conn.send(name.toString()); 
//		else if(dataToTransmit.equals("birthday")) 
//			conn.send(birthday.toString()); 
//		else { // throw exception if this happens. } 
//		conn.close(); 
//	} 
//}


