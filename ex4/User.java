package by.htp.part02.block9.ex4;

import java.util.ArrayList;
import java.util.List;

public class User {

	private List<Account> accList;
	private String owner;

	public User(String owner) {
		this.owner = owner;
		accList = new ArrayList<>();
	}

	public User(String owner, List<Account> list) {
		this.owner = owner;
		accList = list;
	}

	public User(List<Account> list) {
		accList = list;
	}

	public User(String owner, Account... account) {
		this.owner = owner;
		accList = new ArrayList<>();
		for (Account acc : account) {
			accList.add(acc);
		}
	}

	public List<Account> getAccList() {
		return accList;
	}

	public void setAccList(List<Account> accList) {
		this.accList = accList;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void addAcc(Account... account) {
		accList = new ArrayList<>();
		for (Account acc : account) {
			accList.add(acc);
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accList == null) ? 0 : accList.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
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
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		User user = (User) obj;
		if (accList == null) {
			if (user.accList != null) {
				return false;
			}
		} else if (!accList.equals(user.accList)) {
			return false;
		}
		if (owner == null) {
			if (user.owner != null) {
				return false;
			}
		} else if (!owner.equals(user.owner)) {
			return false;
		}
		return true;
	}	

	@Override
	public String toString() {
		String str = "Owner " + owner +"\n";
		for (Account account : getAccList()) {
			str +=account.toString();
		}
		return str += "\n";
	}
}
