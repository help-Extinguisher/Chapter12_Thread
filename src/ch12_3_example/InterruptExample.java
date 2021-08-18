package ch12_3_example;


class PrintThread2 extends Thread {
	public void run() {
		try {
			while (true) {
				System.out.println("���� ��");
				// �����尡 ������, ���� �����϶����� ���ܰ� �߻����� ����
				// �����尡 �Ͻ�����(sleep) ���°� ���� ������ interrupt()�� ���ǹ���.
				
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}



public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try { thread.sleep(1000); } catch (InterruptedException e) {}
		
		
		// �����带 �����ϱ� ���� InterruptedException�� �߻���Ŵ
		thread.interrupt();
	}

}
