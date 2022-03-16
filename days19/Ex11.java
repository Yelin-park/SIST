package days19;

/**
 * @author Yelin
 * @date 2022. 3. 16. - 오후 2:38:59
 * @subject p423 
 * @content 다중 catch문 ? catch문을 여러개 쓰는거
 * 			멀티 catch문 ?
 */
public class Ex11 {

	public static void main(String[] args) {
		int[] m =new int[3];
		
		// 멀티 catch문 : JDK 1.7부터~
		// [주의할점] : 부모예외클래스 | 자식예외클래스 -> 에러 발생
		try {
			m[0] = 1;
			m[100] = 20; 		  // ArrayIndexOutOfBoundsException
			int result = 100 / 0; // java.lang.ArithmeticException: / by zero
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {  // | 기호로(or 연산자 x) 사용한 것 -> 멀티 catch문
			// instanceof 연산자를 사용해서 어떤 예외인지 확인이 가능하다.
			// if(e instanceof ArrayIndexOutOfBoundsException) 
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("그 외의 에외가 발생했다.");
		}
		
		
		int[] n =new int[3];
		// 다중 catch문 
		try {
			n[0] = 1;
			n[100] = 20; 		  // ArrayIndexOutOfBoundsException
			int result = 100 / 0; // java.lang.ArithmeticException: / by zero
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 벗어났다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다.");
		} catch (Exception e) {
			System.out.println("그 외의 예외가 발생했다.");
		}
		

	} // main

} // class
