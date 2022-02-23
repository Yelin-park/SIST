package days07;

/**
 * @author Yelin
 * @date 2022. 2. 23. - 오전 10:30:42
 * @subject **** p178 이름 붙은 반복문 ****
 * @content break 이름;
 *          continue 이름;
 */
public class Ex02 {

	public static void main(String[] args) {
		// break 문 : 제어문을 빠져나오는 문
		out:for (int j = 1; j <= 3; j++) {     // 1) out:for => for문의 이름을 OUT라고 지어줌
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				if(i == 5) break out;         // 2) break문 뒤에 for문의 이름을 붙이면 이름(out)붙인 for문까지 종료!
			} // i for
		}// j for
		System.out.println("end");

		
		
	} // main

} // calss
