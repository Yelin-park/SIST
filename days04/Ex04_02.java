package days04;

/**
 * @author Yelin
 * @date 2022. 2. 18. - 오후 12:29:41
 * @subject 전/후위형 증감연산자 설명
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		int x = 10;
		
		// int y = ++x; // x=11, y=11
		int y = x++;  // x=11, y=10
		// 연산자 우선순위상 증감연산자가 먼저인데 후위형(x++)이라 증감연산자 순서를 뒤로 보내주고 대입연산자 먼저 실행
		
		System.out.printf("x=%d, y=%d\n", x, y);

		// 완전히 다른 값임
		// while(x++ < 10){
		// while(++x < 10){
	}

}
