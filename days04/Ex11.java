package days04;

/**
 * @author Yelin
 * @date 2022. 2. 18. - 오후 4:26:39
 * @subject  pi 실수값을 소수점 4번째 자리에서 반올림해서 출력하는 예제 및 풀이
 * @content  로직을 이해하기
 */
public class Ex11 {

	public static void main(String[] args) {
		// [문제] pi 실수값을 소수점 4번째 자리에서 반올림해서 출력
		double pi = 3.141592;
		
		// 3번 풀이
		String strPI = String.format("%3f", pi); // pi를 %3f 형식으로 문자열 변환을 해서 strPI 변수에 담고
		// String - > double 변환
		double dPI = Double.parseDouble(strPI);     // String인 strPI를 double로 형변환하여 dPI 변수에 담는다.
		System.out.println(dPI);
				
		
		// 2번 풀이 - 그냥 출력만 하겠다하면 
		System.out.printf("%.3f\n", pi);  // 소수점 3자리까지 출력하라! 그래서 4자리에서 자동으로 반올림을 취함
		
		// 1번 풀이
		// System.out.println(pi * 1000);                         // 3.141592 * 1000 = 3141.592
		// System.out.println(pi * 1000 + 0.5);                   // 3142.092
		// System.out.println((int)(pi * 1000 + 0.5));            // 3142
		// System.out.println((int)(pi * 1000 + 0.5) / 1000.0);   // 3.142
		
		double r = (int)(pi * 1000 + 0.5) / 1000.0; // 3.142
		System.out.println(r);

	}

}
