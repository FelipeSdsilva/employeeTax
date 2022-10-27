package views;

public class Menu {

	public static void initialMenu() {

		System.out.println("------- Welcome the System Pay of tax for employeers --------"
				+ "\n------------- What do you have for me today? ----------------"
				+ "\n----------------- 1-) Employee registration -----------------"
				+ "\n----------------- 2-) Income tax ----------------------------"
				+ "\n----------------- 3-) Encrease salary -----------------------"
				+ "\n----------------- 4-) Employeers list -----------------------"
				+ "");
	}

	public static void registerEmployee(int menuMove) {
		if (menuMove == 1)
			System.out.println("----------------- 1-) Employee registration -----------------");
		else if(menuMove == 2) {
			incomeTax();
		}
	}

	public static void incomeTax() {
		System.out.println("----------------- 2-) Income tax ----------------------------");
	}
	
	public static void mensageEnd() {
		System.out.println("------------- Thanks for using until next time! -------------");
	}

}
