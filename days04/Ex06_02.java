package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Yelin
 * @date 2022. 2. 18. - 오후 2:09:18
 * @subject 삼항연산자 + BufferedReader 예제
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// [문제]
		// 조건 : 삼항 연산자를 사용하세요.
		// 두 정수 x,y를 키보드에서 입력받아서 두 정수중에 큰 값을 max 라는 변수에 저장해서 출력하세요.
		
		int x, y, max;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("> x 값을 입력하세요: ");
		x = Integer.parseInt(br.readLine());
		System.out.print("> y 값을 입력하세요: ");
		y = Integer.parseInt(br.readLine());
		
		max = x > y ? x : y;
		
		System.out.println(max);

	}

}
