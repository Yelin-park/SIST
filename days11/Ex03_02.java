package days11;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 3. - 오후 2:05:10
 * @subject sw
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		int money;
		Scanner sc = new Scanner(System.in);
		System.out.println("> 머니를 입력하세요?");
		money = sc.nextInt();
		
		int unit = 50000;
		int count = 0;
		
		boolean sw = false;
		while (unit >= 1) {
			System.out.printf("%d원 : %d개\n", unit, count);
			count = money / unit;
			money %= unit;
			
			unit = unit / (sw ? 2 : 5); // sw가 true이면 2로 나누고 false이면 5로 나눠라
			sw = !sw;
		}


	} // main

} // class
