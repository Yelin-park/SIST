package days04;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 18. - 오후 3:32:44
 * @subject BufferedReader br 사용하지 않고 [ Scanner 사용 ]
 * @content
 */

public class Ex08_03 {

	public static void main(String[] args) {
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		System.out.print("> 이름, 국어, 영어, 수학 입력하세요: ");  // 홍길동,90,88,50[,]  > 마지막에 ,를 붙이고 엔터쳐야 실행가능(일단 기억해두기)
		
		// sc 자원은 반드시 close(닫기)
		Scanner sc = new Scanner(System.in);
		String pattern = "\\s*,\\s*";
		sc.useDelimiter(pattern); // 구분자를 설정 > ,를 구분자로 설정(기본은 공백)
		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		tot = kor + eng + mat;
		avg = (double)tot / 3;
		
		System.out.printf("이름=\"%s\",국어=%d,영어=%d,수학=%d,총점=%d,평균=%.2f", name, kor, eng, mat, tot, avg);
		
		sc.close();

	}

}
