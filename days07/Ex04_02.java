package days07;

/**
 * @author Yelin
 * @date 2022. 2. 23. - 오후 12:14:00
 * @subject 확장 ASCII 코드로 문자 출력하기
 * @content 각 라인마다 라인번호(Line Number) 붙이기
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// 각 라인마다 라인번호(Line Number)를 붙이고 싶다. 
		
		// 2번 풀이 : 좋은 코딩
		int lineNumber = 1;
		for (int i = 0; i <= 255; i++) {
			if(i % 10 == 0) System.out.printf("%d :", lineNumber++);
			System.out.printf("[%c]", i);
			if(i % 10 == 9) System.out.println();
		}
		
		/*
		// 1번 풀이
		for (int i = 0; i <= 255; i++) {
			if(i % 10 == 0) System.out.printf("%d :", i/10+1);
			System.out.printf("[%c]", i);
			if(i % 10 == 9) System.out.println();
		}
		*/
		
 
		 // 1 : [0][][][][][][][][][9] 개행     i/10    0
		 // 2 : [10][][][][][][][][][19] 개행           1
		 // 3 : [20][][][][][][][][][29] 개행           2
		 // 4 : [30][][][][][][][][][39] 개행           3

	} // main

} // class
