package multi_thread;

import java.awt.Toolkit;
import javax.swing.JFrame; // ���� ��Ű���� ������ ����� �ִٴ� �͸� �˾Ƶα�


public class BeepPrintExample2 {
	public static void main(String[] args) {
		
//		Thread th1 = new Thread(new Task1());
//		Thread th2 = new Thread(new Task2());
		
		// �������� �̰Ŷ� �Ȱ���
		Thread th1 = new Thread() {
			
			@Override
			public void run() {
				
			}
		} ;
		
		
		
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
			}
		});
		
		th1.start();
		th2.start();
		
		
	}
}
