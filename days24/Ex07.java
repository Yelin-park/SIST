package days24;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import days15.Student;

/**
 * @author Yelin
 * @date 2022. 3. 23. - 오후 2:17:16
 * @subject p584 ArrayList 컬렉션 클래스
 * @content p587 예제11-2 살펴봄
 */
public class Ex07 {

	public static void main(String[] args) {
		// 배열대신 컬렉션 클래스 사용하는 것이 추가/수정/삭제/크기 자동 증가 등등 용이
		// days15.Ex06.java
		// 한 반에 30명 학생의 이름, 국어, 영어, 수학, 총점, 평균, 등수 처리하는 예제 : days11.Ex07.java
		// 1. Student 클래스 선언 <- 속성, 기능 파악해서 목록 작성
		// 2. 객체 배열 == 클래스 배열(클래스 자료형으로 배열을 선언하겠다)
		Scanner sc = new Scanner(System.in);
		
		final int STUDENT_COUNT = 30;
		ArrayList list = new ArrayList(STUDENT_COUNT);
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
			int wrank = 1;
			
			Student s = new Student(no, name, kor, eng, mat, tot, rank, wrank, avg);
			list.add(s);
			
			cnt++; // 입력받은 학생수 1증가 + 채워넣을 인덱스 값도 1증가
			
			System.out.println("> 계속 하시겠습니까?");
			con = sc.next().charAt(0);
		} while (Character.toUpperCase(con) == 'Y');
		
		// System.out.println("> 입력받은 학생 수 : " + cnt + "명");
		System.out.println("> 입력받은 학생 수 : " + list.size() + "명");
		
		// ㄴ. 등수처리
		for (int i = 0; i < list.size(); i++) {
			Student a = (Student) list.get(i);
			for (int j = 0; j < cnt; j++) { // cnt로 넣어주는게 더 좋음, 메서드를 계속 호출하지 않아서
				Student b = (Student) list.get(j);
				if(a.tot < b.tot) {
					a.rank++;
				} // if
			} // for j
		} // for i
		
		
		// ㄱ. 학생정보출력
		// 반복자(Iterator) 사용
		/*
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s); // s.toString();
		}
		*/
		
		// 람다로 학생 정보 출력
		// -> : 람다연산자
		list.forEach(s -> System.out.println(s));
		System.out.println("===============================================");
		
		// 1. 복제
		ArrayList listClone = (ArrayList) list.clone(); // 복제(원본 손상안가도록)
		
		// 2. 복제한 listClone을 성적으로 오름차순 정렬
		// 에러메시지 : java.lang.ClassCastException: days15.Student cannot be cast to java.lang.Comparable
		// 해석 : Comparable -> 비교할 게 없다. -> 비교할 정렬 기준이 없다.
		// 이유? 정렬하는 기준이 없음
		// 방법1)
		listClone.sort(new StudentRankComparator());
		
		// 방법2)
		// Collections.sort(listClone, new StudentRankComparator());
		
		// 방법3) 익명클래스 사용
		/*
		Collections.sort(listClone,
				new Comparator() { // 익명클래스 사용
					@Override
					public int compare(Object o1, Object o2) {
						if(o1 instanceof Student && o2 instanceof Student) {
							Student s1 = (Student) o1;
							Student s2 = (Student) o2;
							return s2.tot - s1.tot; // 같으면 0, s2가 크면 양수, s2가 작으면 음수 - 오름차순 정렬 
							// return s1.tot - s2.tot; // 내림차순 정렬
						}
						return 0;
				}
			}
		);
		*/
		
		// 3. 복제한 listClone을 출력
		listClone.forEach(s -> System.out.println(s));
		
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

// 학생의 정렬 기준 클래스 선언 [Comparator] / Comparable 인터페이스 구현
class StudentRankComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student) o1;
			Student s2 = (Student) o2;
			return s2.tot - s1.tot; // 같으면 0, s2가 크면 양수, s2가 작으면 음수 - 오름차순 정렬 
			// return s1.tot - s2.tot; // 내림차순 정렬
		}
		return 0;
	}
	
} // StudentRankComparator
