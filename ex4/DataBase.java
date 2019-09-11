package by.htp.part02.block9.ex4;

import java.util.ArrayList;
import java.util.List;

public class DataBase{
	
	private List<User> dBase = new ArrayList<>();
	
	public DataBase(List<User> dBase) {
		this.dBase = dBase;
	}
	
	public DataBase() {
		this.dBase = new ArrayList<>();
	}
	
    public List<User> getdBase() {
		return dBase;
	}

	public void setdBase(List<User> dBase) {
		this.dBase = dBase;
	}
	
	public void addUser(User...user) {
		for(User u : user) {
			dBase.add(u);
		}
	}    
}
