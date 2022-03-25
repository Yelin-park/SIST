package days26;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

/**
 * @author Yelin
 * @date 2022. 3. 25. - 오후 2:18:22
 * @subject *** p658 Properties 컬렉션 클래스 ***
 * @content		1. Property == 속성, 속성들을 저장할 때 많이 사용하는 컬렉션 클래스
 * 				2. 애플리케이션의 '환경설정'하는 값들을 저장하고 읽기 위한 용도로 주로 사용됨
 * 				3. 속성명 = 속성값 한쌍으로 저장
 * 					key    value
 * 				4. Map 인터페이스를 구현한 컬렉션 클래스
 * 				5. (특징) key, value의 자료형이 모두 String
 * 					HashMap<String, String> == Properties 같은 의미
 * 						차이점 ? 파일 저장/읽기 할 수 있는 메서드가 Properties에 구현이 되어져 있음(HashMap은 없음)
 * 						파일명.properties -> Properties 컬렉션 클래스를 사용한 읽기, 쓰기, 저장하는 파일
 * 						store() 메서드 -> 파일 쓰기
 * 						load() 메서드 -> 파일 읽기
 * 
 * 						String className = "oracle.jdbc.driver.OracleDriver"; 	-> DB 연결할 때 필요한 클래스명(fullName)
 *    					String url = "jdbc:oracle:thin:@localhost:1521:xe"; 	-> DB를 연결할 때 필요한 서버
 *         				String user = "scott";									-> DB를 연결할 계정(사용자)
 *         				String password = "tiger";								-> 계정의 비밀번호
 * 
 */
public class Ex06 {

	public static void main(String[] args) {
		Properties p = new Properties(); // HashMap처럼 Map이라고 보면 됨
		
		// 데이터를 추가하는 메서드 setProperty() 메서드를 사용하자
		// p.put(key, value);  // Map에서 물려받아서 put이 있음
		p.setProperty("className", "oracle.jdbc.driver.OracleDriver"); // Property를 사용하는 것이 좋음
		p.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
		p.setProperty("user", "scott");
		p.setProperty("password", "tiger"); 
		
		// 가져오는 메서드도 getProperty() 메서드를 사용하자 (명시적으로 알 수 있으니까)
		// System.out.println(p.get("user"));
		System.out.println(p.getProperty("user"));
		
		String dir = System.getProperty("user.dir");
		String fileName = dir + "\\src\\com\\util\\jdbc.properties"; // 확장자가 properties를 가지면 환경설정을 하기 위해서 Properties로 만들어진 파일이다.
		
		try(Writer writer = new FileWriter(fileName);) {
			String comments = ">JDBC 환경설정 값<";
			p.store(writer, comments); // setProperties한 환경설정 값을 파일로 저장하기
			System.out.println("END");
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // main

} // class
