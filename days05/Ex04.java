package days05;

import java.util.Iterator;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오후 12:21:45
 * @subject [for 반복문]  과 [while 조건반복문]
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// [for 반복문] - 10번 반복해서 출력   -> 만 번 출력... 노답~
		/*
		System.out.println("1-헬로우월드");
		System.out.println("헬로우월드");
		System.out.println("헬로우월드");
		System.out.println("헬로우월드");
		System.out.println("헬로우월드");
		System.out.println("헬로우월드");
		System.out.println("헬로우월드");
		System.out.println("헬로우월드");
		System.out.println("헬로우월드");
		System.out.println("10-헬로우월드");
		*/
		
		// 초기값을 1로 설정해서 10까지 출력하는게 더 좋은 코딩!
		/*
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " - 헬로우 월드");
		}
		
		// for 형식
		/*
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + " - 헬로우 월드");
		}
		*/
		
		// [시험]
		// 1~10까지의 합 구해서 출력
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "+");
			sum = sum + i;
		}
		System.out.println("=" + sum);
		

		
		// *** ㄱ -> ㄴ(0 < 10) 조건식 true -> {} 블럭 수행 -> ㄷ(1) ***
		//     ㄱ -> ㄴ(1 < 10) 조건식 true -> {} 블럭 수행 -> ㄷ(2)
		//     ㄱ -> ㄴ(2 < 10) 조건식 true -> {} 블럭 수행 -> ㄷ(3)
		//     ㄱ -> ㄴ(9 < 10) 조건식 true -> {} 블럭 수행 -> ㄷ(10)
		//     ㄱ -> ㄴ(10 < 10) 조건식 false -> for문 종료
		
		//for ( 초기식(ㄱ); 조건식(ㄴ); 증감식(ㄷ)) {
		//}
		
		
		// [while 조건반복문]

	} // main

} // class
