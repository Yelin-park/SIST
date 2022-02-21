package days05;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오후 3:52:30
 * @subject 
 * @content 
 */
public class Ex11 {

	public static void main(String[] args) {
		// while문으로 1~10 까지 합 출력
		// 1+2+3+4+5+6+7+8+9+10=55
		int i = 1, sum = 0;
		
		while( i <= 10  ) {
			sum += i;
			System.out.print( i + "+");			
			i++;
		}
		// '\b' > 제어문자(back space)
		System.out.println( "\b=" + sum);
		
		
		/*
		if(  i == 10 ) {
			System.out.print( i );  
		}else {
			System.out.print( i + "+");  
		}
		*/
		
		// 삼항(조건)연산자 == if 문(위에 있는)
		// System.out.print(i == 10 ? i : i + "+");
		
		/*
		int i = 1, sum = 0;

		while (i <= 10) {
			sum += i;
			// 삼항(조건)연산자 == if 문
			System.out.print(i == 10 ? i : i + "+");
			i++;
		} System.out.println( "\b=" + sum);
		
		*/
		
		/*
		while (i <= 10) {
			sum += i;
			if(  i == 10 ) {
				System.out.print( i );  
			}else {
				System.out.print( i + "+");  
			}
			i++;
		} System.out.println( "\b=" + sum);
		*/
		

	} //  main 

} //  class
