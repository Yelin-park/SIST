package days29;

import javax.swing.JOptionPane;

/**
 * @author Yelin
 * @date 2022. 3. 30. - 오후 3:52:58
 * @subject p752 스레드의 작업을 취소하는 메서드 - 예제13-14
 * @content
 * 			

 */
public class Ex11_02 {

	public static void main(String[] args) {
		
		ThreadWorker02 t = new ThreadWorker02();
		t.start();
		
		// main 블러킹
		String inputData = JOptionPane.showInputDialog("아무값이나 입력하세요.");
		System.out.println(inputData);
		t.interrupt(); // isInterrupted 상태 값을 false -> true
		System.out.println(t.isInterrupted()); // true
		
		System.out.println("main END");
		
	} // main

} // class

class ThreadWorker02 extends Thread{
	
	@Override
	public void run() {
		int k = 10;

		while (k != 0 && !isInterrupted() ) {
			System.out.println("-" + isInterrupted() );
			
			try {
				this.sleep(1000); // RUNNABLE상태 -> 1초동안 일시정지
			} catch (InterruptedException e) {
				// e.printStackTrace(); 
				// 예외가 발생0 후 자동으로 Interrupted 상태가 false로 초기화
				// 초기화된 상태를 다시 true 바꾸기 위해서
				this.interrupt(); // false -> true 변경(추가)
			} // try
			
		} // while
		
		System.out.println("t 스레드 작업 중지");
		
	} // run
	
} // ThreadWorker
