package multi_thread;


class ThreadA extends Thread {
	
	public ThreadA() {
		setName("ThreadA");
	}
	
	public void run() {
		for (int i = 0; i<2; i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}
	
}


class ThreadB extends Thread {
	public void run() {
		for (int i = 0; i<2; i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}
}


public class ThreadNameExample {
	public static void main(String[] args) {
		
		// �� �ڵ带 �����ϴ� ������ ��ü ���
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : " + mainThread.getName());
		
		
		// ������ A ��ü ����
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸� : " + threadA.getName());
		threadA.start();
		
		
		// ������ B ��ü ����
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸� : " + threadB.getName());
		threadB.start();

	}

}
