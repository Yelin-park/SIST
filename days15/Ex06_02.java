package days15;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 10. - 오후 3:11:48
 * @subject [과제]
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// [과제] 세 반이 있고 한 반에 30명 학생의 이름, 국어, 영어, 수학, 총점, 평균, 등수, 전교등수 처리하는 예제 : days14.Ex01.java
		// Student 클래스
		// 객체 배열 사용해서 코딩하기

		Scanner sc = new Scanner(System.in);
		
		final int STUDENT_COUNT = 30;
		Student[][] students = new Student[3][STUDENT_COUNT]; // 2차원 객체배열로 선언 ***
		int[] cnts = new int[3]; // 반이 3개라 
		char con = 'y';
		int ban, no, kor, eng, mat, tot, rank, wrank;
		String name;
		double avg;
		
		do {
			System.out.printf("> 반을 입력하세요.");
			ban = sc.nextInt()-1; // 반 인덱스
			// ban = sc.nextInt();
			
			no = cnts[ban] + 1; // 해당하는 반의 학생 수 증가
			System.out.printf("> [%d]반 [%d]번 이름 국어 영어 수학 입력하세요?", ban+1, no);
			name = getRandomName();
			kor = getRandomScore(); 
			eng = getRandomScore();
			mat = getRandomScore();
			tot = kor + eng + mat;
			avg = (double)tot / 3;
			rank = 1;
			wrank = 1;
			
			// 행 = 반, 열 = 학생 수
			students[ban][no-1] = new Student(); // 인스턴스 생성 *****
												 // 인스턴스 생성 안할 시 java.lang.NullPointerException 에러 발생
			
			students[ban][no-1].no = no;
			students[ban][no-1].name = name;
			students[ban][no-1].kor = kor;
			students[ban][no-1].eng = eng;
			students[ban][no-1].mat = mat;
			students[ban][no-1].tot = tot;
			students[ban][no-1].avg = avg;
			students[ban][no-1].rank = rank;
			students[ban][no-1].wrank = wrank;
			
			cnts[ban]++; // 입력받은 학생수 1증가 + 채워넣을 인덱스 값도 1증가
			
			System.out.println("> 계속 하시겠습니까?");
			con = sc.next().charAt(0);
		} while (Character.toUpperCase(con) == 'Y');
		
		// 반등수/전교등수 처리 코딩
		for (int i = 0; i < cnts.length; i++) { // 반을 돌리는 for문
			for (int j = 0; j < cnts[i]; j++) { // 학생수를 돌리는 for문				
				for (int i2 = 0; i2 < cnts.length; i2++) {
					for (int j2 = 0; j2 < cnts[i2]; j2++) {
						if( students[i][j].avg < students[i2][j2].avg) {
							students[i][j].wrank++;			 	 // 총점이 작으면 무조건 전교등수++
							if(i == i2) students[i][j].rank++;	 // 같은 반이면 반등수++
						} // if
					} // for j2
				} // for i2
			} // j for
		} // i for
		
		// ㄱ. 학생정보출력
		for (int i = 0; i < cnts.length; i++) {
			for (int j = 0; j < cnts[i]; j++) {
				students[i][j].printInfo();
			}
		}

	} // main
	
	public static String getRandomName() {
		String name = null;
		
		// 무작위로 대문자 5개 생성 -> 이름으로 가정
		Random rnd = new Random();
		char names[] = new char[5]; 
		for (int i = 0; i < names.length; i++) {
			names[i] = (char)(rnd.nextInt(26) + 65); // 65~90  -> -65  > 0~25
		}
		
		// char[] -> String 변환 코딩
		name = new String(names);
				
		return name;
	} // getRandomName

	public static int getRandomScore() {
		Random rnd = new Random();
		return rnd.nextInt(101);
	} // getRandomScore

} // class