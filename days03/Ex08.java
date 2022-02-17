package days03;

/**
 * @author Yelin
 * @date 2022. 2. 17. - 오후 4:00:46
 * @subject 래퍼(Wrapper) 클래스
 * @content 
 *          cast 연산자 관련 주의사항
 *          래퍼클래스의 의미
 *          
 */
public class Ex08 {

	public static void main(String[] args) {
		
		// int kor = (int)"90"
		// cast 연산자는 같은 숫자형일때만 형변환 가능
		//     ex) double -> int, int -> double 가능
		// ㄴ 클래스들간의 형변환할 때도 사용한다. UpCasting/DownCasting  > 클래스 배울 때 상세히 배울 예정

		// 래퍼클래스란? 기본형을 사용하기 쉽도록 기능(메소드, 필드)을 구현해(포장해) 놓은 클래스
		// int i = 2147483647;
		
		// 기본형 int -> Integer 클래스
		// int i = Integer.MAX_VALUE;
		// System.out.println(i);
		
		// 기본형 byte -> Byte 클래스
		byte b = Byte.MAX_VALUE;
		System.out.println(b);
		
		// 기본형  -> 래퍼클래스(Wrapper)      래퍼클래스.parse자료형 ex) xxxx.parsexxx("90");
		// char    -> Character                
		// byte    -> Byte                     Byte.parseByte("90");
		// short   -> Short                    
		// int     -> Integer                  Integer.parseInt("90");
		// long    -> Long                     Long.parseLong("90");
		// float   -> Float                    Float.parseFloat("90");
		// double  -> Double                   Double.parseDouble("90");
		// boolean -> Boolean                  
                                               
	}                                          

}
