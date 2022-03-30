package days29;

import javax.swing.JOptionPane;

/**
 * @author Yelin
 * @date 2022. 3. 30. - 오후 12:39:45
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// 프로그램 시작 - main 스레드 1개뿐
		// 블러킹 - 입력창을 띄우고 입력을 하지 않으면 다음 작업으로 넘어갈 수 없음
		
		// 입력용 대화상자를 띄워서 출력하는 스레드를 만들어서 코딩을 수정하자
		Runnable target = new ShowInputDataPrint();
		Thread 대화상자 = new Thread(target);
		대화상자.setName("showData");
		대화상자.start();
		
		// 장보기, 방청소 등 다른 작업
		System.out.println("END");

	} // main

} // class

class ShowInputDataPrint implements Runnable{

	@Override
	public void run() {
		String inputData = JOptionPane.showInputDialog("아무값이나 입력하세요.");
		System.out.println(inputData);
	} // run
	
} // ShowInputDataPrint
