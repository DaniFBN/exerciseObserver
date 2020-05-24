package exerciseObserver;

import java.util.Calendar;

public class Person implements Observer{
	private String name;
	private Deliverable deliverable;
	
	Person(String name, Deliverable deliverable){
		this.name = name;
		this.deliverable = deliverable;
	}
	
	@Override
	public String toString() {
		return "Name: " + name;
	}

	@Override
	public void update(Deliverable deliverable) {
		this.deliverable = deliverable;
	}

	@Override
	public void receiveNewspaper() {
		System.out.println(deliverable);
	}

	@Override
	public Deliverable getDeliverable() {
		return deliverable;
	}
}
