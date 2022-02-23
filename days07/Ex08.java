package days07;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 23. - 오후 5:34:07
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// 가위바위보 유효성 검사
		Scanner sc = new Scanner(System.in);
		int user;
		String sUser;
		String regex = "[1-3]"; 
		
		do {
			System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
			sUser = sc.next();
		} while (!sUser.matches(regex));
		
		user = Integer.parseInt(sUser);
		

		
		
		
	} // main

} // class
