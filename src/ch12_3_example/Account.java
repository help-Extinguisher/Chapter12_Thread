package ch12_3_example;

public class Account {
	
	// �ܰ�
	private int balance = 10_000;
	
	public int getBalance() {
		return balance;
	}
	
	// money = ��ݱݾ�
//	public void withdraw(int money) {
	public synchronized void withdraw(int money) { // synchronized = ����ȭ �޼ҵ� ���
		if (balance >= money) {
			try {
				Thread.sleep(1 * 1000);
			} catch (Exception e) {}
			
			balance -= money;
		}
	}

}
