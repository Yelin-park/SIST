package days13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 7. - 오전 10:32:03
 * @subject 동적배열
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [동적]컨트롤 - 프로그램이 실행이 된 후에 컨트롤 생성 (ex. 사다리타기 : 미리 지정된 것이 아니고 5명 사다리 타겠다하고 시작하면 그 인원수만큼 생성되는 것)
		// [동적]배열 : 프로그램이 실행이 된 후에 배열의 크기가 할당(결정이)된다.
		int[] m;

		Scanner sc = new Scanner(System.in);
		System.out.print("> 배열 크기는 얼만큼 할당하시겠습니까?");
		
		int arrayLength = sc.nextInt();
		
		m = new int[arrayLength]; // 이렇게 직접 입력한 뒤 / 나중에 배열의 크기가 정해지는 것을 [동적 배열]이라고 한다.
		
		System.out.println(Arrays.toString(m));
		
		
	} // main

} // class
