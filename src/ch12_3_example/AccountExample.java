package ch12_3_example;


class Withdrawer implements Runnable {
	
	Account account = new Account();

	@Override
	public void run() {
		// ����ϱ�
		while(account.getBalance() > 0) {
			// 100, 200, 300�� �� ���Ƿ� ���
			int money = (int) (Math.random() *3+1)*100;
			account.withdraw(money);
			System.out.println("�����ܰ� : " + account.getBalance());
		}
	}
	
	
}


public class AccountExample {
	public static void main(String[] args) {
		
		// ����ϴ� ���� ����ȭ (��Ƽ ������ ����)
		
		Runnable withdrawer = new Withdrawer();
		
		Thread jWorker = new Thread(withdrawer);
		Thread yWroker = new Thread(withdrawer);
		
		jWorker.start();
		yWroker.start();
		
	}

}
