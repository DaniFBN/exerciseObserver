package exerciseObserver;

import java.util.Calendar;

public class DailyNewspaper extends Deliverable {
	private String content = "It's a Daily Journal";

	@Override
	public String toString() {
		return content;
	}

	@Override
	public boolean checkPeriod(Calendar calendar) {
		if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY
				|| calendar.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY
				|| calendar.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY
				|| calendar.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY
				|| calendar.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY
				|| calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY
				|| calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
			return true;
		return false;
	}
}
