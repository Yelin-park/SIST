package days05;

import java.util.Iterator;

/**
 * @author Yelin
 * @date 2022. 2. 21. - 오후 2:23:54
 * @subject 
 * @content 
 */
public class Ex06 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++)
			System.out.printf( "%d - %s\n", i,   "헬로우 월드");
	    System.out.println("end"); 
		
		
		/*
		//  1+2+=3  백경환, 함세강				
		// [ for 문 설명 ]
		// 1+2+3+4+5+6+7+8+9+10+=55
		
		// sum[1+2] , i[3] , j[98], k[5]
		//                                                  1 <=10 && 100 > 98 참
		//                                                  2 <=10 && 99 > 98  참
		//                                                  3 <=10 && 98 > 98  참
		//                                                    참   &&  거짓        거짓
		int sum = 0;
		for (int i = 1, j = 100, k = 3; i <= 10 && j > 98; i++, j--, k++) {
			sum += i;
			System.out.print( i + "+");
		} // for
		System.out.println("="+ sum);
		
		// 1+2+=3 
		 */
	    
	    int sum = 0;
		for (int i = 1, j = 100, k = 3; i <= 10 && j > 98; i++, j--, k++) {
			sum += i;
			System.out.print( i + "+");
		}
		System.out.println("="+ sum);
		
	} // main

} // class
