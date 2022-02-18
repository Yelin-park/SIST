package days04;

/**
 * @author Yelin
 * @date 2022. 2. 18. - 오후 12:39:15
 * @subject 증감연산자 예제
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// 어떤 기억공간의 값을 n 증가/감소 시키는 코딩을 하세요.
		int n = 100;
		int x = 10;
		
		x = x + n; // n증가
		x = x - n; // n감소
		
		// 복합 대입연산자로 수정
		x += n;   // x = x + n; 
		x -= n;   // x = x - n;

		x = x * 100;
		x *= 100;
		
		x = x / 2;
		x /= 2;
		
		// x 값을 1증가 하는 코딩을 모두 하세요
		x = x + 1;
		x += 1;
		x++;
		++x;
	}

}
