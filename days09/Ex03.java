 package days09;

/**
 * @author Yelin
 * @date 2022. 2. 25. - 오전 10:42:17
 * @subject 재귀 호출 함수 연습
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [재귀 호출 함수]
		// 거듭제곱(power) == 누승 == 멱  
		// 2    ^3 = 2*2*2 = 8  == 2(밑수)를 3(지수)번 반복해서 곱하세요.
		// System.out.println(Math.pow(0, 0)); 제곱근 구하는 함수
		// 지수 == 2  제곱   ex) 2^2 2의 제곱
		// 지수 == 3  세제곱 ex) 2^3 2의 세제곱
		// 지수가 1/2 경우는 제곱근, 1/3 경우는 세제곱근 
		
		
		// double result = power(2, -3); // 2^-3 = 1/2^3 = 0.125
		double result = recursivePower(2, 3);
		System.out.println(result);

	} // main

	// [과제] 재귀 호출 함수
	private static double recursivePower(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}


	// 2번 풀이
 	private static double power(int i, int j) {
 		double result = 1;
 		int n = Math.abs(j);
 		// for (int k = 1; k <= Math.abs(j); k++) { > 성능을 위해서 Math.abs를 변수로 빼고 아래와 같이 코딩하는 것이 좋다.
 		for (int k = 1; k <= n; k++) {
 			result *= i;
 	 		}
 		return j < 0 ? 1/result : result;
 	}
	
	/*
	// 1번 풀이
	// 양수를 음수로, 음수를 양수로 바꾸기 위해서는 *-1 하면 됨. j * -1 = j
	// 음수의 거듭제곱을 구하기 위해서 형을 double로 바꿔야함
 	private static double power(int i, int j) {
 		double result = 1;
 		
 		if (j > 0) {
 	 		for (int k = 1; k <= j; k++) {
 	 			result *= i;
 	 		}
 	 		return result;
		} else {
 	 		j = j*-1;
			for (int k = 1; k <= j; k++) {
 	 			result *= i;
			}
			return 1/result;
		}
 	}
 	
 	/*
	// 양수의 거듭제곱만 처리해줄 수 있는 메서드 
	//                        밑수   지수
 	private static int power(int i, int j) {
 		int result = 1;
 		for (int k = 1; k <= j; k++) {
 			result *= i;
 		}
 		return result;
 	}
 	*/
 	
	/* 내가 풀다만 코딩
	private static double power(int i, int j) {
		double result = 1;
		if(j > 0) {
			for (int k = 1; k <= j; k++) {
			result *= i;
			}
		}
		if(j < 0) {
			double a = 0;
			for (int k = 1; k <= -j; k++) {
			a = i / 2;
			result = a;
			}
		}
		return result;
	}
	*/
	

} // class
