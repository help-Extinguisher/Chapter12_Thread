package multi_thread;

import java.awt.Toolkit;




// 방법이 두가지가 있음




class Task1 extends Thread { // 얘는 걍 클래스 상속받은거임
	// 필드
	// 생성자
	// 메소드
}


class Task2 implements Runnable {

	@Override
	public void run() {
		// 인터페이스므로 구현해줘야함 (오버라이딩)
	} 
	
	// 필드
	// 생성자
	// 메소드
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
