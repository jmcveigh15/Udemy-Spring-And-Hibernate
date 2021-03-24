package springdemo;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "30 mins batting practice";
	}
}
