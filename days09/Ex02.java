package days09;

/**
 * @author Yelin
 * @date 2022. 2. 25. - 오전 9:29:27
 * @subject 연산자 + 제어문 + 알고리즘 + 배열 응용/활용 예제
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 팩토리얼(factorial) == 계승
		// n! = n*(n-1)*(n-2)*...*1  > 1부터 어떤 양의 정수 n까지의 정수를 모두 곱한 것을 말하며 n! 이라고 표시
		// 0! > 0은 양수도, 음수도 아니기 때문에 0! = 1 이라고 약속
		
		// 계승은 순열과 조합의 공식 자주 사용
		
		int n = 5;
		
		// 5 팩토리얼 값을 구해서 출력하는 코딩
		/*
		int result = 1;
		for (int i = 1; i <= 5; i++) {
			result *= i;
		}
		System.out.println(result);
		*/
		
		int result = factorial(5);
		System.out.println(result);
		
		result = recursiveFactorial(1);
		if(result == -1) {
			System.out.println("입력이 잘못되었습니다.");
		} else {
			System.out.println(result);
		}
		
		
	} // main

	// 재귀호출
	// ㄱ. 음의 정수의 팩토리얼 = 입력이 잘못되었습니다.
	// ㄴ. 0! = 1

	// 순서에 따라서 성능차이 발생하니까 순서에 따라서 코딩하기
	private static int recursiveFactorial(int n) {
		if(n > 1) return n*recursiveFactorial(n-1);
		else if(n == 1) return n; // 성능을 빠르게 하기 위해서 연산 처리를 덜 해줌 코드를 넣으면 3*2*1로 연산하는데 안넣으면 3*2*1*1로 *1 연산 1번 더 함
		else if(n == 0) return 1;
		else 			return -1;
	}
	
	/* 다른 사람 코드
	private static int recursiveFactorial(int n) {
		if(n==1) return n;
		else if(n==0) return 1;
		else if(n < 0) {
			System.out.println("입력이 잘못되었습니다.");
			return 1;
		}
		else return n * recursiveFactorial(n-1);
	}
	*/
	
	
	/* 내가 만들다 만 코드
	private static int recursiveFactorial(int n) {
		String m = "입력이 잘못되었습니다.";
		if(n==0 || n==1) return 1;
		if(n < 0) 
		else	return n * recursiveFactorial(n-1);
		return n;
	}
	
	/*
	// 재귀호출(처음 만들었던 코드)
	private static int recursiveFactorial(int n) {
		if(n==1) return n;
		else	return n * recursiveFactorial(n-1);
	}
	*/


	// 팩토리얼 메서드
	private static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		} 
		return result;
	}

} // class
