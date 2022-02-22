package days06;

/**
 * @author Yelin
 * @date 2022. 2. 22. - 오전 11:10:39
 * @subject foreach문 설명
 * @content Character.isAlphabetic() 메소드
 * 			배열 초기화(선언과 동시에 값 초기화)
 *          배열 출력
 */
public class Ex02 {

	public static void main(String[] args) {
		// Character.isAlphabetic() 메소드 3가지
		// 1. 기능
		// 2. 매개변수
		// 3. 리턴값(리턴자료형)
		// Character.isAlphabetic(int codePoint)
		// int codePoint => Unicode code point => 전 세계의 문자
		
		// [foreach문 설명]
		// 선언 형식
		/*
		for (자료형 변수명 : 배열 또는 컬렉션) {
			
		}
		*/
		
		/*
		// 1. 배열 선언
		int[] kors = new int[3]; // 3 == 배열의 크기 == 배열명.length
		// 2-2. 배열의 초기화
		kors[0] = 90;
		kors[1] = 89;
		kors[2] = 78;
		kors[3] = 56;
		kors40] = 88;
		*/
		
		// ***** [시험] 배열 초기화(선언과 동시에 초기화) *****
		// 배열 관련 1(배열 선언) + 2(초기화) 합쳐서 하나로 코딩하기
		// int[] kors = new int[] {90, 89, 78, 56, 88};
		int[] kors = {90, 89, 78, 56, 88};  // new int[] 삭제해도 됨
		
		System.out.println(kors.length);
		// 배열의 마지막 요소 == kors.length - 1 == 2
		// 2-1. 각 배열의 요소를 초기화 하지 않았는데도.. 에러 발생X    int[] 각 요소에 0으로 초기화가 되어져 있다.(배열의 자료형으로 초기화)
		System.out.println(kors[kors.length - 1]);

		// [배열 출력]
		System.out.println("-for문을 사용하여 배열 출력----------------------------------------------");
		
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("kors[%d] = %d\n", i, kors[i]);
		}
		
		System.out.println("-foreach문을 사용하여 배열 출력----------------------------------------------");
		// 배열의 값을 가져올 때 for문 보다 더 편리함~
		// iterate : 배열의 요소를 반복해서 처리하는 문 : foreach 문
		for (int kor : kors) {
			System.out.println(kor);
		}
		
	}

}
