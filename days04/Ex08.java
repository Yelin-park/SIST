package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Yelin
 * @date 2022. 2. 18. - 오후 2:46:18
 * @subject 배열을 사용하는 예제
 * @content
 */
public class Ex08 {

	public static void main(String[] args) throws IOException {
		// (배열을 사용하는 예제)
		// 한 학생의 이름, 국어, 영어, 수학을 입력받아서 총점, 평균을 출력하는 코딩
		
		// 1. 변수 선언
		String name;
		int kor, eng, mat, tot;
		double avg;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("> 이름, 국어, 영어, 수학 입력하세요: "); // 홍길동,90,88,75 엔터
		// 이클립스 디버깅     > 실행할 때는 F11
		// toggle breakpoint : 여기서 멈추라는 중단점
		// 중단점이 잡힌 코드라인은 아직 실행이 안된 라인이다.
		// F6 Step Over -> 다음 단계로 넘어가짐
		// 디버깅을 하면 run탭 메뉴가 달라짐
		String data = br.readLine(); // "홍길동,90,88,75"
		// System.out.println("입력받은 데이터 :" + data);
		// "홍길동,90,88,75"    ->    콤마(,)를 구분자로 분리
		// "홍길동"
		// "90"
		// "88"
		// "75"
		
		// data.split("문자열");
		// 1. 기능 : 하나의 문자열을 구분자를 가지고 분리함
		// 2. 매개변수 : 자르고자 하는 구분자(String regex)
		// 3. 리턴값, 리턴자료형 : String[] 
		String[] dataArray = data.split(",");
		// 문자열 앞뒤에 있는 공백제거하는 메소드 : String.trim() 메소드
		name = dataArray[0].trim();
		kor = Integer.parseInt(dataArray[1].trim());  // "90" -> 90
		eng = Integer.parseInt(dataArray[2].trim());  // "88" -> 88
		mat = Integer.parseInt(dataArray[3].trim());  // "75" -> 75
		
		tot = kor + eng + mat;
		avg = (double)tot / 3;
		
		// 3. 출력
		System.out.printf("이름=\"%s\",국어=%d,영어=%d,수학=%d,총점=%d,평균=%.2f", name, kor, eng, mat, tot, avg);
		
		
		/*
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("> 이름, 국어, 영어, 수학 입력하세요: ");
		String data = br.readLine();
		
		String[] dataArray = data.split(",");
		name = dataArray[0];
		kor = Integer.parseInt(dataArray[1]);
		eng = Integer.parseInt(dataArray[2]);
		mat = Integer.parseInt(dataArray[3]);
		
		tot = kor + eng + mat;
		avg = (double)tot / 3;
		
		System.out.printf("이름=\"%s\",국어=%d,영어=%d,수학=%d,총점=%d,평균=%.2f", name, kor, eng, mat, tot, avg);
		*/

	}

}
