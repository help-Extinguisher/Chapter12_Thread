package ch12_3_example;


class PrintThread2 extends Thread {
	public void run() {
		try {
			while (true) {
				System.out.println("실행 중");
				// 스레드가 실행대기, 실행 상태일때에는 예외가 발생하지 않음
				// 스레드가 일시정지(sleep) 상태가 되지 않으면 interrupt()는 무의미함.
				
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}



public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try { thread.sleep(1000); } catch (InterruptedException e) {}
		
		
		// 스레드를 종료하기 위해 InterruptedException를 발생시킴
		thread.interrupt();
	}

}
