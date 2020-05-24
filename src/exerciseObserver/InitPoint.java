package exerciseObserver;

public class InitPoint {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PublishingCompany company = new PublishingCompany();
		company.addObserver(new Person("Jos�", new DailyNewspaper()));
		company.addObserver(new Person("Jo�o", new WeekendNewspaper()));
		company.addObserver(new Person("Maria", new WeeklyNewspaper()));
		company.init();
	}
}
