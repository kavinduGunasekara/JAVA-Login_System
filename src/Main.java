
public class Main {
	
	public static void main(String[]args) {
		IDandPasswords idandPasswords= new IDandPasswords();
		
		LoginPage LoginPage = new LoginPage(idandPasswords.getLoginInfo());
		
	}

}
