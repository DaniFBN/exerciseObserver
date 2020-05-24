package exerciseObserver;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PublishingCompany implements Subject {
	private List<Observer> observers;
	private Calendar calendar;

	PublishingCompany() {
		observers = new LinkedList<>();
	}

	public void init() {
		calendar = Calendar.getInstance();
		while (!observers.isEmpty()) {
			notifyObservers();
			calendar.add(Calendar.DAY_OF_YEAR, 1);
			/*
			 * try { Thread.sleep(5000); } catch (InterruptedException e) {
			 * e.printStackTrace(); }
			 */
		}
		System.out.println("Falimos!!!");
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		Random gerador = new Random();
		for (Observer o : observers) {
			if (o.getDeliverable().checkPeriod(calendar)) {
				o.receiveNewspaper();
				if (gerador.nextInt(100) == 0) {
					this.removeObserver(o);
					System.out.println("Cancelado " + o.toString());
				}
			}
		}
		// Ocorre um erro, pelo que vi, é por modificar a List enquanto esta sendo lida, 
		// nao achei um modo de corrigir isso, sem ser try catch
	}
}
