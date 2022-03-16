package days19;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오후 3:08:08
 * @subject p427 메서드에 예외 선언하기
 * @content throw : 강제로 예외를 발생시키는 문
 * 			throws : 메서드의 예외를 선언하는 문 ***
 * 
 * 			[자바에서 예외를 처리하는 방법 2가지]
 * 			 1. try-catch 문 : 직접 예외를 처리하는 방법
 * 			 2. throws 문 : 떠넘기는 방법
 * 			
 * 			p426 쉬는시간에 읽어보기
 * 			컴파일러가 예외 처리를 확인하지 않는 RuntimeException "uncheked" 예외
 * 									확인 하는		Exception		"checked" 예외
 */
public class Ex13 {

	public static void main(String[] args) throws IOException{
		
		// IOException 처리
		// int one = System.in.read();  // IOException 예외 발생, read() 메서드가 throws를 하고 있어서 예외를 처리해줘야함
		
		try {
			int kor = getScore();
			System.out.println(kor);
		} catch (InputMismatchException e) {
			System.out.println("점수 입력 잘못!");
		} catch (Exception e) {
			System.out.println("그 외의 예외 발생");
		}
		

	} // main
	
	// 0~100 사이의 점수를 입력받아서 반환하는 메서드
	// 메서드 안에서 예외가 발생할 수 있으니까 메서드 호출시 예외처리문을 떠넘겨라
	public static int getScore() throws InputMismatchException{
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("> 점수를 입력하세요?");
		String data = sc.next();
		if(data.matches("[1-9]?\\d|100")) { // ?가 있어야 0~100이고 ?없으면 10~100
			score = Integer.parseInt(data);
			return score;
		} else {
			// 강제로 예외를 발생시키겠다.
			// [Ex18] InputMismatchException 설명 : 입력불일치예외
			// 내가 만든 예외로 발생을 처리시키고싶다.
			throw new InputMismatchException("점수 범위(0~100) 벗어났다.");
		}
	}
	
	// 메서드 선언 부분
	/*
	void method() throws NullPointerException, ArithmeticException, IOException{
		
	}
	*/

} // class
