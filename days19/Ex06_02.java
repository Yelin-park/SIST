package days19;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오전 11:33:19
 * @subject 익명클래스 예제
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		new MyForm();
		
		// 윈도우 [x] 닫기 버튼 클릭하면 프로그램 종료
		// 1. 자바 이벤트 처리 방법 2가지
		// 		1) 리스너(청취자) 필요
		// 			윈도우 이벤트 발생 -> 리스너(청취자) -> 이벤트 핸들러
		//		2) 어댑터 *** : 리스너를 사용하니깐 필요없는 이벤트 핸들러도 오버라이딩

	} // main

} // class

class MyForm extends Frame{
	
	// 버튼
	// Button은 클래스, btnExit 이름
	Button btnExit;
	
	// 디폴트 생성자
	MyForm() {
		this.setTitle("새로운 윈도우(창)");
		this.setSize(400, 400);
		// [리스너] 
		// this.addWindowListener(new MyFormWindowListener());	// 2. 윈도우리스너 객체 생성
		// [리스너] 
		// 윈도우리스너 클래스를 선언하고 객체를 생성하지말고 익명클래스로 만들기
		// 선언과 생성을 동시에 하는 익명클래스
		/*
		this.addWindowListener(new WindowListener() {
			// 윈도우리스너 추가 (new 윈도우리스너 -> 인터페이스)
			
			@Override
			public void windowOpened(WindowEvent e) {}
			
			@Override
			public void windowIconified(WindowEvent e) {	}
			
			@Override
			public void windowDeiconified(WindowEvent e) {	}
			
			@Override
			public void windowDeactivated(WindowEvent e) {	}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("프로그램 종료!!");
				System.exit(-1);
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {	}
			
			@Override
			public void windowActivated(WindowEvent e) {	}
			
		} );
		*/
		
		// [어댑터]
									// 인터페이스 업캐스팅
		// this.addWindowListener(new MyFormWindowAdapter());
		
		// [어댑터] 익명클래스
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("프로그램 종료!!");
				System.exit(-1);
			}
		} );
		
		// btnExit 버튼 초기화(설정)
		// this.setVisible(true); 눈에 보여지기 전에 설정~ -> 위치는 상관없긴함
		this.btnExit = new Button("exit Button"); // 필드값 초기화
		// this.btnExit.setLabel(label); 		  // 이렇게 set메서드로 설정해도됨

		// 버튼을 클릭해도 이벤트 처리가 안되니 아래 코딩으로 이벤트 처리하기 -> 익명클래스로
		this.btnExit.addActionListener(new ActionListener() {
			// ActionListener 클래스 안에 actionPerformed 메서드만 있어서 아래와 같이 오버라이딩 1개만 됨
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("종료 버튼 클릭됨");
			}
		});
		
		this.add(btnExit); // 생성한 버튼을 추가하겠다.
		
		// 윈도우 배치(layout) 설정 아직 안함
		this.setVisible(true);
		
	} // MyFrom 디폴트 생성자
	
} // MyForm class

// [어댑터]
// 1.윈도우어댑터 클래스 선언
class MyFormWindowAdapter extends WindowAdapter{
	// WindowAdapter는 WindowListener 인터페이스로 구현한 클래스이고
	// 그 클래스를 상속받아서 윈도우어댑터 클래스 선언
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("프로그램 종료!!");
		System.exit(-1);
	}
	
} // MyFormWindowAdapter

/*
// [리스너] 
// 1. 리스너 중 윈도우리스너 클래스 선언
// (윈도우 이벤트를 처리해야하기 때문에 WindowListener 인터페이스로 구현)
class MyFormWindowListener implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("프로그램 종료!!");
		System.exit(-1);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowOpened(WindowEvent e) {}
	
} // MyFormWindowListener
*/