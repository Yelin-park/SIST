package days14;

/**
 * @author Yelin
 * @date 2022. 3. 8. - 오후 3:08:22
 * @subject p219 가변배열
 * @content
 * 			- 2차원의 이상의 배열을 다차원 배열 -> "배열의 배열"
 * 			- 마지막 차수의 길이를 지정하지 않고, 추후 각기 다른 길이의 배열을 생성할 수 있다.(유연성)
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		// 한 반 : 30명 * 3반 -> 학생명 저장할 배열 선언
		// String[] names = new String[3*30];
		
		// 문제점) 1반(25명)  2반(30명)  3반(19명)
		/*
		String[][] names = new String[3][30];
		
		String[] 반1 = new String[25];
		String[] 반2 = new String[30];
		String[] 반3 = new String[19];
		*/
		
		
		String[][] names = new String[3][]; // 3개의 반을 만들고 하나의 반 안에 몇명이 있을지 아직 정하지 않았다.
		names[0] = new String[25];	 		// 1반에는 25명
		names[1] = new String[30]; 			// 2반에는 30명
		names[2] = new String[19]; 			// 3반에는 19명

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.printf("[%s]", names[i][j]);
			}
			System.out.println();
		}
		
	} // main

} // class
