import java.util.Date;

public class WeekdayState implements IState {

	@Override
	public String formatDayOfWeek(String dayOfWeek) {
		return dayOfWeek.toLowerCase();
	}

	@Override
	public String formatDateString(Date currentDate) {
		return currentDate.toString();
	}

	@Override
	public String doIHaveWorkToday() {
		return "yes";
	}

	@Override
	public void soundAlarm() {
		System.out.println("Alarm");
	}

}
