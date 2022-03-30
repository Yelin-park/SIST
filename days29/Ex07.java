package days29;

/**
 * @author Yelin
 * @date 2022. 3. 30. - 오후 2:20:04
 * @subject	p738 스레드의 우선순위(priority)
 * @content			ㄴ 멀티 스레드 : OS 자동 관리( 자원(CPU) 할당 )
 * 					ㄴ 멀티 스레드 중에 우선순위를 설정할 수 있다. - setPriority(1~10) 기본값은 5
 * 					ㄴ 우선순위는 10이 제일 높고 1이 제일 낮다.
 * 
 * 				OS 관리 - 멀티태스킹(프로세스) -> 그 프로세스 안에 있는 멀티스레드를 CPU가 시분할(시간분할)을 한다.
 * 				[X 프로세스] 10초							[Y 프로세스] 10초
 * 				A	3.3초 	6초  우선권(10)				A	5초
 * 				B	3.3초	3초							B	5초
 * 				C	3.3초	1초			
 * 
 * 				10(우선권 제일 높은 값) 의미 == 특정 스레드가 더 많은 작업 시간을 갖도록 하는 설정
 * 
 */
public class Ex07 {

	public static void main(String[] args) {
		// 내가 우선권을 주더라도 OS가 관리하기 때문에 우선권이 높은 스레드가 먼저 끝나지는 않을 수 있음
		// 그럼에도 불구하고 특정 스레드가 더 많은 작업 시간을 갖도록하여 빨리 끝날 수 있도록 하는 것...
		
		PriorityWorker[] t = new PriorityWorker[10]; // 스레드 클래스 배열
		
		for (int i = 0; i < t.length; i++) {
			t[i] = new PriorityWorker();
			t[i].setName("t" + (i+1));
			t[i].setPriority(i+1); // t1, t2 ~ t10
							// 우선권   1  2    10
		} // for i
		
		for (int i = 0; i < t.length; i++) {
			t[i].start();
		} // for i
		
		System.out.println("main END");
		
	} // main

} // class

class PriorityWorker extends Thread{

	@Override
	public void run() {
		String tName = this.getName();
		int tPriority = this.getPriority(); // 현재 이 스레드가 설정되어있는 우선권 값이 얼마인지 확인할 수 있는 메서드
		
		for (int i = 0; i < 10000; i++) {
			try {
				this.sleep(1); // 주어진 시간만큼 자신은 일을 안하고 다른 스레드에게 실행 상태를 넘기겠다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // try
		} // for i
		
		System.out.printf("%s 스레드 : 우선권[%d] 종료\n", tName, tPriority);
		
	} // run
	
} // PriorityWorker

/*
END
t1 스레드 : 우선권[1] 종료
t6 스레드 : 우선권[6] 종료
t5 스레드 : 우선권[5] 종료
t3 스레드 : 우선권[3] 종료
t4 스레드 : 우선권[4] 종료
t2 스레드 : 우선권[2] 종료
t7 스레드 : 우선권[7] 종료
t10 스레드 : 우선권[10] 종료
t8 스레드 : 우선권[8] 종료
t9 스레드 : 우선권[9] 종료
*/
