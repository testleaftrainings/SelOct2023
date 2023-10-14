package week1.day1;

public class LearnSwitchCase {
	
	public static void main(String[] args) {
		String browser = "safari";//input
		switch (browser) {
		case "chrome": System.out.println("Open Chrome browser");break;
		case "firefox": System.out.println("Open Firefox browser");break;
		case "safari": System.out.println("Open Safari  browser");break;
		case "ie": System.out.println("Open Internet Explorer browser");break;
		default: System.out.println("Open Edge browser");break;
	
		}
	}

}
