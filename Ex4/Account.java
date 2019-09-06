package by.htp.part02.block9.Ex4;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 *  Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. 
 *  Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Account implements Comparable<Account> {
	int id;
	boolean isBlocked = false;
	double balance = 0;
	
	public Account(int id) {
		this.id = id;
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean getBlocking() {
		return this.isBlocked;
	}
	
	public void setBlocking(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	@Override
	public int compareTo(Account arg0) {		
		if(arg0.getBalance() > this.getBalance()) 
			return - 1;			
	
		if(arg0.getBalance() > this.getBalance()) 
			return 1;
		
		else 
			return 0;		
	}
	
}
