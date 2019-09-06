package by.htp.part02.block9.Ex5;

import java.util.List;

/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 * 
 */
public class Customer  {
	
	private String name;
	private List<Account> customerAccount;
	
	public Customer(String name, List<Account> customerAccount) {
		this.setName(name);
		this.setCustomerAccount(customerAccount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(List<Account> customerAccount) {
		this.customerAccount = customerAccount;
	}

	
	

}
