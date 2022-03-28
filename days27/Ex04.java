package days27;

import java.util.Scanner;

/**
 * 
 * 미리 의미가 부여되어 있는 정의가 되어있는 @태그를 사용해서 -> javadoc.exe 설명 파일을 HTML 생성할 때 사용
 * 
 * @author 야리니
 * @date 2022. 3. 28. - 오전 10:52:26
 * @subject p702 애너테이션(annotation) == 어노테이션
 * @content p695 열거형에 멤버 추가하기 (정독)
 * 			javadoc.exe로 인헤 소스코드의 주석처리(/**)로 HTML 설명 파일 생성할 수 있다.
 * 
 * 			1. 어노테이션이란? 프로그램의 소스 코드 안에 "다른 프로그램"을 위한 정보를 미리 약속된 형식으로 포함시키기 위한 것, 알려주기 위한 것
 * 			2. 사전적 의미? 주석, 메모
 */
@Deprecated
public class Ex04 {
	
	// 디폴트 생성자
	@Deprecated
	Ex04(){	}
	
	// 앞으로 사용하지 않을 것을 권장하는 대상에게 붙임
	@Deprecated
	int getXXX() {
		return 100;
	}

	// 컴파일러한테 특정 경고 메시지가 나타나지 않게 해준다.
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 한 줄 주석처리
		
		/*
		 * 여러 줄 블럭 주석 처리
		 */
		
		/** 
		 * 주석처리 - 소스코딩에 대한 설명하는 주석처리
		 */

		// The value of the local variable sc is not used -> 사용을 안하고있다.
		// Resource leak: 'sc' is never closed -> 사용했으면 닫아야한다. 리소스 손실난다 -> 특정 경고 메시지
		
		// @SuppressWarnings("resource") // 컴파일러한테 특정 경고 메시지가 나타나지 않게 해준다.
		Scanner sc = new Scanner(System.in);
		sc.next();
		// sc.close();
		
	} // main

	// @Override : 어노테이션
	// 다른 프로그램(컴파일러)에게 오버라이딩 되었음을 알려주는 역할
	@Override
	// public String toString(int i) { // 오버라이딩 메서드에 매개변수를 주면 에러메시지를 띄움
    public String toString() {
		return super.toString();
	}

} // class
