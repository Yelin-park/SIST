package days19;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오후 2:20:11
 * @subject p418 예제 8-3
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		int num = 100;
		int result = 0;

		for (int i = 0; i < 10; i++) {  // for문 까지 try로 묶어버리면 0이 나오고 나서는 catch 문을 만나고 프로그램 종료
			try {
				result = num / (int)(Math.random() * 10); // (int)(Math.random() * 10); -> 0~9 정수 중 0이 나와서 0으로 나누려고 했을 때 예외처리
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("0");
			}

		} // for i

		
	} // main

} // class
