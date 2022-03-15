package days18;

/**
 * @author Yelin
 * @date 2022. 3. 15. - 오후 4:49:59
 * @subject p390 인터페이스 사용하는 이유 즉, 장점
 * @content
 */
public class Ex16 {

	public static void main(String[] args) {
		// 1. 개발 시간을 단축
		//		클래스를 작성하지않아도 인터페이스를 구현한 것만으로도 프로그램 작성하는 것이 가능하여 양쪽에서 동시 개발 가능
		//		예) java 애플리케이션  - (연동하기 위한)클래스, 객체, 물건 DBconn.java    -      DB
		IDBconn dbconn = null;
		dbconn.close();
		dbconn.open();
		
		// 2. 표준화가 가능하다.
		// 인터페이스를 구현하면 안에 있는 내용을 오버라이딩하기 때문에 똑같다.
		
		// 3. ~~~내일 수업~~~

	} // main

} // class

// 인터페이스만 선언
interface IDBconn{
	void open();
	void close();
	void insert();
	void delete();
	void update();
}

// 2. 표준화 가능
class DBconn implements IDBconn{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
}

