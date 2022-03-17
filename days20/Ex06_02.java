package days20;

import java.util.Arrays;

/**
 * @author Yelin
 * @date 2022. 3. 17. - 오후 2:02:24
 * @subject String 클래스 메서드 정리
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// String 클래스 메서드 정리
		String name1 = new String("abc");
		String name2 = new String("abc");
		String name3 = new String("Abc");
		System.out.println(name1.hashCode()); // 96354
		System.out.println(name2.hashCode()); // 96354
		System.out.println(name3.hashCode()); // 65602
		System.out.println(name1 == name2);	  // false
		
		// 1. 두 문자열을 비교할 때는 == 연산자 사용하지 않고, equals() 메서드 사용한다.
		System.out.println(name1.equals(name2));
		
		// 2. 대소문자 구분하지 않고 두 문자열 비교할 때는 equalsIgnoreCase() 메서드 사용한다.
		System.out.println(name1.equalsIgnoreCase(name3));
		
		// 3. null 문자, ""(빈문자) 다른 개념이다.
		String a = null;
		String b = "";	

		// 4. 문자열 길이를 구하는 메서드 length()
		String msg = "안녕하세요. Yaliny입니다.";
		System.out.println(msg.length()); // 17

		// length -> 배열을 가져오는 속성임
		int[] m = new int[5];
		System.out.println(m.length);
		// float 기본형   Float 래퍼(Wrapper) 클래스
		
		// 5. charAt(index)
		System.out.println(msg.charAt(1)); // 녕
		// msg 문자열 속에서 마지막 한 문자 얻어와서 출력.
		System.out.println(msg.charAt(msg.length()-1));
		
		// 6. 문자열 대/소문자 변환하는 메서드
		System.out.println(msg.toUpperCase()); // 안녕하세요. YALINY입니다.
		System.out.println(msg.toLowerCase()); // 안녕하세요. yaliny입니다.
		// 리턴값이 String인 것. 반환을 해주는 것일 뿐 값이 바뀌는 것이 아님
		System.out.println(msg); // 안녕하세요. Yaliny입니다. -> 원래 설정했던 값 -> String 변경이 불가능하다.
		
		// 7. substring()
		String rrn = "780123-1700001";
		System.out.println(rrn.substring(0, 6));
		System.out.println(rrn.substring(7, rrn.length()-1)); // 이렇게 해도 되지만
		System.out.println(rrn.substring(7)); // 코드를 짧게 하는 것이 좋다
		
		// 8. split()
		String[] rrns = rrn.split("-");
		System.out.println(Arrays.toString(rrns));
		
		// 8-2. split(regex, int limit)
		String[] cards = "1234-2342-2356-9487".split("-");
		System.out.println(Arrays.toString(cards)); // [1234, 2342, 2356, 9487]
		String[] cards2 = "1234-2342-2356-9487".split("-", 3);
		System.out.println(Arrays.toString(cards2)); // [1234, 2342, 2356-9487]
		
		// 9. String -> char[]  toCharArray() 메서드
		rrn = "780123-1700001";
		char[] c = rrn.toCharArray();
		System.out.println(Arrays.toString(c));
		
		// msg = "안녕하세요. Yaliny 입니다.";
		// [문제] 한글은 제거하고 알파벳만 문자열로 만드세요.
		char[] chs = new char[9]; // .과 공백 포함해서
		int idx = 0;
		for (int i = 0; i < msg.length(); i++) {
			// System.out.print("" + msg.charAt(i) + "");
			char one = msg.charAt(i);
			if(!('가' <= one && one <= '힣')) {
				// System.out.print(one);
				chs[idx++] = one;
			}
		}
		System.out.println(new String(chs));
		
		char[] msgCharArray = msg.toCharArray();
		for (int i = 0; i < msgCharArray.length; i++) {
			System.out.println(msgCharArray[i]);
		}
		
		// 10. replace() 기존 문자열을 원하는 문자열로 바꾸는 메서드
		System.out.print(msg.replace('Y', 'X')); 			// 안녕하세요. Xaliny입니다.
		// CharSequence는 인터페이스 -> String을 주었음 : 업캐스팅, 인터페이스 다형성
		System.out.println(msg.replace("안녕", "Hello")); 	// 안녕하세요. Yaliny입니다.
		System.out.println(msg.replaceAll("[가-힣]", "!")); // !!!!!. Yaliny!!!.
		
	} // main

} // class
