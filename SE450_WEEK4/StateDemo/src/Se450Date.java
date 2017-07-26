import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Se450Date {
	private Calendar cal;
	private IState _currentState;
	private WeekdayState weekdayState = new WeekdayState();
	private WeekendState weekendState = new WeekendState();
	
	public Se450Date() {
		cal = Calendar.getInstance();
		chooseState();
	}
	
	public void addDate() {
		// TODO Auto-generated method stub
		cal.add(Calendar.DATE, 1);
		chooseState();
	}
	
	public void printDayOfWeek() {
		String formattedDayOfWeek = _currentState.formatDayOfWeek(new SimpleDateFormat("EEEE").format(cal.getTime()));
		System.out.println(formattedDayOfWeek);
		
		// without state pattern
//		String dayOfWeek = new SimpleDateFormat("EEEE").format(cal.getTime());
//		if(isWeekend())
//			System.out.println(dayOfWeek.toUpperCase());
//		else
//			System.out.println(dayOfWeek.toLowerCase());
	}
	
	public void printDate() {
		Date currentDate = cal.getTime();
		String formattedDate = _currentState.formatDateString(currentDate);
		System.out.println(formattedDate);
		
		// without state pattern
//		Date currentDate = cal.getTime();
//		if(isWeekend())
//			System.out.println("->" + currentDate.toString());
//		else
//			System.out.println(currentDate.toString());
	}
	
	public void doIHaveWorkToday() {
		String doIHaveWorkToday = _currentState.doIHaveWorkToday();
		System.out.println(doIHaveWorkToday);
		
		// without state pattern
//		if(isWeekend())
//			System.out.println("no");
//		else
//			System.out.println("yes");
	}
	
	public void soundAlarm() {
		_currentState.soundAlarm();
	}
	
	private boolean isWeekend() {
		return cal.get(Calendar.DAY_OF_WEEK) == 1
				|| cal.get(Calendar.DAY_OF_WEEK) == 7;
	}
	
	private void chooseState() {
		if(isWeekend())
			_currentState = weekendState;
		else
			_currentState = weekdayState;
	}

}

/*
get Day of week:
cal.get(Calendar.DAY_OF_WEEK)
- returns 1-based day of week (1 and 7 are weekends)

print out Day of week
new SimpleDateFormat("EEEE").format(cal.getTime())
- returns the day of the week as a String 

*/
