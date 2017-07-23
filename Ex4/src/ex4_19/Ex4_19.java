package ex4_19;

import java.util.Date;

class Account {
	private int id;							//账户的id
	private double balance;					//账户的余额
	private double annulInterestRate;		//存款的年利率
	private Date dateCreated = new Date();	//账户创建日期
	public Account() {						//默认构造方法
		id = 0;
		balance = 0;
	}
	public Account(int id, double balance) {//带参数构造方法
		this.id = id;
		this.balance = balance;
	}
	public int getId() {					//返回 id 的方法
		return id;
	}
	public void setId(int id) {				//修改 id 的方法
		this.id = id;
	}
	public double getBalance() {			//返回 balance 的方法
		return balance;
	}
	public void setBalance(double balance) {//修改 balance 的方法
		this.balance = balance;
	}
	public double getAnnulInterestRate() {	//返回 annulInterestRate 的方法
		return annulInterestRate;
	}
	public void setAnnulInterestRate(double annulInterestRate) {	//修改 annulInterestRate 的方法
		this.annulInterestRate = annulInterestRate;
	}
	public Date getDateCreated() {			//返回账户创建日期的方法
		return dateCreated;
	}
	public double getMonthlyInterestRate() {//返回月利率的方法
		return annulInterestRate / 12;
	}
	public void withdraw(double amount) {	//取款的方法
		balance = balance - amount;
	}
	public void deposit(double amount) {	//存款的方法
		balance = balance + amount;
	}
}
public class Ex4_19 {
	/**定义一个名为 Account 的类实现账户管理，它的 UML 图见课本 P91，试编写一个应用程序测试 Account 类的使用*/
	public static void main(String[] args) {
		Account account2 = new Account();
		Account account = new Account(666, 999999);
		account.setAnnulInterestRate(0.7);
		System.out.println("Account  ID:" + account.getId() + "  Balance:" + account.getBalance());
		System.out.println("Account2 Data Created:" + account2.getDateCreated());
	}
}
