package days06;

/**
 * @author Yelin
 * @date 2022. 2. 22. - 오전 11:34:12
 * @subject 중첩 for문 == 다중 for문
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// for     i, j = 반복변수 > 이름을 길게 주지말고 짧게 줘야함
		/*
		 i = 1
			j = 1,2,3,4,
		 i = 2
			j = 1,2,3,4,
		 i = 3
			j = 1,2,3,4,
		 */
		for (int i = 1; i <= 3; i++) {
			System.out.println("i = " + i);
			
			System.out.print("\tj = ");
			for (int j = 1; j <= 4; j++) {
				System.out.print(j + ",");
			} // j for
			System.out.println(); // 개행(줄바꿈)
		} // i for

	} // main

} // class
