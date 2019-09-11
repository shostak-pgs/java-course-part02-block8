package by.htp.part02.block9.ex2;

import java.util.concurrent.TimeUnit;

public class Wheel {   

	private int size;
    private boolean crash= false;
	
	public Wheel(int size) {
		this.setSize(size);
	}

	public boolean isCrash() {
		return crash;
	}
		
	public void setCrash(Boolean b) {
		this.crash = b;
	}
	
	void speen() {
		try {
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}	
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (crash ? 1231 : 1237);
		result = prime * result + size;
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
		Wheel other = (Wheel) obj;
		if (crash != other.crash) {
			return false;
		}
		if (size != other.size) {
			return false;
		}
		return true;
	}
		
	@Override
	public String toString() {
		return "Wheel [size=" + size + ", crash=" + crash + "]";
	}
}
