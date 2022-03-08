package days14;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 8. - 오전 9:06:21
 * @subject [다차원 배열 예제]
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// [다차원 배열 예제]
		// 3개의 반, 1반에 30명 학생의 이름, 국어, 영어, 수학 점수를 입력받아서 총점, 평균, 등수, 전교등수 출력하기
		Scanner sc = new Scanner(System.in);
		
		String[][] names = new String[3][30];
		double[][] avgs = new double[3][30];
		// 면 = 반, 행 = 학생 수, 열 = 0열(국어), 1열(영어), 2열(수학), 3열(총점), 4열(등수), 5열(전교등수)
		int[][][] infos = new int[3][30][6];
		
		char con = 'y'; // 입력해서 계속 할건지 여부를 확인할 변수
		
		//  *** cnts[반-1] == 그 반의 입력받은 학생 수 ex) cnts[3-1] = cnts[2] => 3반의 입력받은 학생수
		// cnts[0] = 1반의 입력받은 학생수
		// cnts[1] = 2반의 입력받은 학생수
		// cnts[2] = 3반의 입력받은 학생수
		int[] cnts = new int[3]; // 

		int ban; // 반을 입력받아서 저장할 변수
		do {
			// 1. 몇 반을 입력할건지 > 반 입력
			System.out.print("1. 반을 입력하세요?"); // 1,2,3 값 중에 하나를 입력
			ban = sc.nextInt();
			
			// 2. 해당하는 반의 학생 이름, 국어, 영어, 수학 입력
			System.out.printf("> %d반의 [%d]번 이름 국어 영어 수학 입력하세요?", ban, cnts[ban-1]+1); //  cnts[ban-1] > 해당하는 반의 입력받은 학생 수
			String name = days11.Ex07.getRandomName(); // 자동으로 이름을 반환해 주는 메서드 //sc.next();
			int kor = days11.Ex07.getRandomScore();   // 자동으로 임의의 점수를 반환해 주는 메서드 //sc.nextInt();
			int eng = days11.Ex07.getRandomScore();
			int mat = days11.Ex07.getRandomScore();
			
			// 3. 총점, 평균 계산 > 끝난 후 등수와 전교등수 계산할 것
			int tot = kor + eng + mat;
			double avg = (double)tot / 3;
			int rank = 1; 	 // 전체 학생의 점수를 받아야 [반등수]를 매길 수 있으니 기초값 1로 설정
			int w_rank = 1;  // 전체 학생의 점수를 받아야 [전교등수]를 매길 수 있으니 기초값 1로 설정
			
			// names[행=반][열=학생번호]= name;
			names[ban-1][cnts[ban-1]]= name; // ex) 2반의 1번 학생이면 ban은 2로 입력받으니 -1을 해주어야함
			infos[ban-1][cnts[ban-1]][0]= kor;
			infos[ban-1][cnts[ban-1]][1] = eng;
			infos[ban-1][cnts[ban-1]][2] = mat;
			infos[ban-1][cnts[ban-1]][3] = tot;
			avgs[ban-1][cnts[ban-1]] = avg;
			infos[ban-1][cnts[ban-1]][4]= rank;
			infos[ban-1][cnts[ban-1]][5] = w_rank;
			
			cnts[ban-1]++; // 입력받은 그 반의 학생수를 1증가
			
			// 4. 입력 계속 여부 확인 y/Y
			System.out.print("계속 입력 하겠습니까?");
			con = sc.next().charAt(0);
		} while (Character.toUpperCase(con) == 'Y');
		
		// 반등수/전교등수 처리 코딩
		for (int i = 0; i < cnts.length; i++) { // 반을 돌리는 for문
			for (int j = 0; j < cnts[i]; j++) { // 학생수를 돌리는 for문
				int 등수를매길학생의총점 = infos[i][j][3];
				
				for (int i2 = 0; i2 < cnts.length; i2++) {
					for (int j2 = 0; j2 < cnts[i2]; j2++) {
						int 등수를비교할학생의총점 = infos[i2][j2][3];
						if(등수를매길학생의총점 < 등수를비교할학생의총점) {
							infos[i][j][5]++;			  // 총점이 작으면 무조건 전교등수++
							if(i == i2) infos[i][j][4]++; // 같은 반이면 반등수++
						} // if
					} // for j2
				} // for i2
			} // j for
		} // i for
		
		/*
		// 등수 처리 코딩(내가 풀다만 코드)
		for (int i = 0; i < cnts.length; i++) { // 반을 돌리는 for문
			for (int j = 0; j < cnts[i]; j++) { // 학생수를 돌리는 for문
				for (int k = 0; k < cnts.length; k++) {
					if(avgs[i][j] < avgs[i][k]) {
						infos[i][j][4]++;
					} // if
				} // for k
			} // j for
		} // i for
		*/
		
		for (int i = 0; i < cnts.length; i++) {
			System.out.printf("%d반 학생수 : %d명\n", (i+1), cnts[i]);
			for (int j = 0; j < cnts[i]; j++) {
				System.out.printf("%d-%d. %s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n"
						,i+1, j+1
						,names[i][j]
						,infos[i][j][0]
						,infos[i][j][1]
						,infos[i][j][2]
						,infos[i][j][3]
						,avgs[i][j]
						,infos[i][j][4]
						,infos[i][j][5]);
			} // for j
		} // for i

		
		/*
		// 출력형식
		> 1반 학생 수 : 3명
		1-1. LAJKC	77	44	69	190	63.33	2
		1-2. JBWOM	78	70	33	181	60.33	3
		1-3 .MBPJB	95	50	46	191	63.67	1
		
		> 2반 학생 수 : 3명
		2-1. LAJKC	77	44	69	190	63.33	2
		2-2. JBWOM	78	70	33	181	60.33	3
		2-3. MBPJB	95	50	46	191	63.67	1
		
		> 3반 학생 수 : 3명
		3-1. LAJKC	77	44	69	190	63.33	2
		3-2. JBWOM	78	70	33	181	60.33	3
		3-3. MBPJB	95	50	46	191	63.67	1
		*/
		
		/*
		System.out.println("[각 반의 입력학생 수]");
		for (int i = 0; i < cnts.length; i++) {
			System.out.printf("[%d]반 학생수 : %d명\n", (i+1), cnts[i]);
		}
		*/
		
	} // main

} // class



/*
int[][] kors = new int[totalClass][STUDENT_COUNT];
int[][] engs = new int[totalClass][STUDENT_COUNT];
int[][] mats = new int[totalClass][STUDENT_COUNT];
int[][] tots = new int[totalClass][STUDENT_COUNT];
int[][] ranks = new int[totalClass][STUDENT_COUNT];
*/