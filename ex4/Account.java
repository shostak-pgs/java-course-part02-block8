package by.htp.part02.block9.ex4;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 *  Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. 
 *  Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Account implements Comparable<Account> {
	
	private int id;
	private boolean blocked = false;
	private double balance = 0;
	
	public Account() {
		this.id = 0;
	}
	
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
	
	public boolean isBlocked() {
		return this.blocked;
	}
	
	public void setBlocking(boolean blocked) {
		this.blocked = blocked;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (blocked ? 100 : 101);
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Account other = (Account) obj;
		if (balance != other.balance) {
			return false;
		}
		if (blocked != other.blocked) {
			return false;
		}			
		if (id != other.id) {
			return false;
		}
		return true;
	}	

	@Override
	public String toString() {
		return " Id = " + id + ", blocked = " + blocked + ", balance = " + balance;
	}	
}
