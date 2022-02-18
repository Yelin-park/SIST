package days04;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		// sc 자원 반드시 close(닫기)
		Scanner sc = new Scanner(System.in); 
		
		String pattern = "\\s*,\\s*";
		sc.useDelimiter( pattern );  // 콤마 구분자를 설정
		
		System.out.print("> 이름,국어,영어,수학 입력 ? ");    // 홍길동, 90, 88, 50[,]            엔터
		name = sc.next();    // String
		kor = sc.nextInt();  // 
		eng = sc.nextInt();
		mat = sc.nextInt();		
		
		tot = kor + eng + mat;
		avg = ( double ) tot / 3;
		
		 
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%.2f\n"
				, name, kor, eng, mat, tot, avg);

		sc.close();

	}

}
