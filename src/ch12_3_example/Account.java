package ch12_3_example;

public class Account {
	
	// 잔고
	private int balance = 10_000;
	
	public int getBalance() {
		return balance;
	}
	
	// money = 출금금액
//	public void withdraw(int money) {
	public synchronized void withdraw(int money) { // synchronized = 동기화 메소드 명령
		if (balance >= money) {
			try {
				Thread.sleep(1 * 1000);
			} catch (Exception e) {}
			
			balance -= money;
		}
	}

}
