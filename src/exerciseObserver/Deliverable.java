package exerciseObserver;

import java.util.Calendar;

public abstract class Deliverable {	
	public String content = "It's a common journal";
	
	public abstract boolean checkPeriod(Calendar calendar);
	
	@Override
	public abstract String toString();
}
