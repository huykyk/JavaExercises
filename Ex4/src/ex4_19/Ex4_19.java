package ex4_19;

import java.util.Date;

class Account {
	private int id;							//�˻���id
	private double balance;					//�˻������
	private double annulInterestRate;		//����������
	private Date dateCreated = new Date();	//�˻���������
	public Account() {						//Ĭ�Ϲ��췽��
		id = 0;
		balance = 0;
	}
	public Account(int id, double balance) {//���������췽��
		this.id = id;
		this.balance = balance;
	}
	public int getId() {					//���� id �ķ���
		return id;
	}
	public void setId(int id) {				//�޸� id �ķ���
		this.id = id;
	}
	public double getBalance() {			//���� balance �ķ���
		return balance;
	}
	public void setBalance(double balance) {//�޸� balance �ķ���
		this.balance = balance;
	}
	public double getAnnulInterestRate() {	//���� annulInterestRate �ķ���
		return annulInterestRate;
	}
	public void setAnnulInterestRate(double annulInterestRate) {	//�޸� annulInterestRate �ķ���
		this.annulInterestRate = annulInterestRate;
	}
	public Date getDateCreated() {			//�����˻��������ڵķ���
		return dateCreated;
	}
	public double getMonthlyInterestRate() {//���������ʵķ���
		return annulInterestRate / 12;
	}
	public void withdraw(double amount) {	//ȡ��ķ���
		balance = balance - amount;
	}
	public void deposit(double amount) {	//���ķ���
		balance = balance + amount;
	}
}
public class Ex4_19 {
	/**����һ����Ϊ Account ����ʵ���˻��������� UML ͼ���α� P91���Ա�дһ��Ӧ�ó������ Account ���ʹ��*/
	public static void main(String[] args) {
		Account account2 = new Account();
		Account account = new Account(666, 999999);
		account.setAnnulInterestRate(0.7);
		System.out.println("Account  ID:" + account.getId() + "  Balance:" + account.getBalance());
		System.out.println("Account2 Data Created:" + account2.getDateCreated());
	}
}
