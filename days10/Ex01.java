package days10;

/**
 * @author Yelin
 * @date 2022. 3. 2. - 오전 9:02:34
 * @subject 수/목/금 > 제어문 + 배열 응용/활용 예제
 * @content 
 */
public class Ex01 {

	public static void main(String[] args) {
		// [수열 : 규칙이 있는 수의 나열(자연수)]
		// 각 수 : term(항) -> 첫번째항 a1, 두번째 항 a2, n번째항 an (a는 작은 표기법)
		// [피보나치 수열 : 앞의 두 수의 합이 바로 뒤의 수가 되는 배열]
		// [1] + [1] + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 + 144 + 233 ...
		// 															<= 150 : n항의 값과 총 합	376		
		
		/*
		// 배열로 푼 코딩(갯수가 정해져 있어서 추천 x)
		int[] m = new int[150];
		m[0] = 1;
		m[1] = 1;
		int sum = m[0] + m[1];
		System.out.print("1+1+");
		for (int i = 2; i < m.length; i++) { // for (int i = 2; i < m.length && m[i] <= 150; i++) 
			m[i] = m[i-2] + m[i-1];
			if(m[i] > 150) break;    // && 코딩한 후 해당 코딩 삭제
			System.out.print(m[i] + "+");
			sum += m[i];
		}
		System.out.print("=" + sum);
		*/
		
		
		/*
		// 내가 풀다만 코딩
		
		int first = 1;
		int second = 1;
		int sum = 0;
		int t;
		
		while(sum <= 150) {
			t = first + second;  // 3항
			sum = t;
			
		}
		

		System.out.print("=" + sum);
		*/
		
		
		
	} // main

} // class
