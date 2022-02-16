package days02;

/**
 * @author Yelin
 * @date 2022. 2. 16. - 오후 3:42:57
 * @subject 불린형(논리형) 자료형 설명
 * @content boolean(1) : 참(True)/거짓(False)
 */
public class Ex10_02 {

	public static void main(String[] args) {
		// 참(True)/거짓(False) 값만을 가지는 자료형
		// 1byte
		
		// 예) 성별이 남자라면 true, 여자라면 false로 값을 저장
		boolean gender = true;
		// 출력형식 : 성별은 true 입니다.
		// 출력서식 boolean > %b
		System.out.printf("성별은 %b 입니다.", gender);
		
		// 에러메시지 : Type mismatch: cannot convert from int to boolean
		// 해석 : 타입(자료형 일치x) > int 타입을 boolean형으로 변환할 수 없다 
		// gender = 1; // 다른 언어에서는 0이 아닌 모든 값은 참으로 인식함

		
	}

}
