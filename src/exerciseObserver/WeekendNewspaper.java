package exerciseObserver;

import java.util.Calendar;

public class WeekendNewspaper extends Deliverable {
	private String content = "It's a Weekend journal";

	@Override
	public String toString() {
		return content;
	}

	@Override
	public boolean checkPeriod(Calendar calendar) {
		if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY
				|| calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
			return true;
		return false;
	}
}
