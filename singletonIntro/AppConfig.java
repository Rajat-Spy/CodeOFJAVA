package singletonIntro;

public class AppConfig {
	protected String login;
	private AppConfig() {
		
	}
	private static AppConfig obj = null;
	
	public static AppConfig getInstance() {
		if(obj == null) {
			obj = new AppConfig();
		}
		return obj;
	}
	public void details() {
		System.out.println("This is just a demo Method! "+login);
	}

}
