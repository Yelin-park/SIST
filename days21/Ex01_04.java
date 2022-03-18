package days21;

/**
 * @author Yelin
 * @date 2022. 3. 18. - 오전 10:37:35
 * @subject
 * @content 앞으로 문자열 변경하는 코딩 : String 클래스 X, StringBuffer, StringBuilder 클래스 사용해야 된다.
 * 			 처리 속도 시간차이가 1000배 이상 차이 남
 */
public class Ex01_04 {

	public static void main(String[] args) {
		// 문자열이 자주 변경이되면 String X StringBuffer, StringBuilder(O)
		// testString(); // > for문 처리 시간 : 10314559400ns
		
		// [1,033]배 처리속도 차이
		testStringBuffer(); // > for문 처리 시간 : 9984400ns
		
	} // main
	
	public static void testString() {
		//      현재	 시간 밀리세컨드 -> 1970.01.01부터 시스템의 현재 시간을 1/1000초(밀리세컨드)를 long으로 반환
		// System.out.println(System.currentTimeMillis()); // 1647567628346ms -> 1000으로 나누면 초가 나옴
		long start = System.nanoTime(); // 1/1000000000초(10^9)초 -> 1000000000으로 나누면 초가 나옴
		// System.out.println(start); // 612093041651800
		
		// 인스턴스(객체) 생성하는 코딩 -> 시간이 많이 걸린다.
		// 20만번 for문 반복될 때 인스턴스(객체) 20만개 생성 -> 참조 (ex. 택배를 보낼 때 마다 1개씩 보내고 20만번 택배기사 부르는 것...)
		String sb = "a";
		for (int i = 0; i < 200000; i++) {
			sb += "a";
		}
		
		long end = System.nanoTime();
		
		System.out.println("> for문 처리 시간 : " + (end-start) + "ns" );
		
	} // testString
	
	public static void testStringBuffer() {
		long start = System.nanoTime(); 
		
		StringBuffer sb = new StringBuffer("a");
		for (int i = 0; i < 200000; i++) {
			sb.append("a");
		}
		
		long end = System.nanoTime();
		
		System.out.println("> for문 처리 시간 : " + (end-start) + "ns" );
	} // testStringBuffer
	
} // class
