package days07;

/**
 * @author Yelin
 * @date 2022. 2. 23. - 오전 10:47:44
 * @subject 제어문 활용 예제 - 7명 풀었음
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// 세 정수를 임의의 수(난수)으로 초기화해서 Math.random()  10~50정수  =>  -10하면 0~40정수 만들고 +10 하기
		// 그 세 정수 중에 가장 큰 값과 가장 작은 값을 출력하세요.
		
		// [문제풀이]
		// 1. 세 정수를 받을 3개의 변수
		int x, y, z;
		
		// 2. Math.random()메서드로 변수 값 초기화
		// 		0.0 * 41 <= double형 Math.random() * 41 < 1.0 * 41
		// 		0.0 <= double형 Math.random() * 41 < 41.0
		// 		0.0 <= (int)(Math.random() * 41) < 41.0
		// 		0 + 10 <= (int)(Math.random() * 41) + 10 <= 40 + 10
		// 		10 <= (int)(Math.random() * 41) + 10 <= 50
		x =(int)(Math.random() * 41) + 10;
		y =(int)(Math.random() * 41) + 10;
		z =(int)(Math.random() * 41) + 10;
		System.out.printf("x=%d, y=%d, z=%d\n", x, y, z);
		
		// 3. 세 정수 중에 가장 큰 값을 찾기
		//   1) 두 정수를 먼저 비교해서 큰값찾기
		//   2) 큰값과 남은 정수를 비교해서 가장 큰값찾기
		
		// 3번 풀이 -3) 삼항연산자 사용   > 가독성때문에 () 사용
		int max = x > y ? (x > z ? x : z) : (y > z ? y : z);
		int min = x > y ? (y > z ? z : y) : (x > z ? z : x);
				
		/*
		// * 3번 풀이 -2) if else문과 동일한 로직으로 처리한 코딩
		int max, min;
		if(x > y)	 max = x;
		else	     max = y;
		if(max < z)  max = z;  // max > z => max = max; 코딩 삭제하고 조건수식을 반대로 바꿈
		System.out.println("최대값: " + max);
		*/
		
		/*
		//  * 3번 풀이 -1) if else문으로 큰 값을 찾는 로직 이해하기
		if(x > y) { // x     > 1번 비교
			if(x > z) { // x  > 1번 비교 후 true이면 실행
				System.out.println("최대값: " + x);
			} else { // z
				System.out.println("최대값: " + z);
			}
		} else { // y     >  2번 비교
			if(y > z) { // y  > 2번 비교 후 true이면 실행
				System.out.println("최대값: " + y);
			} else { // z
				System.out.println("최대값: " + z);
			}
		}
		
		if(x > y) { 
			if(y > z) { 
				System.out.println("최소값: " + z);
			} else { 
				System.out.println("최소값: " + y);
			}
		} else { 
			if(y > z) { 
				System.out.println("최소값: " + z);
			} else { 
				System.out.println("최소값: " + y);
			}
		}
		*/

				
		
		
		
		
		
	} // main

} // calss
