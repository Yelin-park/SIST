package days04;

public class Ex01_02 {

	public static void main(String[] args) {
		// [출력서식 형식]
		// %[argument_index$][flags][width][.precision]conversion
		// %conversion       > %c %b %f %e %t %s %d 등등
		
		// %[.precision]conversion
		// %     .2       f           > 소수점 2자리 출력

		// %[width][.precision]conversion
		// %  10       .2         f            >  총자리수 10자리를 잡고 우측으로 정렬, 소수점 2자리까지 출력
		
		// %[flags]conversion
		// %   #     d
		// %   (     d 
		// %   ,     d 
		// %   0     d 
		
		// %[argument_index$]
		// %     1$
		String name = "홍길동";
	
		System.out.printf("%1$s\n%1$s\n%1$s\n", name);
		
		// System.out.printf("%s\n%s\n%s\n", name, name, name);
		// 에러메시지 : java.util.MissingFormatArgumentException
		// 해석 : 인자가 빠졌다.
		
		/* System.out.println(name);
		   System.out.println(name);
		   System.out.println(name);
		*/
	}

}
