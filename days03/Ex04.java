package days03;

/**
 * @author Yelin
 * @date 2022. 2. 17. - 오전 11:46:57
 * @subject  형변환
 * @content  byte끼리 연산했는데 왜 int가 나오는가?
 */
public class Ex04 {

	public static void main(String[] args) {
		// 한 학생의 이름, 국어, 영어, 수학, 총점, 평균을 출력...
		String name;
		byte kor, eng, mat;
		short tot; // 총점은 0 ~ 300
		double avg; // 평균은 소숫점 2자리 ***실수를 사용하게 되면 float말고 double로 사용
		
		// 표준 입력
		name = "홍길동";
		kor = 35;
		eng = 44;
		mat = 72;
		// 에러메시지 : Type mismatch: cannot convert from int to short
		// 해석 : int타입을 short타입으로 형변환 할 수 없다. >  byte로 지정했는데 왜 int?
		// 이유 : int보다 작은 자료형은 CPU로 연산할 때 처리단위 기본이 int이기 때문에 int로 처리
		// ex) short + int -> int
		//     short + short -> int
		//     byte + byte - > int
		// 자동 형변환이 되지 않음 -> 강제 형변환 필요
		// tot = kor + eng + mat;
		tot = (short)(kor + eng + mat); // Ex04_02 파일 확인
		avg = (double)tot / 3;  // short / int -> int : 소수점이 안나오기 때문에 강제 형변환 필요
		
		System.out.printf("국어:%d\n영어:%d\n수학:%d\n총점:%d, 평균:%f\n", kor, eng, mat, tot, avg);	
		
	}

}
