package days29;

/**
 * @author Yelin
 * @date 2022. 3. 30. - 오후 2:37:34
 * @subject p748 표13-3 스레드의 상태
 * @content
 * 				[스레드의 상태] - main 스레드가 알려주는 것
 * 					NEW - 스레드가 생성되고 아직 start()가 호출되지 않은 상태
 * 				
 * 					RUNNABLE - OS로 부터 자원(CPU) 할당받아서 실행 중일수도 있고, 실행할 수 있는 대기 상태
 * 							start() 메서드를 호출한다고 해서 바로 실행되는 것이 아님, 실행 대기 상태
 * 							실제로 실행하는 스레드는 1개
 * 
 * 					TERMINATED - 해당 쓰레드가 작업을 종료한 상태(죽었다..)
 * 
 * 					TIMED_WAITING - sleep() 메서드에 의해서 해당 스레드가 일시정지 된 상태
 * 	
 * 					BLOCKED - 블러킹 당한 상태, 동기화 처리에 의해서 잠김(lock) 상태
 * 
 * 					WAITING - Object.wait() 메서드 호출하여 해당 스레드가 일싱정지된 상태
 * 															ㄴ Object.notify() / notifyAll() 메서드로 일시정지가 해제됨
 * 
 */
public class Ex08 {

	public static void main(String[] args) {
		// sleep() - RUNNABLE상태 -> 일시정지상태(TIMED_WAITING) -> n초후 자동으로 실행대기상태
		// wait() -  RUNNABLE상태 ->	WAITING ->  notify() / notifyAll() -> RUNNABLE상태
		
		SatusWorker t1 = new SatusWorker();
		// 1. t1 스레드 생성했지만, t1.start() 메서드는 호출하지 않은 상태
		System.out.println(t1.getState()); // NEW
		
		// 2. 실행대기상태
		t1.start();
		System.out.println(t1.getState()); // RUNNABLE
		/*
		- t1 바로 실행된다면 1, 2 값이 찍혀야 하는데 main 스레드가 t1의 상태를 알려주고 main이 끝난다음에 t1이 일을함
		RUNNABLE
		1.....
		2.....
		*/
		
		// 3. 4.
		try {
			Thread.sleep(3000); // main 쓰레드 n초동안 일시정지 상태된다. n초 후에 자동으로 실행대기 상태가 된다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // try
		
		// 3. t1.run() 처리 후 처리가 완료되면, 자동으로 스레드 종료 -> TERMINATED
		// 4. t1이 5초동안 sleep() 일시정지 상태, main 스레드가 3초 일시정지 후 TIMED_WAITING 상태를 찍어주고 2 값을 찍음
		System.out.println(t1.getState());
		
		// Ex09 관련 - 아직 t1 sleep(5000) 일시정지된 상태일 때 interrupt() 메서드로 호출해서 예외를 발생시키고 실행대기 상태가 된다.
		t1.interrupt();
		// System.out.println(t1.getState());
		
		System.out.println("main END");
	} // main

} // class

class SatusWorker extends Thread{

	@Override
	public void run() {
		
		System.out.println("1.....");
		
		// 3번 설명하실 때 추가함
		try {
			this.sleep(5000); // t1 스레드가 5초동안 일시정지
		} catch (InterruptedException e) {
			// e.printStackTrace();
			// Ex09 관련
			System.out.println(">>>>> InterruptedException 예외 발생");
		} 
		
		System.out.println("2.....");
		
	} // run
	
	
} // SatusWorker
