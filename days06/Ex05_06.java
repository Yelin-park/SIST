package days06;

public class Ex05_06 {

	public static void main(String[] args) {
		// [6번 문제( 마름모 )]
		// __*
		// _***
		// *****
		// _***
		// __*
		
		// 삼항연산자로 풀어보기
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				// System.out.print(i+j >= 4 ? "*" : "-");
				// System.out.print(i >= j-2 ? "*" : "-");
				System.out.print(i+j >= 4 && j-2 <= i ? "*" : "-");
			}
			System.out.println();
		}
		
		
		// *____*
		// **_**
		// *****
		// **_**
		// *____*
		
		// *****
		// _***_
		// __*__
		// -***_
		// *****
		

	}

}
