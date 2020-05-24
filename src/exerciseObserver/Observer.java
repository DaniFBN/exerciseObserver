package exerciseObserver;

public interface Observer {
	public void update(Deliverable deliverable);
	public void receiveNewspaper();
	public Deliverable getDeliverable();
}
