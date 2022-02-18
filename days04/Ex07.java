package days04;

/**
 * @author Yelin
 * @date 2022. 2. 18. - 오후 2:21:41
 * @subject 인덱스(index) 연산자(operator)와 배열
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// String[] args > 문자열 배열 args
		// ***** [] 인덱스(index) 연산자 *****
		// 배열
		//    ㄱ. 배열 정의? [동일한 자료형]을 메모리 상에 [연속적]으로 놓이게 하는 것
		//    ㄴ. 배열 선언 형식
		//                  배열명 == 참조변수(실제기억 공간의 시작주소를 참조하기 때문에) == 변수명
		//        자료형 [] 배열명 = new 자료형[배열크기];
		//          ex) int [] kors = new int[3];
		//                                heap(힙) : 동적 메모리 영역 > int * 3
		
		int [] kors = new int[3];
		// 배열명[인덱스값]
		//          첨자값
		kors[0] = 98;
		kors[1] = 88;
		kors[2] = 50;
		
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);

	}

}
