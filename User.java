package by.htp.part02.block9.Ex4;

import java.util.ArrayList;
import java.util.List;

public class User {
   
	List<Account> accList;
    String owner;
   
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
    
    public User(String owner, Account...account) {
    	this.owner = owner;
    	accList = new ArrayList<>();
    	for(Account acc : account) {
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

	
	public void addAcc(Account...account) {
    	accList = new ArrayList<>();
    	for(Account acc : account) {
    		accList.add(acc);
    	}
	}
	
}
