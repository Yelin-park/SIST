package days02;

/**
 * @author Yelin
 * @date 2022. 2. 16. - 오전 11:26:34
 * @subject 표준 출력 함수 설명
 * @content 
 *          System.out.print();
 *          System.out.println();
 *          System.out.printf();
 *          
 *          개행하는 방법(코딩) 3가지
 * 
 */

public class Ex04_02 {
	/*
	public static void main(String[] args) {
		
		// 복사 단축키 : Ctrl + Alt + 방향키
		/*
		System.out.println("김기태");
		System.out.println("이창익");
		System.out.println("황다솜");
		김기태
		이창익
		황다솜
		
		// 세로로 선택하는 단축키 : Alt + Shift + A
		System.out.print("김기태");
		System.out.println(); // 개행 코딩 1
		
		// 자바에서 한 문자를 나타날 때는 'A' (앞 뒤에 '을 붙이기)
		// '\n' : 제어문자 == 특수문자 == escape문자
		System.out.print("이창익" + '\n'); // 개행 코딩 2
		System.out.print("황\n다솜");
		// 김기태이창익황다솜
		
		// println() 와 print() 메소드의 차이점 > 줄바꿈코딩(개행)
		// println()은 print() + 줄바꿈코딩(개행)
		
		
	} // main 닫기
	*/
	
	
	public static void main(String[] args) {
		String name;
		int age;
		
		name = "박예린";
		age = 20;
		
		// 출력형식 : 이름은 "홍길동"이고, 나이는 '20'살입니다.
		// System.out.println("이름은 \""+ name + "\"이고, 나이는 \'" + age + "\'살입니다.");
		
		// printf() 함수 3가지
		// 1. 기능 : 편리하게 출력형식 문자열을 지정해서 출력하는 메소드
		// 2. 매개변수 : String format, Object... args
		//               System.out.printlnf("출력형식", name);
		// Java API Doc > java.lang 패키지 선택 > system 클래스 선택 > [PrintStream] out 클릭 > printf() 2개
		// 문자열 출력 서식 : %s > String
		// 정수 출력 서식 : %d > int
		// 문자 출력 서식 : %c > char
		
		// 학점 'A' 'B' 'C' 'D' 'F'
		// 학점 저장할 변수 선언
		char grade = 'A';
		
		System.out.printf("이름은 \"%s\"이고, 나이는 '%d'살이고, 학점은 '%c'입니다.", name, age, grade);
		

	} // main 닫기
	
	
} // class 닫기
