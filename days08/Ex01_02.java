package days08;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 24. - 오전 10:20:41
 * @subject
 * @content 
 * 우편번호란? 우정사업본부는 2015년 8월 1일 부터 국가기초구역에 부여된 5자리 구역번호를 우편번호로 사용하고 있습니다.
				개편된 우편번호를 사용하시면 집배원의 배달경로 최적화로 우편물이 신속 정확하게 배달되어 우편서비스가 개선되며,
				모든 공공기관의 각종정보 공유로 국가차원의 경쟁력이 강화될 수 있습니다.
우편번호 구성 ? 5자리 우편번호는 서울부터 사행식(북서 → 남동)으로 제주까지 순차적으로 부여되어 있으며, 5자리 중 앞3자리로 시군자치구를 구별하고,
				뒤 2자리는 연번으로 부여되어 있습니다.			
				
 */
public class Ex01_02 {

	public static void main(String[] args) {
		// [문제] 입력 받은 값에 대해서 유효성 검사 - String regex 
		// 우편번호를 입력받아서  우편번호 O, 우편번호 X
		// 000-000 또는 00000  => 정규표현식으로 나타낼 수 있느냐?
		
		// [123456789] = [0-9] 
		// [234678] = [2-4[6-8]] == 234 또는 678
		// [2345] = [0-9&&[2-5]] == 교집합
		//          [a-z&&[def]]
		/*
		    [abc]	a, b, or c (simple class)
			[^abc]	Any character except a, b, or c (negation)
			[a-zA-Z]	a through z or A through Z, inclusive (range)
			[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
			[a-z&&[def]]	d, e, or f (intersection)
			[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
			[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)
		 */
		/*
		[Greedy quantifiers]
		X?	X, once or not at all
		X*	X, zero or more times
		X+	X, one or more times
		X{n}	X, exactly n times
		X{n,}	X, at least n times
		X{n,m}	X, at least n but not more than m times
		
		[Logical operators]
		XY	X followed by Y
		X|Y	Either X or Y
		(X)	X, as a capturing group
		*/
		
		String zipcode; // postcode
		Scanner sc = new Scanner(System.in);
		
		System.out.print("> 우편번호를 입력하세요(000-000 또는 00000): ");
		
		String sZipcode = sc.next();
		// String regex ="[0-9][0-9][0-9]-[0-9][0-9][0-9]";
		String regex = "\\d{3}-\\d{3}|\\d{5}"; // regex에서 띄워쓰기 넣으면 안됨
		
		if (sZipcode.matches(regex)) {
			System.out.println("우편번호 O");
			
		} else {
			System.out.println("우편번호 X");
		}
		
		
		
		/* 내가 풀다 만 코드..
		Scanner sc = new Scanner(System.in);
	
		String regex1 ="\\d{5}";
		
		// String regex2 ="[0-90-90-9-0-90-90-9]";
		
		String pNum;
		String data;
		do {
			System.out.println("우편번호를 입력:");
			data = sc.next();
		} while (!data.matches(regex1));
		
		pNum = data;

		System.out.println("우편번호 : " + pNum);
		*/
		
	} // main

} // class
