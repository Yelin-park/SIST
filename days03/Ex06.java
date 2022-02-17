package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Yelin
 * @date 2022. 2. 17. - 오후 2:02:54
 * @subject 표준입력
 * @content
 */
public class Ex06 {

	public static void main(String[] args) throws IOException {
		// 표준 입력장치(키보드)로부터 입력받아서 출력
		// 한줄 코딩 암기
		
		// 자바 언어 : 모든 입력, 출력(Input/Output == IO)은 스트림(Stream)
		// 스트림 2가지 종류 : 텍스트(문자) 스트림, 바이트(0/1) 스트림
		// System.in > 입력스트림은 바이트스트림        A -> 문자코드 65
		// 0100 0001 65 -> A
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// br 변수를 통해서 읽기 작업을 하면 키보드로부터 입력한 값을 읽을 수 있다.
		// [주의] > import문이 있어야 된다.
		// import java.io.BufferedReader; 
		// import java.io.InputStreamReader;
		// 필요한 모든 import 구문 자동 완성 단축키 : Ctrl + Shift + O
		// 두 개의 패키지 안에 있으면 대화상자가 띄워져서 선택하라고 하기도 함
		
		// InputStreamReader > 바이트스트림을 문자스트림으로 변환하는 클래스객체
		// [키보드]  -> System.in 입력스트림  -> InputStreamReader 클래스(바이트스트림으로 변환)  ->   BufferedReader 클래스(문자열로 변환)
		//   A            0100 0001                 'A''B'                                                  "ABC"
		
		String name;
		System.out.print(">이름을 입력하세요?");
		
		// 메소드 3가지? 기능, 매개변수, 리턴값(null/String)
		// readLine()의 리턴자료형이 String이기 때문에 String 자료형을 가지고 있는 name 변수를 사용
		// Chapter 08 : 예외(Exception) == 에러
		// 에레메시지 : Unhandled exception type IOException
		// 해석 :       처리되지 않았다. IOException(IO예외)를 처리되지 않았다.
		// [암기] > Add throws declaration
		name = br.readLine(); // read 읽기 + Line 한 라인 >  입력한 한 줄을 다 읽겠다.      [블러킹] : br.readLin() 여기서 막혔음 입력하지 않아서
		
		System.out.printf("이름은 %s 입니다.", name);

	}

}
