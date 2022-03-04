package days12;

import java.util.Random;

/**
 * @author Yelin
 * @date 2022. 3. 4. - 오전 9:41:48
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 한글 '가' 44032 ~ '힣' 55203
		// 'A' 65 'B' 66 'Z' 90
		
		/*
		for (int i = '가'; i <= '힣'; i++) {
			System.out.printf("%c\t%d\n",i,i);
		}
		*/
		
		Random rnd = new Random();
		System.out.println(rnd.nextInt(11172) + 44032);
		System.out.println((char)(rnd.nextInt(11172) + 44032));
		
		System.out.print("김");
		for (int i = 0; i < 2; i++) {
			System.out.print((char)(rnd.nextInt(11172) + 44032));
		}

	} // main

} // class
