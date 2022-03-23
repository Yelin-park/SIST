package days24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import days15.Student;

/**
 * @author Yelin
 * @date 2022. 3. 23. - 오후 3:35:45
 * @subject [과제]
 * @content	days15.Ex06_02.java 
 * 			세반 + 30명 학생의 성적처리 -> ArrayList 사용해서 코딩 수정
 * 
 * 		// [과제] 세 반이 있고 한 반에 30명 학생의 이름, 국어, 영어, 수학, 총점, 평균, 등수, 전교등수 처리하는 예제 : days14.Ex01.java
		// Student 클래스
		// 객체 배열 사용해서 코딩하기
 */
public class Ex09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		final int STUDENT_COUNT = 30;
		ArrayList[] classArr = new ArrayList[3];
		
		for (int i = 0; i < classArr.length; i++) { // 배열초기화
			classArr[i] = new ArrayList();
		}
		
		ArrayList wClass = new ArrayList(); // 전교클래스
		
		int[] cnts = new int[3]; // 반이 3개
		char con = 'y';
		int ban, no, kor, eng, mat, tot, rank, wrank;
		String name;
		double avg;
		
		do {
			System.out.printf("> 반을 입력하세요.");
			ban = sc.nextInt()-1; // 반 인덱스
			
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
			
			Student s = new Student(no, name, kor, eng, mat, tot, rank, wrank, avg);
			
			classArr[ban].add(s);
			wClass.add(classArr[ban]);
			
			cnts[ban]++; // 입력받은 학생수 1증가 + 채워넣을 인덱스 값도 1증가
			
			System.out.println("> 계속 하시겠습니까?");
			con = sc.next().charAt(0);
		} while (Character.toUpperCase(con) == 'Y');
		
		
		// 반등수/전교등수 처리 코딩
		for (int i = 0; i < cnts.length; i++) { // 반을 돌리는 for문
			for (int j = 0; j < cnts[i]; j++) { // 학생수를 돌리는 for문	
				Student a = (Student) classArr[i].get(j);
				for (int i2 = 0; i2 < cnts.length; i2++) {
					for (int j2 = 0; j2 < cnts[i2]; j2++) {
						Student b = (Student) classArr[i2].get(j2);
						if( a.avg < b.avg) {
							a.wrank++;			 	 // 총점이 작으면 무조건 전교등수++
							if(i == i2) a.rank++;	 // 같은 반이면 반등수++
						} // if
					} // for j2
				} // for i2
			} // j for
		} // i for
	
		
		// ㄱ. 학생정보출력
		for (int i = 0; i < cnts.length; i++) {
			Iterator ir2 = classArr[i].iterator();
			System.out.printf("[%d반]\n", i+1);
			while (ir2.hasNext()) {
				Student s = (Student) ir2.next();
				System.out.println(s);
			} // while
		} // for i

	} // main
	
	public static String getRandomName() {
		String name = null;
		
		Random rnd = new Random();
		char names[] = new char[5]; 
		for (int i = 0; i < names.length; i++) {
			names[i] = (char)(rnd.nextInt(26) + 65); // 65~90  -> -65  > 0~25
		}

		name = new String(names);
				
		return name;
	} // getRandomName

	public static int getRandomScore() {
		Random rnd = new Random();
		return rnd.nextInt(101);
	} // getRandomScore

} // class
