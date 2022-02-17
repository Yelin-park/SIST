package days03;

/**
 * @author Yelin
 * @date 2022. 2. 17. - 오후 4:51:01
 * @subject 논리연산자 p114
 * @content 
 */
public class Ex09_04 {

	public static void main(String[] args) {
		// 1) 일반논리 연산자 : && || !
		//   ㄱ. && 일반 논리 AND 연산자(논리곱) > 참을 1로 생각해서 계산하면 이해가능
		//         true && true -> true      피연산자 모두 true 일때만 true이다.
		//         true && false -> false
		//         false && ture -> false
		//         false && false -> false
		
		//   ㄴ. || 일반 논리 OR 연산자(논리합)
		//         true && true -> true      피연산자 중에 하나만 true이면 true이다.
		//         true && false -> true 
		//         false && true -> true 
		//         false && false -> false   
		
		//   ㄷ.  !  부정연산자 == not연산자(비트논리연산자에 없어서 일반논리 안붙여도됨)
		//        참(true)을 부정하면 거짓(false)이 되고
		//        거짓(false)을 부정하면 참(true)가 된다.
		//        !true -> false
		//        !false -> true
		//        !!!false -> true
		
		//        p91 연산자 우선순위
		//        *** 비교연산자보다 부정(!) 연산자 우선순위가 높아서 ! 뒤에 피연산자가 5 int 정수값이 왔다.
		//        에러메시지 : The operator ! is undefined for the argument type(s) int
		//        해석 : not(!)이라는 부정연산자는 int타입에는 사용할 수 없다. > 부정연산자는 true/false 값만 올 수 있음
		//        System.out.println(!5 > 3); 
		System.out.println(!(5 > 3)); 
		
		/*
		System.out.println(3>5 && 100<2);
		System.out.println(3<5 && 100<2);
		System.out.println(3<5 && 100>2);
		System.out.println(3>5 && 100>2);
		System.out.println(3>5 || 100<2);
		System.out.println(3<5 || 100<2);
		System.out.println(3<5 || 100>2);
		System.out.println(3>5 || 100>2);
		*/
		
		// 2) 비트논리 연산자 : ~  &  |  ^

	}

}
