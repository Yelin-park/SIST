package days10;

/**
 * @author Yelin
 * @date 2022. 3. 2. - 오전 10:18:48
 * @subject 마상민씨 코딩의 문제점
 * @content
 */
public class Ex01_03 {

	public static void main(String[] args) {
		int first = 1;
		int second = 1;
		int sum = 0;
		int next = 0;

		//                 next
		// 34 + 55 + 89 + 144 + next
		//            f    s
		// 233까지 결과가 나옴
		while (next < 150) { // 144 < 150 참
			next = first + second; // next = 89+144 > 233
			first = second; // 144
			second = next; // 233
			sum += next; // 233
			System.out.println(next); // 233
		}
		
		// next = first + second;
		// while(next < 150)

	} // main

} // class
