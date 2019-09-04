package by.htp.part02.block9.Ex2;

import java.util.concurrent.TimeUnit;

public class Wheel {
    private int size;
    boolean isBroken = false;
	
	public Wheel(int size) {
		this.setSize(size);
	}

	public boolean getCondition() {
		return isBroken;
	}
	
	void speen() {
		try {
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("We are moving...");
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void setCondition(Boolean b) {
		this.isBroken = b;
	}
}
