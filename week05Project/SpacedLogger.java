package week05Project;

public class SpacedLogger implements Logger{
	
	@Override
	public void log(String log) {
		for (int i = 0; i < log.length(); i++) {
			System.out.print(log.charAt(i) + " ");
		}
		System.out.println();
	}
	
	@Override
	public void error(String error) {
		for (int j = 0; j < error.length(); j++) {
			System.out.print(error.charAt(j) + " ");
		}
	}
}


