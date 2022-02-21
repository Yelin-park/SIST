package days05;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오후 5:21:05
 * @subject 
 * @content 
 */
public class Ex14 {

	public static void main(String[] args) {
		// 국어점수를 30개 저장할 배열 선언
		// int  kors [];
		int [] kors;
		kors = new int[30];
		 
		
		// Math 클래스 수학과 관련된 기능이 구현된 클래스
		// 1.  0.0 <= double random() 난 수  < 1.0
		// System.out.println( Math.random() );  // 0.4647652286071282        0.04310619578760044       0.2822661974125613
		
		// 무작위 난수 :  국어점수 -> 30명 할당.
		// 0         <=     int 국어점수              <= 100
		// 0.0 * 101 <=    double random() * 101      < 1.0 * 101
		// 0.0       < =   Math.random() * 101        < 101.0 
		// 0         < =   (int)(Math.random() * 101) < 101 
		// 0         < =   (int)(Math.random() * 101) <= 100  
		
       /* 입력
		kors[0] = 89;
		   :
		kors[29]	= 77;
		 */
		for (int i = 0; i < kors.length; i++) {
			kors[i] = (int)(Math.random() * 101);
		}
		
		/* 출력
		System.out.println(  kors[0] );
		   :
		System.out.println(  kors[29] );
		*/
		for (int i = 0; i < kors.length; i++) {
			 System.out.println(  (i+1)+"번 국어 점수 : " +  kors[i] );
		}
	} // main

} // class
