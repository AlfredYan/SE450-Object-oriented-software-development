import java.util.Date;

public class WeekendState implements IState {

	@Override
	public String formatDayOfWeek(String dayOfWeek) {
		return dayOfWeek.toUpperCase();
	}

	@Override
	public String formatDateString(Date currentDate) {
		return "->" + currentDate.toString();
	}

	@Override
	public String doIHaveWorkToday() {
		return "no";
	}

	@Override
	public void soundAlarm() {
		// do nothing
	}

}
