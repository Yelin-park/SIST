package days02;

/**
 * @author Yelin
 * @date 2022. 2. 16. - 오전 11:26:34
 * @subject
 * @content 에러메시지 확인
 *          원하는 출력형식으로 출력하기
 *          + 연산자의 종류 2가지
 * 
 * 
 */

public class Ex04 {

	public static void main(String[] args) {
		// 이름을 저장할 변수, 나이를 저장할 변수 선언
		// 이름 > 문자열 String
		// 나이 > 숫자 정수형 int
		String name;
		int age;
		
		// 이름 : 홍길동, 나이 : 20 초기화 하세요.
		// name = 홍길동; > 에러 : 홍길동 cannot be resolved to a variable > 해석 : 홍길동 변수를 찾을 수 없다.
		name = "홍길동";
		age = 20;
		
		// 형식으로 출력 : 이름은 "홍길동"이고, 나이는 20살 입니다.
		// [+ 연산자의 종류 2가지]
		//  ㄱ. + 산술연산자 중에 덧셈 연산자
		//  ㄴ. + 문자열 연결 연산자 ***
		// 처리방향 왼쪽에서 오른쪽으로 (-------->)
		//                 "이름은 홍길동" + "이고, 나이는"
		//                 "이름은 홍길동이고, 나이는" + 20
		//                  문자열 + 숫자 = 합쳐진 문자열 ***
		// 특수기호 앞에 \(역슬래쉬)를 붙여야 한다.
		// '' > 특수기호를 붙이지 않아도 되지만 가독성을 위해서 붙여서 사용하기
		System.out.println("이름은 \""+ name + "\"이고, 나이는 \'" + age + "\'살입니다.");
		
		// 에러메시지 : The left-hand side of an assignment must be a variable
		// 해석 : 할당된 왼쪽은 변수여야 한다(좌측항은 변수여야하고 우측항은 대입할 값이어야 한다)
		// System.out.println("이름은 ""+ name + ""이고, 나이는 " + age + "살입니다.");
		// "이름은 " 와 "+ name + " 와 "이고, 나이는 " 사이에 연산자가 필요


	}
}
