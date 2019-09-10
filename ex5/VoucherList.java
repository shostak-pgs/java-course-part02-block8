package by.htp.part02.block9.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VoucherList {	
	private List<Voucher> list;
	
	public VoucherList(List<Voucher> list) {
		this.list = list;
	}
	
	public List<Voucher> getList() {
		return list;
	}

	public void setList(List<Voucher> list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
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
		VoucherList other = (VoucherList) obj;
		if (list == null) {
			if (other.list != null) {
				return false;
			}
		} else if (!list.equals(other.list)) {
			return false;
		}
		return true;}

	@Override
	public String toString() {
		return "VoucherList [list=" + list + "]";
	}
}
	

	
		

