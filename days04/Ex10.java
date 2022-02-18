package days04;

/**
 * @author Yelin
 * @date 2022. 2. 18. - 오후 4:15:44
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// 1.
		// 정수 계열
		char a = 'a', z = 'z';
		char A ='A', Z = 'Z';
		System.out.printf("%c[%d]\n", a, (int)a);
		System.out.printf("%c[%d]\n", z, (int)z);
		System.out.printf("%c[%d]\n", A, (int)A);
		System.out.printf("%c[%d]\n", Z, (int)Z);

		/*
		 * 대문자를 소문자로 변환
		 * 소문자를 대문자로 변환
		 * 소 - 대 = 32    > 소문자와 대문자의 값 차이는 32
		 * 97 - 63 = 32
		 * a[97]
		 * z[122]
		 * A[65]
		 * Z[90]
		 * 
		 */
		
		// 2.
		// 대문자 A - 소문자 a 문자코드값의 차를 확인
		System.out.println(a - A);
		System.out.println('a' - 'A');  // 'a' - 'A'   32
		
		// 3. 소문자x에서 -32를 하면 대문자 X가 출력
		char ch = 'x' - 32;
		System.out.println( ch );  //  'X'
		
		// 대문자 X에서 +32를 하면 소문자 x가 출력
		char cha = 'X' + 32;
		System.out.println( cha );  //  'x'
		
	}

}
