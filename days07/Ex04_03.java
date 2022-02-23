package days07;

import java.io.IOException;

/**
 * @author Yelin
 * @date 2022. 2. 23. - 오후 12:14:00
 * @subject 확장 ASCII 코드로 문자 출력하기
 * @content 10개 라인을 출력하고 '계속하라면 엔터를 치세요' 추가(엔터를 쳐야 다음 10개 라인을 출력)
 */
public class Ex04_03 {

	public static void main(String[] args) throws IOException {
		
		// 10개의 라인을 출력하고 난 후 엔터를 쳐야 다음 10개 라인을 출력할 수 있도록 코딩..
		
		// ㄱ. 10개 라인 출력 인식 - 메시지, 멈추고 물어보는 일   > lineNumber가 10의 배수인지 체크
		int lineNumber = 1;
		for (int i = 0; i <= 255; i++) {
			if(i % 10 == 0)	System.out.printf("%d :", lineNumber++);
			System.out.printf("[%c]", i);
			if(i % 10 == 9) {
				System.out.println();
				if(lineNumber % 10 == 1) {
					System.out.println("> 계속하려면 엔터 치세요.");
					System.in.read(); // 엔터 치기 전까지는 멈추기 위한 코드
					System.in.skip(System.in.available());
				}
			}
			
			/*
			if(lineNumber % 10 == 0) {
				System.out.println("> 계속하려면 엔터 치세요.");
			}
			*/
		}

	} // main

} // class
