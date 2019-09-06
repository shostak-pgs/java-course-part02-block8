package by.htp.part02.block9.Ex5;

public class Account implements Comparable<Account> {

	private int account;
	private double money;

	public Account(int account, double money) {
		this.setAccount(account);
		this.setMoney(money);
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public int compareTo(Account anotherAccount) {
		if (this.account == anotherAccount.account) {
			return 0;
		} else if (this.account < anotherAccount.account) {
			return -1;
		} else if (this.account > anotherAccount.account) {
			return 1;

		}
	}
}

