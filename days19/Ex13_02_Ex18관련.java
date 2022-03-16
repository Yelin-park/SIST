package days19;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오후 3:08:08
 * @subject Ex18 관련하여 사용자 예외 생성
 * @content ScoreOutOfBoundException
 *  
 */

public class Ex13_02_Ex18관련 {

	public static void main(String[] args) throws IOException{
		
		try {
			int kor = getScore();
			System.out.println(kor);
		} catch (ScoreOutOfBoundException e) {
			System.out.println(e.getERROR_CODE());
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("그 외의 예외 발생");
		}
		
	} // main
	
	// 0~100 사이의 점수를 입력받아서 반환하는 메서드
	public static int getScore() throws ScoreOutOfBoundException{ // Exception을 넣어도 업캐스팅해서 문제 X
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("> 점수를 입력하세요?");
		String data = sc.next();
		if(data.matches("[1-9]?\\d|100")) { 
			score = Integer.parseInt(data);
			return score;
		} else {
			// 사용자가 정의한 예외 클래스 사용
			// throw new ScoreOutOfBoundException("점수 범위(0~100) 벗어났다.");
			throw new ScoreOutOfBoundException(1001, "점수 범위(0~100) 벗어났다.");
		}
	} // getScore 메서드

} // class
