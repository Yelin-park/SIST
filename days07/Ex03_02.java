package days07;

/**
 * @author Yelin
 * @date 2022. 2. 23. - 오전 11:34:04
 * @subject
 * @content
 * 
 * 		// 0.0 <= Math.random() < 1.0
		// 0.0 * 5 + 5 <= (int)(Math.random() * 25) + 5 < 1.0 * 25 + 5
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// [문제] 10개의 정수를 저장할 변수를 선언하고
		//        각각의 기억공간에 Math.random() 메서드를 사용하여 5~25까지의 임의의 수로 초기화하고
		//        가장 큰 값, 가장 작은 값을 출력하는 코딩을 하세요.
		
		
		// ㄱ. 5~25 임의의수  0~20 + 5
		// 0 + 5 <= (int)(Math.random() * 21) + 5 <= 21 + 5
		
		// ㄴ. 10개 변수 선언  => 배열로
		int[] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i] = (int)(Math.random() * 21) + 5;
			System.out.print(m[i] + " / ");
		}
		System.out.println();
		
		// ㄷ. 가장 큰 값, 가장 작은 값찾기
		int max = m[0], min = m[0];
		
		for (int i = 1; i < m.length; i++) {
			if(max < m[i]) max = m[i];
			if(min > m[i]) min = m[i];
		}
		
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
		
		
		/*
		// 내가 풀다 만 코드
		// 1. 배열 선언
		int[] num = new int[10];
		
		// 2. 배열값 초기화
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 25) + 5;
		} // i for
		
		for(int i = 1; i <= num.length; i++) {
			if(num[i-1] > num[i]) {
				max = num[i-1];
			} else {
				max = num[i];
			}
		}
		*/
		

	} // main

} // class
