package multi_thread;

import java.awt.Toolkit;




// ����� �ΰ����� ����




class Task1 extends Thread { // ��� �� Ŭ���� ��ӹ�������
	// �ʵ�
	// ������
	// �޼ҵ�
}


class Task2 implements Runnable {

	@Override
	public void run() {
		// �������̽��Ƿ� ����������� (�������̵�)
	} 
	
	// �ʵ�
	// ������
	// �޼ҵ�
}




public class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch (Exception e) {}
		}
	}

}
