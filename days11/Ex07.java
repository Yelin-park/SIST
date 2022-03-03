package days11;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 3. - 오후 5:11:27
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 한 반에 30명의 학생
		// 이름, 국어, 영어, 수학, 총점, 평균 등수를 처리하는 코딩
		Scanner sc = new Scanner(System.in);
		final int STUDENT_COUNT = 30;
		String[] names = new String[STUDENT_COUNT];
		int[] kors = new int[STUDENT_COUNT];
		int[] engs = new int[STUDENT_COUNT];
		int[] mats = new int[STUDENT_COUNT];
		int[] tots = new int[STUDENT_COUNT];
		double[] avgs = new double[STUDENT_COUNT];
		int[] ranks = new int[STUDENT_COUNT];
		
		// 입력받은 학생의 수 + 각 배열의 채워넣을 위치(인덱스)
		int count = 0;
		char con = 'y';
		
		do {
			System.out.printf("> [%d]번 이름 국어 영어 수학 입력하세요?", count+1);
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			int tot = kor + eng + mat;
			double avg = (double)tot / 3;
			int rank = 1;  // 전체 학생의 점수를 받아야 등수를 매길 수 있으니 기초값 1로 설정
			
			names[count] = name;
			kors[count] = kor;
			engs[count] = eng;
			mats[count] = mat;
			tots[count] = tot;
			avgs[count] = avg;
			ranks[count] = rank;
			
			count++; // 입력받은 학생수 1증가 + 채워넣을 인덱스 값도 1증가
			
			System.out.println("> 계속 하시겠습니까?");
			con = sc.next().charAt(0);
		} while (Character.toUpperCase(con) == 'Y');
		
		System.out.println("> 입력받은 학생 수 : " + count + "명");
		
		// 입력받은 학생 정보 출력
		for (int i = 0; i < count; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
		}
		
		
		
	} // main

} // class
