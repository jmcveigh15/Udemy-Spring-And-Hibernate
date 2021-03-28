package springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {
			"Work harder",
			"Start earlier",
			"Be luckier"
	};
	
	private Random random = new Random();

	@Override
	public String getFortune() {
		int index = random.nextInt(fortunes.length);
		String theFortune = fortunes[index];
		
		return theFortune;
	}

}
