package by.htp.part02.block9.Ex4;

public class Bank {

	public static void main(String[] args) {
		AccounLogic al = new AccounLogic();
    	DataBase bps = new DataBase();  
    	
    	User sergei = new User ("Sergei Kotlar", new Account(1, 700), new Account(2, 400), new Account(3, 300));
    	User artyom = new User ("Archibalt ", new Account(4, 1700), new Account(5, 1400), new Account(6, - 1300));
   
    	bps.addUser(artyom);
    	bps.addUser(sergei);
    	
    	System.out.println("DataBase negative balance is " + al.dBaseNegativeBallance(bps));
    	System.out.println();
    	
    	DataBase searchRez = new DataBase();
    	searchRez = al.findById(bps, 1);    	
    	searchprint(searchRez);    	    	

	}
	
	public static void print(DataBase db) {		
		for (User us : db.getdBase()) {
			System.out.println(us.getOwner());
			for(Account acc : us.getAccList()) {				
				    System.out.println("Id =" + acc.getId() + " Balance =" + acc.getBalance());			    		
			System.out.println();
			}
		}
	}
	
	public static void searchprint(DataBase db) {		
		for (User us : db.getdBase()) {
			if (us.getOwner() != null) {
			for(Account acc : us.getAccList()) {				
				    System.out.println("User =" +us.getOwner());
				    System.out.println("Id =" + acc.getId() + " Balance =" + acc.getBalance());	
			System.out.println();
			}
			}
		}
	}
}
