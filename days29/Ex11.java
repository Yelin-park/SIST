package days29;

import javax.swing.JOptionPane;

/**
 * @author Yelin
 * @date 2022. 3. 30. - 오후 3:52:58
 * @subject p752 스레드의 작업을 취소하는 메서드
 * @content
 * 			- interrupt() : 스레드 작업 취소를 단지 요청만 한다. 실제로는 강제로 종료되지 않는다.
 * 							interrupted 상태만을 false -> true 변경하는 일만 한다.
 * 							개발자가 코딩으로 interrupted 상태가 변경되었는지만 체크한다면 스레드를 강제 종료시킬 수 있다.
 * 			- interrupted() 
 */
public class Ex11 {

	public static void main(String[] args) {
		
		ThreadWorker t = new ThreadWorker();
		t.start();
		
		// main 블러킹
		String inputData = JOptionPane.showInputDialog("아무값이나 입력하세요.");
		System.out.println(inputData);
		t.interrupt(); // 작업 취소 요청만 하고, isInterrupted상태가 false에서 [true로 변경]
		System.out.println(t.isInterrupted()); // t/f 어떤 값이 나오는지 확인 -> true
		
		System.out.println("main END");
		
	} // main

} // class

class ThreadWorker extends Thread{
	
	@Override
	public void run() {
		int k = 10;
		// isInterrupted() : isInterrupted라는 상태를 반환하는 메서드이다. true / false 반환
		//						쓰레드에 대해 interrupt() 가 호출되었는지 알려준다. 호출되었다면 true, 호출되지않았다면 false
		while (k != 0 && !isInterrupted() ) {
			System.out.println("-");
			// this.sleep(1000); 실행스레드 -> 일시정지 == 일을 중단
			// 처리되는 시간이 좀 걸리도록 코딩(지연시간) == 계속 돌면서 일을 하는 중이고 시간만 가는 것
			for (long i = 0; i < 2500000000L; i++) { } 
			
		} // while
		
		System.out.println("t 스레드 작업 중지");
		
	} // run
	
} // ThreadWorker

/*
 * 							interrupt()
 * t1.sleep(5000) -> 5초 일시정지 -> 예외발생 -> 종료
 * 
 */