package days16;

public class Ex10_02 {
		
		// 클래스 초기화 1번
		static {
			System.out.println("static{}");
		}
		
		// 인스턴스 초기화 블럭 3번
		{
			System.out.println("{}");
		}
		
		// 디폴트 생성자 초기화 4번
		Ex10_02(){
			System.out.println("디폴트 생성자");
		}

		public static void main(String[] args) {
			// 명시적 초기화 2번
			System.out.println("1..........");
			Ex10_02 obj = new Ex10_02();
			
			System.out.println("2..........");
			Ex10_02 obj2 = new Ex10_02();
			
		} // main

} // class

