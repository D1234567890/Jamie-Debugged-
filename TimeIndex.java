import java.util.Calendar;

public class TimeIndex {
	static Calendar time;

	static String getTime() {
		time = Calendar.getInstance();
		String whatTime = time.getTime().toString();
		return whatTime;
	}
}