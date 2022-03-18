package days21;

/**
 * @author Yelin
 * @date 2022. 3. 18. - 오후 12:10:10
 * @subject 
 * @content p489 StrictMath클래스 읽어보기
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// 올림, 내림, 반올림 ceil(), floor(), round()어디서 사용하냐?
		// 페이지를 클릭하면 페이지를 보이게 하는 것 -> 페이징 처리
		// 페이징 처리를 할 때 위의 메서드 사용
		// 한 페이지에 출력할 게시글 수 : 10개
		// 총 게시글 수 : 345개                           12개
		// 총 페이지 수는 ? 345/10 -> 34.5개 -> 35개       2개
		
		int 한_페이지에_출력할_게시글_수 = 10;
		int 총_게시글_수 = 345;
		int 총_페이지_수 = (int)Math.ceil( (double)총_게시글_수 / 한_페이지에_출력할_게시글_수);
		System.out.println(총_페이지_수);
		
		// p489 StrictMath클래스 읽어보기 - Math 클래스의 메서드와 똑같긴 함
		// Math 클래스의 메서드는 JVM에 설치된 OS(부동소수점 처리 방법이 다름)에 따라 다른 결과가 나온다. -> 성능 향상을 위해 사용
		// 성능 포기하더라도 OS 상관없이 동일한 결과를 얻기 위해서 새로운 Math 클래스를 만든 것이 StrictMath 클래스
		
	} // main

} // class
