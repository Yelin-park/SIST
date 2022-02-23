package days07;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 23. - 오후 4:23:36
 * @subject p150 예제 4-7
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		// 1. *** 숫자 1,2,3 유효성 검사를 한 후에 user 변수에 저장(책에서는 유효성검사 코딩 x)
		// 2. 컴퓨터는 '가위'를 냈다.
		// 3. 다시 게임할거니? y
		
		// 2. ex) 컴퓨터는 보를 냈다. (배열을 선언해서 처리)
		String[] rockPaperScissors = {"가위", "바위", "보"};
		
		Scanner sc = new Scanner(System.in);
		int user, com;
		
		char con; // y OR n 입력
		do {
			// 1. 유효성검사
			String sUser;
			String regex = "[1-3]"; 
			
			do {
				System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
				sUser = sc.next();
			} while (!sUser.matches(regex));
			
			user = Integer.parseInt(sUser);
			
			com = (int)(Math.random() * 3) + 1;
			
			System.out.printf("당신은 \"%s\"를 냈다.\n", rockPaperScissors[user-1]);
			
			// 2. ex) 컴퓨터는 보를 냈다. (배열을 선언해서 처리)
			System.out.printf("컴퓨터는 \"%s\"를 냈다.\n", rockPaperScissors[com-1]);
			
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
			} // switch
			
			System.out.println("> 가위바위보 게임 계속 하시겠습니까?(y/n)");
			con = sc.next().charAt(0); // 'y'  'n'
		} while (con == 'y' || con == 'Y');
		
		System.out.println("게임 종료!");
		
		
		
		
		/*
		// 내가 푼 코딩
		int user, com;
		Scanner sc = new Scanner(System.in);
		String tmp;
		char r;
		
		do {
			do {
				System.out.print("> 가위(1), 바위(2), 보(3) 중 하나를 입력하세요.> ");
				tmp = sc.next();
			} while ( !tmp.matches("[1-3]"));
			
			user = Integer.parseInt(tmp);
			
			com = (int)(Math.random() * 3) + 1;
			
			switch(com) {
			case 1:
				System.out.println("컴퓨터는 '가위'를 냈습니다.");
				break;
			case 2: 
				System.out.println("컴퓨터는 '바위'를 냈습니다.");
				break;
			case 3: 
				System.out.println("컴퓨터는 '보'를 냈습니다.");
				break;	
			}
			
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
			
			System.out.println("다시 게임을 하시겠습니까?(y/n)");
			r = sc.next().charAt(0);
		} while(r == 'y' || r == 'Y');

		*/

	} // main

} // class
