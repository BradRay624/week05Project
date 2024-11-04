package week05Project;

public class App {

	public static void main(String[] args) {
		
		Logger asteriskLogger = new AsteriskLogger();
		System.out.println("Testing AsteriskLogger");
		asteriskLogger.log("Good morning");
		asteriskLogger.error("Good afternoon");
		
		Logger spacedLogger = new SpacedLogger();
		System.out.println("Testing SpacedLogger");
		spacedLogger.log("Good morning");
		spacedLogger.error("Good afternoon");
	}

}
