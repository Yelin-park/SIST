package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 야리니
 * @date 2022. 2. 17. - 오후 3:42:24
 * @subject
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) throws IOException {
		// 키보드로부터 이름, 국어, 영어, 수학 점수를 입력받아서
		// 총점, 평균, 계산 출력
		
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		
		System.out.print("> 이름을 입력하세요: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		name = br.readLine();
		
		System.out.print("> 국어 점수를 입력하세요: ");
		kor = Byte.parseByte(br.readLine());
		
		System.out.print("> 영어 점수를 입력하세요: ");
		eng = Byte.parseByte(br.readLine());
		
		System.out.print("> 수학 점수를 입력하세요: ");
		mat = Byte.parseByte(br.readLine());
		
		tot = (short)(kor + eng + mat);
		avg = (double)tot / 3;
		
		System.out.printf("이름:%s\n국어:%d\n영어:%d\n수학:%d\n총점:%d, 평균:%f", name, kor, eng, mat, tot, avg);

	}

}
