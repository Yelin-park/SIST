package days04;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 18. - 오후 3:13:45
 * @subject BufferedReader br 사용하지 않고 [Scanner] 사용
 * @content 
 */
public class Ex08_02 {

	public static void main(String[] args) {
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("> 이름, 국어, 영어, 수학 입력하세요: ");  // 홍길동 90 88 50  > Scanner로 읽어 드릴 때는(입력할 때는) 구분자가 ,가 아니라 공백!
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		
		tot = kor + eng + mat;
		avg = (double)tot / 3;
		
		System.out.printf("이름=\"%s\",국어=%d,영어=%d,수학=%d,총점=%d,평균=%.2f", name, kor, eng, mat, tot, avg);
		

	}

}
