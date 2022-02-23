package days07;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 23. - 오후 4:23:36
 * @subject p150 예제 4-7
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// user(사용자)와 com(컴퓨터) 가위바위보 게임
		// user 1/2/3 입력  가위(1), 바위(2), 보(3)
		// com 임의의 수 발생 1 <= Math.random() <= 3
		// 승부 판가름 로직
		// user - com = 0 무승부
		// user - com = 1 또는 -2 user 승리
		// 그 외 com 승리
		// user - com = 2 또는 -1 com 승리
		
		// user 1 2 3
		// com  2 3 1
		//     -1 -1 2  이기는 경우
		
		// user 1 2 3
		// com  3 1 2
		//     -2 1 1  지는 경우
		
		int user, com;
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
		
		Scanner sc = new Scanner(System.in);
		// 1. *** 숫자 1,2,3 유효성 검사를 한 후에 user 변수에 저장(책에서는 유효성검사 코딩 x)
		// 2. 컴퓨터는 '가위'를 냈다.
		// 3. 다시 게임할거니? y
		String tmp = sc.nextLine();
		user = Integer.parseInt(tmp);
		
		com = (int)(Math.random() * 3) + 1;
		
		System.out.println("당신은" + user + "입니다.");
		System.out.println("com은" + com + "입니다.");
		
		switch (user - com) {
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break;
		}

	} // main

} // class
