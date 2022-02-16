package days02;

/**
 * @author Yelin
 * @date 2022. 2. 16. - 오후 2:31:28
 * @subject 두 x,y 기억공간의 값을 교환하기
 * @content
 *          기억공간의 값을 교환하기 위해서는 임시기억공간이 필요하다.
 */
public class Ex08 {

	public static void main(String[] args) {
		// 두 x,y 기억공간의 값을 교환하기
		// 기억공간의 값을 교환하기 위해서는 임시기억공간이 필요하다
		// 정수를 저장할 x,y라는 변수를 선언하고 각각 10, 20으로 초기화하고
		// 출력형식 : x=10, y=20 출력하는 코딩을 하세요.
		// 조건) printf() 메소드를 사용하세요.
		
		int x = 10, y = 20;
		System.out.printf("x=%d, y=%d\n", x, y);

		// {} 안에 있어야 좋은 코딩, why? temp는 임시기억공간이라 한 번 쓰고 안쓸 것이라서 ***
		{		
			int temp = x; // 1번
			x = y; // 2번
			y = temp; // 3번
		}
		
		System.out.printf("x=%d, y=%d\n", x, y);
		
	}

}
