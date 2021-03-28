package springdemo;

public class SwimmingCoach implements Coach {
	private FortuneService fortuneService;
	
	public SwimmingCoach() {
		System.out.println("SwimmingCoach: inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("SwimmingCoach: inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Do some fast lengths";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
