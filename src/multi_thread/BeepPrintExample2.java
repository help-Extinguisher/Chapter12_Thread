package multi_thread;

import java.awt.Toolkit;
import javax.swing.JFrame; // 이쪽 패키지에 프레임 기능이 있다는 것만 알아두기


public class BeepPrintExample2 {
	public static void main(String[] args) {
		
//		Thread th1 = new Thread(new Task1());
//		Thread th2 = new Thread(new Task2());
		
		// 위에꺼랑 이거랑 똑같음
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
