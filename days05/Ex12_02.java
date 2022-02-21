package days05;

public class Ex12_02 {

	public static void main(String[] args) {

		String name = "hong gil dong";
		
		// for 반복문으로 처리.
		// System.out.println( name.length() );  // 문자열 길이  13
		
		int len = name.length();
		for (int i = 0; i < len ; i++) { 
			System.out.println(name.charAt(i));
		}

	} // main

}  // class


//charAt(index)
//첫번째 문자를 얻어오기
/*
System.out.println(name.charAt(0));
System.out.println(name.charAt(1));
System.out.println(name.charAt(2));
System.out.println(name.charAt(3));
System.out.println(name.charAt(4));
System.out.println(name.charAt(5));
System.out.println(name.charAt(6));
System.out.println(name.charAt(7));
System.out.println(name.charAt(8));
System.out.println(name.charAt(9));
System.out.println(name.charAt(10));
System.out.println(name.charAt(11));
System.out.println(name.charAt(12));
*/
