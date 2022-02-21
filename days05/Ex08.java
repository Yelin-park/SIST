package days05;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오후 2:52:13
 * @subject 
 * @content 
 */
public class Ex08 {

	public static void main(String[] args) {
		// while  조건식 에 ++ 증감 연산자가 사용될 때 결과 
		
		int i = 1, sum = 0;

		// while ( i++ <= 10 ) {   // 1 <= 10 무한루프
		// 결과 값 : 2+3+4+5+6+7+8+9+10+11+=65
		
		// 결과 값 : 2+3+4+5+6+7+8+9+10+=54
		while( i++ <= 10 ) {
			sum += i;
			
			// 2+3+4+5+6+7+8+9+10+11+=55  전위형
			// System.out.print( ++i + "+");
			
			// 1+2+3+4+5+6+7+8+9+10+=55    후위형
			// System.out.print( i++ + "+");
			
			System.out.print( i + "+");
			
			// i++;
		}
		System.out.println("=" + sum );
		
		
	} // main

} // class














