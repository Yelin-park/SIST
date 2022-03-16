package days19;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오후 4:10:19
 * @subject p436 자동 자원 반환 try-with-resources문
 * @content JDK 1.7부터 새로 추가된 구문
 * 			주로 IO(입출력)와 관련된 클래스 사용할 때 유용하다.
 */
public class Ex17 {

	public static void main(String[] args) {
		/*
		// Resource leak: 'sc' is never closed
		// 리소스(자원) 누출 : sc(스캐너)가 닫히지 않았다.
		Scanner sc = new Scanner(System.in);
		
		sc.next();

		sc.close(); // 사용하던 리소스(자원)을 반환한다.(닫기)
		*/
		
		// [try-with-resources] : 자동 자원 반환
		try(Scanner sc = new Scanner(System.in)) { // 이 코딩으로 인해서 자동으로 자원을 반환
			//
			//
			sc.next();
			//
			//
			// sc.close(); -> 코딩 할 필요 X
		} finally {
			
		}

	} // main

} // class
