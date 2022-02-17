package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 야리니
 * @date 2022. 2. 17. - 오후 3:00:42
 * @subject 키보드로부터 이름, 국어, 영어, 수학 점수를 입력받아서 총점과 평균 구하기
 * @content String("90")   -> byte >  Byte.parseByte("90");
		    String("90")   -> int  >  Integer.parseInt("90");
		    String("90")   -> double  >  Double.parseDouble("90");
 */
public class Ex07 {

	public static void main(String[] args) throws IOException {
		// 퀵서치 단축키 : Ctrl + Alt + Shift + L
		// Ex04 파일 참조해서 코딩
		// 키보드로부터 이름, 국어, 영어, 수학 점수를 입력받아서
		/* 출력형식)
		 * 이름:박예린
		 * 국어:35
		 * 영어:44
		 * 수학:72
		 * 총점(s):151, 평균(d):50.333333
		 */

		// 1. 변수 선언
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		// 2.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(">이름을 입력하세요:");
		name = br.readLine();
		System.out.print(">국어점수를 입력하세요:");
		// 에러메시지 : Type mismatch: cannot convert from String to byte
		// byte = String
		// (문제 원인/해걸)    String "90" -> byte 형변환
		// kor = br.readLine();
		
		//String("90")   -> byte >  Byte.parseByte("90");
		//String("90")   -> int  >  Int.parseInt("90");
		//String("90")   -> double  >  Double.parseDouble("90");
		// kor = Byte.parseByte("90");
		
		// String score_kor = br.readLine(); > "90"
		// kor = Byte.parseByte(score_kor);  > 90 형변환
		kor = Byte.parseByte(br.readLine());
		
		System.out.print(">영어점수를 입력하세요:");
		eng = Byte.parseByte(br.readLine());
		
		System.out.print(">수학점수를 입력하세요:");
		mat = Byte.parseByte(br.readLine());
		
		tot = (short)(kor + eng + mat);
		avg = (double)tot / 3;
		
		// 3. 출력
		System.out.printf("이름:%s\n국어:%d\n영어:%d\n수학:%d\n총점:%d, 평균:%f\n", name, kor, eng, mat, tot, avg);


	}

}
