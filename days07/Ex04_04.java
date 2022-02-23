package days07;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 23. - 오후 12:14:00
 * @subject 확장 ASCII 코드로 문자 출력하기 -> Scanner를 활용하여 풀기
 * @content 10개 라인을 출력하고 '계속하라면 엔터를 치세요' 추가(엔터를 쳐야 다음 10개 라인을 출력)
 */
public class Ex04_04 {

	public static void main(String[] args) throws IOException {
		
		int lineNumber = 1;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i <= 255; i++) {
			if(i % 10 == 0)	System.out.printf("%d :", lineNumber++);
			System.out.printf("[%c]", i);
			if(i % 10 == 9) {
				System.out.println();
				if(lineNumber % 10 == 1) {
					System.out.println("> 계속하려면 엔터 치세요.");
					scanner.nextLine(); // 일시정지
					/* nextLine() 설명
					 Advances this scanner past the current line and returns the inputthat was skipped.
					 This method returns the rest of the current line, excluding any lineseparator at the end.
					 The position is set to the beginning of the nextline.
					 Since this method continues to search through the input lookingfor a line separator,
					 it may buffer all of the input searching forthe line to skip if no line separators are present.
					 */
					/*
					 // next() 설명
					 Finds and returns the next complete token from this scanner.
					 A complete token is preceded and followed by input that matchesthe delimiter pattern.
					 This method may block while waiting for inputto scan, even if a previous invocation of hasNext() returned true.
					 */
				
				} //linenumber if
			} // i if
		} // i for
	} // main

} // class
