package ch12_3_example;

public class PrintThread3 extends Thread {
	
	public void run() {
		while (true) {
			System.out.println("���� ��");
			if(Thread.interrupted()) {
				break;
			}
		}
	
	System.out.println("�ڿ� ����");
	System.out.println("���� ����");
	
	}

}
