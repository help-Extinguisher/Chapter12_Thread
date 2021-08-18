package multi_thread;

import java.util.Arrays;

public class AutoSaver extends Thread {
	private int[] arr;
	private int count;
	
	public AutoSaver(int length) {
		arr = new int[length];
		count = 0;
	}
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			if(count < arr.length -1) {
				save(i++);
			}
		}
		
	}

	private void save(int num) {
		arr[count++] = num; // save�� �ѹ� ȣ��ɶ����� �迭�� �ٱ��� (num������?)
		System.out.println(num + " �� �����մϴ�");
	}
	
	public void print() {
		System.out.println(Arrays.toString(arr));
	}

}
