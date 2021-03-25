package springdemo;

public class FootballCoach implements Coach{
	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "Backs vs Forwards";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
