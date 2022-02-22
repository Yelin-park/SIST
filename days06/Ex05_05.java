package days06;

public class Ex05_05 {

	public static void main(String[] args) {
		  // [5번 문제 ( 이등변 삼각형 )]
		  //                   공백       별
	      // __*    i = 1       2         1
	      // _***   i = 2       1         3
	      // *****  i = 3       0         5
		  //        i + j = 3             
		  //        j = 3-i              2*i-1
		
		// 2번 풀이 (삼항연산자사용)
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				// System.out.print(i+j >= 4 ? "*" : "-");
				// System.out.print(i >= j-2 ? "*" : "-");
				System.out.print(i+j >= 4 && j-2 <= i ? "*" : "-");
			}
			System.out.println();
		}
		
		// 1번 풀이
		/*
		for (int i = 1; i <= 3; i++) {
			// 공백 for
			for (int j = 1; j <= 3-i; j++) {
				System.out.print("_");
			}
			// 별 for
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		*/

	}

}
