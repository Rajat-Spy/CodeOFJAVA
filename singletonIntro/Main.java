package singletonIntro;

public class Main {

	public static void main(String[] args) {
		AppConfig App = AppConfig.getInstance();
		App.login = "Yello";
		App.details();
		System.out.println(App.login);

	}

}
