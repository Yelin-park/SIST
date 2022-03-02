package days10;

/**
 * @author Yelin
 * @date 2022. 3. 2. - 오전 11:01:09
 * @subject 제어문 + 배열 + 알고리즘 응용/활용 예제
 * @content
 * 			toCharArray() 메서드 : String -> char[] 로 변환하는 메서드
 * 			String str = new String(char[]) : char[] -> String 변환
 */
public class Ex03 {

	public static void main(String[] args) {
		String rrn = "830412-1700001";
		
		// 풀이 4)
		// 내가 푼 코딩
		// toCharArray() 메서드 : String -> char[] 로 변환하는 메서드
		char[] ch = rrn.toCharArray();
		for (int i = 8; i < ch.length; i++) {
			ch[i] = '*';
		}
		// String str = new String(char[]) : char[] -> String 변환
		rrn = new String(ch);
		System.out.println(rrn);
		
		/*
		for (int i = 0; i < ch.length; i++) {
		System.out.printf(" '%c' \n", ch[i]);	
		}
		*/
		
		/*
		// 풀이3) String.substring(시작 인덱스, 끝인덱스) > End 인덱스 앞 위치값까지 읽어온다. ***
		System.out.println(rrn.substring(0, 6));            // 830412
		System.out.println(rrn.substring(7, 14));           // 1700001
		System.out.println(rrn.substring(7)); 				// endIndex를 생략하면 문자열 끝까지를 나타낸다.
		System.out.println(rrn.substring(0, 8) + "******"); // 830412-1******
		*/
		
		/*
		// 풀이2) "830412-1******"
		String[] rrnArr = rrn.split("-");
		rrnArr[1] = rrnArr[1].charAt(0) + "*****";
		rrn = String.join("-", rrnArr);
		System.out.println(rrn);
		*/
		
		
		/*
		// 풀이1)
		String[] rrnArr = rrn.split("-");
		
		rrnArr[1] = "*******";
		
		rrn = String.join("-", rrnArr);
		System.out.println(rrn);
		
		// System.out.println("830412-*******");
		// System.out.println("830412-1******");
		*/
		
	} // main

} // class
