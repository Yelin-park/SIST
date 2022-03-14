package days17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// MyApplication 클래스가 윈도우 리스너 역할까지 하도록 코딩
// this의 3번째용도 - 인자 설명
//                                  top-level window(윈도우, 창)
public class MyApplication extends Frame implements WindowListener{
	// 필드 선언 x
	// 메서드 선언 x
	
	// 디폴트 생성자
	public MyApplication() {
		System.out.println("> MyApplication 디폴트 생성자 호출");
		
		this.setTitle("새로운 창");
		this.setSize(400, 400);
		// this.addWindowListener(new MyAppWindowListener()); // 객체를 생성해야하니까 안에 new 연산자로 객체를 생성..
		this.addWindowListener(this);  // MyApplication 자기 자신이 리스너 역할을 한다. / this의 3번째 용도
		this.setVisible(true); // 보이도록 설정
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("프로그램 종료됩니다");
		System.exit(-1);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

} // MyApplication


/*
// [인터페이스 개념] implements 키워드 설명 -> 나중에 상세히 설명 예정 이거 다 암기 내용
// 리스너(청취자) 선언 : 윈도우 관련 이벤트(X 닫기 버튼 클릭)를 처리하는 리스너
class MyAppWindowListener implements WindowListener{

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// 닫히고 난 후에 작업
		
	}

	// 이벤트 핸들러
	// 메서드는 메서드인데 이벤트가 발생하면 호출되는 메서드
	@Override
	public void windowClosing(WindowEvent e) {
		// 닫히기 전에 물어보는 작업 등
		System.out.println("프로그램 종료됩니다");
		System.exit(-1);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
 } // MyAppWindowListener
*/