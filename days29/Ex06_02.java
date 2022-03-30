package days29;

import javax.swing.JOptionPane;

/**
 * @author Yelin
 * @date 2022. 3. 30. - 오후 12:39:45
 * @subject 스레드
 * @content
 * 				Runnable : 다른 클래스를 상속 받지 않아도 되면 인테페이스로 구현
 * 				Thread : 다른 클래스를 상속받아야 할 때 사용
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 프로그램 시작 - main 스레드 1개뿐
		// 블러킹 - 입력창을 띄우고 입력을 하지 않으면 다음 작업으로 넘어갈 수 없음
		
		// t1과 t2는 각자 일한다. 대화상자가 나타나고 for문도 돌아가는 중.. for문이 끝나도 대화창에 입력할 수 있고 진행 중에도 입력할 수 있다. 진행 중에 입력해도 for문은 돌아감
		// 입력용 대화상자를 띄워서 출력하는 스레드를 만들어서 코딩을 수정하자
		Thread t1 = new InputThread();
		t1.setName("input ");
		t1.start();
		
		// for문을 돌리는 스레드
		Thread t2 = new ForThread();
		t2.setName("for");
		t2.start();
		
		// 장보기, 방청소 등 다른 작업
		System.out.println("END");

	} // main

} // class

class ForThread extends Thread{

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		for (int i = 0; i < 20; i++) {
			System.out.printf("[%s] - %d\n", tName, i);
			
			long millis = 1000; // 1000 == 1초
			try {
				Thread.sleep(millis); // 현재 실행중인 스레드를 millis 만큼 재운다. -> 대충 이렇게 알고 있기 자세한 설명은 나중에...
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // try
			
		} // for i
		
	} // run
	
} // ForThread

// [대화상자에 인해서 블러킹을 당하는게 아니라 다른 스레드를 사용하므로 main스레드는 종료가 되어짐]
class InputThread extends Thread{

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		// BLOCKED 상태 		확인/취소 버튼 클릭 -> 실행대기상태(RUNNABLE)
		String inputData = JOptionPane.showInputDialog("[" + tName + "]" +"아무값이나 입력하세요.");
		System.out.println(inputData); // 언젠가 실행상태가 되면 출력하고 스레드는 종료
	} // run
	
} // InputThread

