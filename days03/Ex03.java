package days03;

/**
 * @author Yelin
 * @date 2022. 2. 17. - 오전 10:45:58
 * @subject 실수의 진법 변환(책 p48)과 실수형(p68)
 * @content double은 배정도 정밀도
 *          flaot, double 어떻게 저장되는지 개념을 알아야함 ***
 *          자료형 float 변수에 값 할당하는 방법 + 자료형 long 변수에 값 할당하는 방법
 *          접미사(p32)
 *          
 */
public class Ex03 {

	public static void main(String[] args) {
		// 1. 실수 진법 변환
		//   정수 3을 2진수로 나타내면 0011
		//   실수 3.625 -> 메모리상 저장(2진수 변환)
		//   0.625 * 2 = [1].25
		//   0.25 * 2 = [0].5
		//   0.5 * 2 = [1].0
		//   0.625의 2진수 값 : 101
		//   소수값이 0이 나올 때 까지
		//   즉 3.625는 2진수로 변환하면 11.101
		//   다시 10진수로 변환하려면       1*2^-1(2의 마이너스 1승) + 1*2^-2 + 1*2^-3
             
		//   소수값이 0이 나오지 않으면 무한으로 나오게 됨
		//   float / double(배정도 정밀도) > 두 자료형 모두 오차가 있는 자료형  > 부동소수점(소수점의 위치가 바뀌지 x) 표기
		//   float보다 double이 2배 정도 정밀하여 '배정도 정밀도'라고 한다.
		//   0.14 * 2 = 0.28 > 2진수로 변환시 01001... 무한
		     
		//   오차가 있는 자료형
		//   float  1(S)  8(E지수) 23(M가수)
		//   double 1(S) 11(E지수) 52(M가수)
		//   예) 10진수 예 - 지수/가수
		//       1234.5678 * 10^3 = 1.2345678 > 10의 n승에 따라서 같은 위치에 소수점을 줄 수 있음 > 부동소수점(소수점의 위치가 바뀌지 x) 표기
		//       ^3 > E3으로 바꾸면 1.2345678E3 > E 뒤에 있는 3 : 지수, E 앞에 있는 1.2345678 : 가수
		//       3.14
		//       0.0023 * 10^-2 > 0.23
		     
		//   11.101
		//   1.1101E1 ( 11.101 * 10^1)
		//   1은 지수, 1.1101은 가수
		     
		//   3.14를 double로 바꾸면 무한으로 될 수도 있어서 오차가 계속 발생
		
		
		
		// 2. 실수 자료형
		//    키, 몸무게를 저장할 변수 > 175.3 65.2
		float height;
		// 에러메시지 : Type mismatch: cannot convert from double to float
		// 해석 : 타입 불일치, double타입을 float타입으로 형변환할 수 없다.
		// float   double  > 같은 실수를 나타내지만 자료형이 다름
 		// height = 175.3; //접미사 f를 붙이자
		height = 175.3f;
		System.out.println(height);

		// 에러메시지 : Type mismatch: cannot convert from int to byte
		// 해석 : int타입을 byte로 형변환할 수 없다.
		// byte b = 500;
		
		// 에러메시지 : Type mismatch: cannot convert from long to int
		// 해석 : long타입을 int타입으로 형변환할 수 없다.
		long l = 1000;
		// int i = l;
		
		// 실수의 기본 자료형 : double
		// 0.0
		// 0.0f -> float
		// 정수의 기본 자료형 : int
		// 0
		// 0l -> long

		double weight = 65; //정수 int와 사용방식이 같음
		// double weight = 65d; > 이렇게 사용해도 상관x
		// 65D == 65d == 65.0
		System.out.println(weight);
	}

}
