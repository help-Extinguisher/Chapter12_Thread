package multi_thread;

import java.awt.Toolkit;
import javax.swing.JFrame; // 이쪽 패키지에 프레임 기능이 있다는 것만 알아두기


class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("나의 윈도우 프레임");
		setSize(300, 500);
		setVisible(true);
	}
}

public class BeepPrintExample {
	public static void main(String[] args) {
		// 0.5초 주기로 beep음 발생 후 문자출력
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		// 스레드를 만드는 방법 - 메인 메소드 하나 더 만든다고 생각하면 될듯?
		Thread th = new Thread(new BeepTask());
		
//		Thread th = new Thread(new Runnable()) { // 익명 객체로 만들기
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
			try { Thread.sleep(500); } catch(Exception e) {} // 500이 아니라 0.5 * 1000 뭐 이런식으로 해도 됨
		}
		
		for (int i=0; i<5; i++) {
			System.out.println(i+1+". 띵");
			try {Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
