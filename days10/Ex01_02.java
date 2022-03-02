package days10;

/**
 * @author Yelin
 * @date 2022. 3. 2. - 오전 9:02:34
 * @subject 수/목/금 > 제어문 + 배열 응용/활용 예제
 * @content 
 */
public class Ex01_02 {

	public static void main(String[] args) {
		// [수열 : 규칙이 있는 수의 나열(자연수)]
		// 각 수 : term(항) -> 첫번째항 a1, 두번째 항 a2, n번째항 an (a는 작은 표기법)
		// [피보나치 수열 : 앞의 두 수의 합이 바로 뒤의 수가 되는 배열]
		// [1] + [1] + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 + 144 + 233 ...
		//  f     s    n
		//        f    s
		
		int first = 1;
		int second = 1;
		int sum = first + second;
		int next;
		System.out.print(first + "+" + second + "+");
		
		
		while ((next = first + second) <= 150) { // 먼저 합을 구해서 next에 저장하고 next가 150보다 작을 때 까지
			System.out.print(next + "+");
			sum += next;
			
			first = second;
			second = next;
		}
		
		/*
		while (true) {
			next = first + second;
			if(next > 150) {
				System.out.println("\b=" + sum);
				System.exit(-1);
			}
			System.out.print(next + "+");
			sum += next;
			
			first = second;
			second = next;
		}
		*/
		
		
	} // main

} // class
