package days09;

/**
 * @author Yelin
 * @date 2022. 2. 25. - 오전 9:07:46
 * @subject 재귀호출 설명 및 사용하지 말아야 하는 이유
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		//재귀 호출
		
		// 1~n까지 합을 구해서 출력하는 코딩
		// for 문
		int n = 10;
		
		/*
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		*/
		
		// 1~n까지의 합을 구해서 반환하는 sum() 메서드를 선언 호출
		int result = sum(n);
		System.out.println(result);
		
		int a =3, b = 8;
		// 두 정수 a,b 사이의 합을 구해서 반환하는 sum() 메서드를 선언, 호출
		// 오버로딩(overloading) == 중복함수
		result = sum(a,b);
		System.out.println(result);
		
		// 1~n까지의 합을 구해서 반환하는 recursiveSum() 재귀 호출 메서드
		result = recursiveSum(n);
		System.out.println(result);
		
		
		
	} // main

	// 가능하면 재귀 호출 함수는 사용하지 않는 게 좋다.
	// 그 이유? 자기 자신이 자기 자신을 호출하기 때문에 '처리 속도가 늦다' ex) 편의점가서 담배 10갑을 왔다갔다해서 사오는 것과 같음
	// 꼭 사용해야되는 이유? 트리구조를 처리(검색, 수정, 삭제 ex) 파일 탐색기 -> 폴더/하위폴더/하위폴더/하위폴더 ) 
	private static int recursiveSum(int n) {
		if(n==1) return n;
		else	return n + recursiveSum(n-1);
	}


	private static int sum(int a, int b) {
		int result = 0;
		int max = a > b ? a : b;
		int min = a > b ? b : a;
		for (int i = min; i <= max; i++) {
			result += i;
		}
		return result;
		
	}

	private static int sum(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		return result;
	}
	

} // class
