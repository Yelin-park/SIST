 package days03;

/**
 * @author Yelin
 * @date 2022. 2. 17. - 오후 12:04:33
 * @subject 형(Data Type)변환 설명 > 자료형 변환(p.74)
 * @content Type mismatch: cannot convert from int to short
 *          형변환 개념
 *          자동 형변환과 강제형변환
 *          cast 연산자를 사용해서 강제 형변환
 */
public class Ex04_02 {

	public static void main(String[] args) {
		/*
		 * 1. 형 변환
		 *   ㄱ. 자동 형변환 2가지
		 *      1) 작은 자료형의 값을 큰 자료형에 대입할 때 자동형변환된다.
		 *      2) 작은 자료형의 연산(+, -, / 등) 큰 자료형 -> 결과값은 큰 자료형으로 자동형변환된다.
		 *   ㄴ. 강제 형변환
		 *   
		 *     
		 */
				
		/*
		// 1) 자동 형변환되는 첫 번째 경우
		int i = 100;   // 4byte
		long j = 10L;  // 8byte
		
		long j = int i; 자동형변환 우측에 있는 자료형이 좌측에 있는 자료형보다 크기가 작기 때문에 자동으로 형변환이 된다.
		j = i;
		*/
		
		/*
		// 2) 자동 형변환되는 두 번째 경우
		int a = 100;
		long b = 100; // 자동 형변환되는 1) 경우가 적용 > l을 안붙인 100은 int이고 자동으로 형변환 됨
		
		long c = b + a; // long b + int a
		System.out.println(c);
		*/
		
		// ㄴ. 강제 형변환
		// float, double 출력 서식 : %f
		int tot = 152;
		//              int / int => int > 50이 나오고(자동형변환 1경우) double로 형변환이 되어서 50.0000이 나옴
		// double avg = tot / 3; // 계산기 값 : 50.666667
		
		// 개발자가 강제로 int -> double 형 변환 필요
        //                double / int => double
		double avg = (double)tot / 3; // 과목수는 소수점으로 표현안하니까 tot를 double로 강제형변환하기
		                              // () cast 연산자 > ()안에는 변환하고자 하는 타입(data type)을 넣음
		System.out.printf("총점:%d, 평균:%f\n", tot, avg);

	}

}
