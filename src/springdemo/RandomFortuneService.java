package springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private Random random = new Random();
	private String[] fortunes = {
			"Work harder",
			"Start earlier",
			"Be luckier"
	};

	@Override
	public String getFortune() {
		int index = random.nextInt(fortunes.length);
		String theFortune = fortunes[index];
		
		return theFortune;
	}
}
