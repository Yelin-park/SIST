package days04;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 18. - 오후 4:47:00
 * @subject 두 문자열을 비교할 때는 equlas(); 라는 메소드를 사용하는 예제
 * @content
 */
public class Ex12 {

	public static void main(String[] args) {
		String name1 = "홍길동";
		
		// Scanner를 사용해서 이름을 "홍길동"으로 입력 받아서 name2 변수에 저장
		
		Scanner sc = new Scanner(System.in);
		System.out.print("> 이름 입력하세요: ");
		String name2 = sc.next();
		
		System.out.println("> name1 :" + name1);
		System.out.println("> name2 :" + name2);
		
		// name1에 있는 문자열과 name2에 있는 문자열이 같은지 다른지 확인
		// System.out.println(name1 == name2);  // true/false 중 false가 나옴 why??
		
		//[암기] 문자열을 비교할 때는 == 연산자를 사용하면 안되고   ->  그이유는 클래스 수업할 때
		//                            equlas() 메소드를 사용해야된다.
		System.out.println(name1.equals(name2));

	}

}
