import java.util.Date;
import java.util.Hashtable;
/***
 * Hashing mutable data demo
 * 
 * hash mutable data is dangerous, when the data change, the hash gone
 * @author KYAN4
 *
 */

public class HashingMutableDataDemo {
	public static void main(String[] args) {
		
		Hashtable<Date, String> map = new Hashtable<Date, String>();
		long time = System.currentTimeMillis();
		Date dt1 = new Date(time);
		Date dt2 = new Date(time);
		map.put(dt1, "balh");
		// "blah2" will update the "balh"
		map.put(dt2, "blah2");
		
		
		System.out.println("dt1.toString() = " + dt1.toString());
		System.out.println("dt2.toString() = " + dt2.toString());
		System.out.println("dt2.equals(dt1)? = " + dt2.equals(dt1));
		System.out.println("map.get(dt1) = " + map.get(dt1));
		System.out.println("map.get(dt2) = " + map.get(dt2));
		
		System.out.println("\nmap = " + map.toString());
		
		//change date by adding a day to its time
		dt1.setTime(time + 24*60*60*1000L);
		
		System.out.println("\nAfter dt.setTime(newTime)");
		System.out.println("dt1.toString() = " + dt1.toString());
		System.out.println("dt2.toString() = " + dt2.toString());
		System.out.println("dt2.equals(dt1)? = " + dt2.equals(dt1));
		System.out.println("map.get(dt1) = " + map.get(dt1));
		System.out.println("map.get(dt2) = " + map.get(dt2));
		
		System.out.println("\nmap = " + map.toString());
		
	}
}
