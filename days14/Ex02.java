package days14;

/**
 * @author Yelin
 * @date 2022. 3. 8. - 오전 11:16:10
 * @subject [다차원 배열 예제]
 * @content 2차원 배열 사용 예제
 */
public class Ex02 {

	public static void main(String[] args) {
		int[][] m = new int[5][5];
		
		fillM01(m);
		dispM(m); // 2차원 배열 출력하는 메서드
		
		System.out.println();
		
		fillM02(m);
		dispM(m);
		
		System.out.println();
		
		fillM03(m); // 왼쪽으로 90도 회전한 메서드(사진 왼쪽 90도 회전)
		dispM(m);
		
		System.out.println();
		
		fillM04(m);
		dispM(m);

	} // main

	private static void fillM04(int[][] m) {
		
		/*
		// 풀이1) 값을 계산해서 채워넣기
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = i % 2 == 0 ? 5*i+j+1 : (i+1)*5-j;
				// if(i % 2 == 0)  	m[i][j] =  5*i+j+1;
				// else                m[i][j] = (i+1)*5-j;
			} // for j
		} // for i
		*/
		
		// 풀이2) 방을 찾아서 채워넣기
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				//if(i % 2 == 0) m[i][j] = 5*i+j+1;
				//else 		   m[i][4-j] = 5*i+j+1;
				m[i][i % 2 == 0 ? j : 4-j] = 5*i+j+1;
			} // for j
		} // for i
		
	} // fillM04

	private static void fillM03(int[][] m) {
		// 풀이1) 값을 계산해서 채워넣기
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 5-i+5*j; // (5*(j+1*1))-i
			} // for j
		} // for i
		
		// 풀이2) 방을 찾아서 채워넣기
		// 00에 찍는 01을 40
		// 01   30
		// 02   20
		// 03   10
		// 04   00
		// 10   41
		// 11   31
		// 12   21
		// 13   11
		// 14   01
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[4-j][i] = 5*i+j+1;
			}
		}
		
	} // fillM03

	private static void fillM02(int[][] m) {
		/*
		// 풀이1)
		int k = 25;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++, k--) {
				m[i][j] = k;
			} // for j
		} // for i
		*/
		
		/*
		// 풀이2) i,j로 25~1까지의 값을 넣을 수 있도록 계산하여 채워넣기
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 26-(5*i+j+1); // 25-5*i-j
			} // for j
		} // for i
		*/
		
		/*
		//풀이 3) k 변수를 주고 i,j 시작을 거꾸로해서 채워 넣기
		int k = 1;
		for (int i = m.length-1; i >= 0; i--) {
			for (int j = m[i].length-1; j >= 0; j--, k++) {
				m[i][j] = k;
			} // for j
		} // for i
		*/

		/*
		//풀이 4) i,j 시작을 거꾸로해서 채워 넣기
		for (int i = m.length-1; i >= 0; i--) {
			for (int j = m[i].length-1; j >= 0; j--) {
				m[i][j] = 25-5*i-j
			} // for j
		} // for i
		*/
		
		// 풀이 5) 방을 찾아서 채워 넣기
		// 00     44
		// 01     43
		// 02     42
		// 03     41
		// 04     40
		// 10     34
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[4-i][4-j] = 5*i+j+1;
			} // for j
		} // for i
	} // fillM02
	
	private static void fillM01(int[][] m) {
		// 풀이2) i,j for문으로만 채워넣는 방법
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 5*i+j+1;
			} // for j
		} // for i
		
		
		// 풀이1) k 변수 선언하여 채워넣는 방법
		int k = 1;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++, k++) {
				m[i][j] = k;
			} // for j
		} // for i
		
	} // fillM01
	
	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]\t",m[i][j]);
			} // for j
			System.out.println();
		} // for i
	} // dispM

} // class
