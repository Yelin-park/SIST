package days05;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오후 2:02:42
 * @subject 
 * @content  for 문 예제
 */
public class Ex05 {

	public static void main(String[] args) {
		// [1] 10 ~ 1까지의 합구하기
		//  i
		// 10+9+8+...+1=55
		//           ㄱ          ㄴ
		//                    10 <= 1 false
		/*
		int sum = 0;
		for (int i = 10; i >= 1; i--) {
			System.out.print( i +"+");
			sum += i;  // => sum = sum + i;
		} 
		System.out.println("=" + sum);
		System.out.println("= end =");
		*/
		
		// [2]
		int sum = 0, i = 1 ;
		// if( i == 11 ) break; 코드를 작성하지않으면 무한 루프에 빠짐
		for (  ;  ; ) {
			if( i == 11 ) break;
			System.out.print(i + "+");
			sum += i;
			i++;
		}
		System.out.println("=" + sum);
		 
		// if( i == 11 ) break; 코드없이 System.out.println("=" + sum); 코드 넣을 시 에러 발생
		// 에러 메시지 : Unreachable code
		//System.out.println("=" + sum);
		
		// int i; 코드가 없으면 에러 발생
		// 에러 메시지 : i cannot be resolved to a variable
		// 해석 : i는 변수로 해석할 수 없다
		System.out.println( " i = " + i );
		

	} // main

} // class
