package days06;

/**
 * @author Yelin
 * @date 2022. 2. 22. - 오후 2:02:54
 * @subject 중첩 for문 문제 풀이
 * @content
 */

public class Ex05_04 {

	public static void main(String[] args) {
	      // [4번 문제]
		  //	   행   공백   별
	      // **** i=1    j=0    j=4 ****
	      // _*** i=2    j=1    j=3  ***
	      // __** i=3    j=2    j=2   **      
	      // ___* i=4    j=3    j=1    *
		  //            i = j + 1         i + j == 5
		  //            j = i - 1         j == 5 - i
		
		 // 공백을 찍는 for문
		 // 별을 찍는 for문
		
		for (int i = 1; i <= 4; i++) {     // 행이 4개이므로, 1번째 for문은 4번만 돌면 됨. 별찍는 for문 아님
			for (int j = 1; j <= i - 1; j++) { // 공백찍는 for문
				System.out.print("_");
			}
			for (int j = 1; j <= 5 - i; j++) { // *찍는 for문
				System.out.print("*");
			}
			System.out.println();
		}
		





	} // main

} // class
