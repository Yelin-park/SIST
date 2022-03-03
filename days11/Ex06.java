package days11;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 3. - 오후 4:35:30
 * @subject 배열의 단점
 * @content  1. 배열의 크기를 설정한 후에는 배열의 크기가 자동으로 변경되지 않는다.       --> 컬렉션(Collection) 사용
 * 				-> 개발자의 능력에 따라서 배열 크기 증가(변경)해서 사용할 수는 있다.
 * 			 2. 
 */
public class Ex06 {

	public static void main(String[] args) {
		// 배열 크기를 3으로 설정
		int[] m = new int[3];
		Scanner sc = new Scanner(System.in);
		int idx = 0; // 맨 처음에 집어넣을 배열의 인덱스 값
		char con = 'y';
		
		// 입력 반복문
		do {
			
			// 배열크기 남는 것이 있는지 확인 -> 배열 크기가 부족하다면 배열 크기 증가
			// idx 3
			if(idx == m.length) m = Ex04_04.increaseArraySize(m, 3);
			
			
			
			System.out.printf("> m[%d]에 어떤 정수 값을 입력하겠습니까?", idx);
			m[idx++] = sc.nextInt();
			// idx++; > 위로 코딩 수정하기
			System.out.print("> 계속 하시겠습니까?");
			con = sc.next().charAt(0);
		} while (Character.toUpperCase(con) == 'Y'); // (con == 'y' || con == 'Y') 와 같은 코딩
		// Character.toUpperCase(con) -> char 소문자를 대문자로 변환
		
		// 출력(확인)
		System.out.println(Arrays.toString(m));

	} // main

} // class
