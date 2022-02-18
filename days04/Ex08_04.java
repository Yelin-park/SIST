package days04;

import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 2. 18. - 오후 3:39:04
 * @subject
 * @content
 */
public class Ex08_04 {

	public static void main(String[] args) {
		// Java API Doc 의 Scanner 예제
	     String input = "1 fish 2 fish red      fish blue fish";
	     // input에 있는 문자열을 스캔하는 객체s를 만들었다.
	     // \\s   -> space(공백)
	     // *     -> 반복 회수  0~여러번
	     // fish
	     // useDelimiter("\\s*fish\\s*");   =>
	     Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*"); // > Scanner sc = new Scanner(System.in); + sc.useDelimiter(pattern);
	     
	     System.out.println(s.nextInt()); // 1
	     System.out.println(s.nextInt()); // 2
	     System.out.println(s.next());  // red
	     System.out.println(s.next()); // blue
	     s.close();

	}

}
