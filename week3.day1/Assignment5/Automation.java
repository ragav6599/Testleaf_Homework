package week3.day1;

public class Automation extends MultipleLangauge implements TestTool {
	
	@Override
	public void Selenium() {
		System.out.println("Hai i am selenium");
		
	}

	@Override
	public void java() {
		System.out.println("Hai i am Java");
		
	}
	
	public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.Selenium();
		auto.java();
		auto.python();
		auto.ruby();
		
	}

}


