package multi_thread;

public class DaemonExample {
	public static void main(String[] args) {
		
		AutoSaver auto = new AutoSaver(20);
		// ���� ������ ����
		auto.setDaemon(true);
		
		if (auto.isDaemon()) {
			auto.start();
		}
		
		System.out.println("������ �� : " + Thread.activeCount());
		
		try {
			Thread.sleep(5*1000);
		} catch (Exception e) {}
		
		auto.print();
		
		System.out.println(Thread.currentThread().getName() + "����");
	}

}
