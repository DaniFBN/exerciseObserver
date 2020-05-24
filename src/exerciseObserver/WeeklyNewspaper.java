package exerciseObserver;

import java.util.Calendar;

public class WeeklyNewspaper extends Deliverable {
	private String content = "It's a Weekly journal";
	private int lastWeek = 0;

	@Override
	public String toString() {
		return content;
	}

	@Override
	public boolean checkPeriod(Calendar calendar) {
		int thisWeek = calendar.get(Calendar.WEEK_OF_YEAR);
		if (lastWeek == 0 || lastWeek != thisWeek) {
			lastWeek = thisWeek;
			return true;
		}
		return false;

	}
}
