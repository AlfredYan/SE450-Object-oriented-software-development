import java.util.Date;

public interface IState {

	String formatDayOfWeek(String format);

	String formatDateString(Date currentDate);

	String doIHaveWorkToday();

	void soundAlarm();

}
