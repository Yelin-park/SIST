package days15;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 10. - 오후 2:23:44
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// 한 반에 30명 학생의 이름, 국어, 영어, 수학, 총점, 평균, 등수 처리하는 예제 : days11.Ex07.java
		// 1. Student 클래스 선언 <- 속성, 기능 파악해서 목록 작성
		// 2. 객체 배열 == 클래스 배열(클래스 자료형으로 배열을 선언하겠다)
		Scanner sc = new Scanner(System.in);
		
		final int STUDENT_COUNT = 30;
		Student[] students = new Student[STUDENT_COUNT];
		int cnt = 0;
		char con = 'y';
		
		do {
			int no = cnt + 1;
			System.out.printf("> [%d]번 이름 국어 영어 수학 입력하세요?", no);
			String name = getRandomName();
			int kor = getRandomScore(); 
			int eng = getRandomScore();
			int mat = getRandomScore();
			int tot = kor + eng + mat;
			double avg = (double)tot / 3;
			int rank = 1;  
			
			students[cnt] = new Student(); // 인스턴스 생성 *****
			// 인스턴스 생성 안할 시 java.lang.NullPointerException 에러 발생
			
			students[cnt].no = no;
			students[cnt].name = name;
			students[cnt].kor = kor;
			students[cnt].eng = eng;
			students[cnt].mat = mat;
			students[cnt].tot = tot;
			students[cnt].avg = avg;
			students[cnt].rank = rank;
			
			cnt++; // 입력받은 학생수 1증가 + 채워넣을 인덱스 값도 1증가
			
			System.out.println("> 계속 하시겠습니까?");
			con = sc.next().charAt(0);
		} while (Character.toUpperCase(con) == 'Y');
		
		System.out.println("> 입력받은 학생 수 : " + cnt + "명");
		// ㄴ. 등수출력
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if(students[i].avg < students[j].avg) {
					students[i].rank++;
				} // if
			} // for j
		} // for i
		
		// ㄱ. 학생정보출력
		for (int i = 0; i < cnt; i++) {
			students[i].printInfo();
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
