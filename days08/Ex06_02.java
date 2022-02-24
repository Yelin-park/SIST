package days08;

/**
 * @author Yelin
 * @date 2022. 2. 24. - 오후 5:15:24
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int result = sum(10);
		int result = recursiveSum(10); // 재귀함수		
		System.out.println(result);
		
		
	} // main

	// return 10 + 9 + recursiveSum(7)... + recursiveSum(1)
	// 10+9+8+7+6+...+1
	private static int recursiveSum(int n) {
		if(n == 1) return n;
		else return n + recursiveSum(n-1);
	}

	// 1~n 까지의 합을 구하는 메서드
	private static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

} // class
