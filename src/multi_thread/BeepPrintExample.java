package multi_thread;

import java.awt.Toolkit;
import javax.swing.JFrame; // ���� ��Ű���� ������ ����� �ִٴ� �͸� �˾Ƶα�


class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("���� ������ ������");
		setSize(300, 500);
		setVisible(true);
	}
}

public class BeepPrintExample {
	public static void main(String[] args) {
		// 0.5�� �ֱ�� beep�� �߻� �� �������
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		// �����带 ����� ��� - ���� �޼ҵ� �ϳ� �� ����ٰ� �����ϸ� �ɵ�?
		Thread th = new Thread(new BeepTask());
		
//		Thread th = new Thread(new Runnable()) { // �͸� ��ü�� �����
//			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0; i<5; i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(1000);
//					} catch (Exception e) {}
//				}
//			}
//		});
		
		th.start();
		
		
		
		
//		new MyFrame();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {} // 500�� �ƴ϶� 0.5 * 1000 �� �̷������� �ص� ��
		}
		
		for (int i=0; i<5; i++) {
			System.out.println(i+1+". ��");
			try {Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
