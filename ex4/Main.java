package by.htp.part02.block9.ex4;

public class Main {

	public static void main(String[] args) {
		AccounLogic al = new AccounLogic();
    	DataBase bps = new DataBase();  
    	
    	User sergei = new User ("Sergei Kotlar", new Account(1, 700), new Account(2, 400), new Account(3, 300));
    	User artyom = new User ("Archibalt ", new Account(4, 1700), new Account(5, 1400), new Account(6, - 1300));
   
    	bps.addUser(artyom);
    	bps.addUser(sergei);
    	
    	System.out.println("DataBase negative balance is " + al.dBaseNegativeBallance(bps));
    	System.out.println();    	
    	   	
    	printSearchRez(bps, al.findById(bps, 1));   
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
	
	public static void printSearchRez(DataBase db, Account ac) {		
		for (User us : db.getdBase()) {			
			    for(Account acc : us.getAccList()) {
			    	if (acc.equals(ac)) {
				    System.out.println("User = " + us.getOwner() + " Id =" + acc.getId() + " Balance =" + acc.getBalance());			    		
			       	}
			    }
		}
	}
}
