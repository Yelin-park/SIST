package days04;

/**
 * @author Yelin
 * @date 2022. 2. 18. - 오전 9:57:38
 * @subject 
 * @content  3일차 복습 문제 풀이
 *           실수를 소수점 2자리까지 출력하는 방법
 */
public class Ex01 {

	public static void main(String[] args) {
		// 1. [3일차 복습 문제 풀이]
		// 일반 논리 연산자 중 우선순위가 높은 순서(p91) :  !   >   &&   >   ||
		//                                                ! 단항연산자가 우선순위가 높음
		
		// 연산자를 사용해서 수식으로 나타내세요.
		// 1) ch 문자는 대문자('A' ~ 'Z')이다.
		// 'A' <= ch && ch <= 'Z'
		// 65 <= ch && ch <= 90
		
		
		// 2) ch 문자는 숫자('0' ~ '9')이다.
		// '0' <= ch && ch <= '9'
		//  48 <= ch <= 57 [문자코드 값이 48이라서 가능]
		//  0 정수
		// '0'문자 -> ASCII(문자코드) 48 정수
		// '1'문자 -> ASCII(문자코드) 49 정수
		// '2'문자 -> ASCII(문자코드) 50 정수
		
		
		// 3) x는 15보다 같거나 크고, 40보다 같거나 작다.
		//    x > = 15 && x <= 40
		
		// 4) x는 2의 배수 또는 3의 배수이다.
		//    (x % 2 == 0) || (x % 3 == 0)  > 가독성 굳
		//     x % 2 == 0 || x % 3 == 0  > 성능 굳
		//    어떤 정수의 배수 > x를 2로 나누어서 떨어진다.== 나머지 0
		
		
		
		// 2. 소수점 자리 출력
		int score = -70;
		System.out.printf("score=%(d\n", score);  // 음수일 경우에는 %뒤에 (를 치면 (70)으로 출력
		System.out.printf("score=%(d\n", score);  // 양수일 경우에는 (해도 그냥 70으로 나옴
		
		int money = 12345;
		System.out.printf("money=%,d\n", money);  // % 뒤에 ,를 붙이면, 1000단위마다 ,를 찍어줌 > money=12,345
		
		byte kor = 10;
		short eng = 80;
		long mat = 70;
		
		System.out.printf("kor=[%d]\n", kor);   // %d : 10진수 정수 형태로 출력
		
		// 총자리수 10자리를 잡고 우측정렬을 해서 출력해라 > ________10
		System.out.printf("kor=[%10d]\n", kor);   
		
		// 총자리수 10자리를 잡고 우측정렬을 하고 빈자리에는 0으로 채워서 출력해라 ***[기억]
		System.out.printf("kor=[%010d]\n", kor);   
		int num1 = 5, num2 = 300;
		//         0005      0300
		
		// 화면에 출력할 때는 4자리의 숫자형식 출력
		System.out.printf("%04d\t%04d\n", num1, num2); // '\t' : 탭(Tap) 제어문자
		
		// 총자리수 10자리를 잡고 좌측정렬을 해서 출력해라 > ________10
		System.out.printf("kor=[%-10d]\n", kor);   
		
		System.out.printf("kor=[%#o]\n", kor);  // %o : 8진수 정수 형태로 출력   > % 뒤에 #을 붙이면 0이 같이 출력
		System.out.printf("kor=[%#x]\n", kor);  // %x : 16진수 정수 소문자 형태로 출력
		System.out.printf("kor=[%#X]\n", kor);  // %X : 16진수 정수 대문자 형태로 출력
		
		// float avg = 87.32342f;
		double avg = 87.3242;
		// 에러메시지 : java.util.IllegalFormatConversionException
		// 해석 : [ConversionException]이 나오면 출력 서식이 틀렸다. ex) 소수인데 왜 정수형 출력서식을 사용했냐
		// System.out.printf("avg=%d\n", avg);
		
		// 기본 : 소수점 6자리까지
		System.out.printf("avg=%f\n", avg); 
		
		// 총자리수 10자리를 잡고 우측정렬을 하고 출력해라
		System.out.printf("avg=[%10f]\n", avg);
		
		// 총자리수 10자리를 잡고 우측정렬을 하고 소수점 2자리만 출력
		System.out.printf("avg=[%10.2f]\n", avg);
		
		// 소수점 2자리만 출력
		System.out.printf("avg=[%.2f]\n", avg); 
		
	}

}
