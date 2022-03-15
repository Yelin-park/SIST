package days18;

// import java.util.Scanner;
// import java.util.Random;
// import java.util.*;  // util 패키지 안에 있는 모든 클래스 사용 -> 편리하지만 사용하지 않는 클래스도 import 하기에 좋은 코딩 x
// [주의] import java.*;	 // 하위 패키지는 포함 x, 단지 클래스만 포함
// import java.lang.*; // 컴파일할 때 자동으로 추가 됨

// [static import 문]
import static java.lang.Math.random;  // Math를 안붙이고 random()으로만 사용가능
import static java.lang.Math.*;  	  // Math 클래스 안에 있는 모든 메서드

/**
 * @author Yelin
 * @date 2022. 3. 15. - 오전 9:37:40
 * @subject p336 package와 import
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// A 개발자 : DBconn 클래스 생성  -> 고유패키지.DBconn 클래스   -> 패키지명은 도메인으로 많이 사용
		// B 개발자 : DBconn 클래스 생성  -> 고유패키지.DBconn 클래스
		// C 개발자 : A, B의 DBconn 클래스(같은이름)를 사용한다면 이름이 똑같기 때문에 충돌이 발생 -> 출동 발생 방지 목적
		
		// 패키지(package) ? 서로 관련된 클래스, 인터페이스들의 묶음
		// 목적 : 클래스를 효율적으로 관리, 사용, 유지보수
		
		// [기억] 풀네임(full name)을 적으세요?  패키지명.패키지명...클래스명  ex) days17.Employee / java.utill.Date
		
		// 클래스 -> 물리적 : 파일
		// 패키지 -> 물리적 : 폴더(디렉토리)
		
		// 패키지명 : 소문자 사용 권장(원칙)
		// 자바에서는 대문자(시작)는 클래스명
		
		// [import문] 설명
		// 다른 패키지 안의 클래스를 사용하려면 패지키명.클래스명으로 사용해야된다.
		// 아래 선언방식이 원칙이지만 import를 사용해서 코드를 짧게 만들 수 있음
		// Scanner sc = new Scanner(System.in);
		// java.util.Scanner scanner = new java.utll.Scanner(System.in);
		// java.lang.System.out.println("홍길동");
		// Random rnd;
		
		// [static import 문]
		// Math 클래스 안의 모든 메서드는 static 메서드이다.
		//						클래스명.메서드명()
		System.out.println( Math.random() );
		System.out.println( Math.random() );
		System.out.println( Math.random() );
		
		System.out.println( random() );
		
	} // main

} // class
