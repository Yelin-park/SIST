package days16;

/**
 * @author Yelin
 * @date 2022. 3. 11. - 오후 2:27:05
 * @subject static 키워드 설명 p344
 * @content	정적 변수 == static 변수 == 클래스 변수 == 공유(shared) 변수
 * 			정적 메서드 == static 메서드
 * 			정적 클래스 == static 클래스 (중첩클래스)    ->  나중에 설명 해주실 예정
 * 
 * 			+ 변수 3가지 종류
 * 				1) 지역변수
 * 				2) 인스턴스 변수
 * 				3) 클래스 변수 -> 지금 배울 것
 * 
 * 			+ 메서드 2가지 종류
 * 				1) 인스턴스 메서드
 * 				2) 정적(static) 메서드
 * ----------------------------------------------------------------------------------------------------------
 * 			1. 제어자(modifier) - static 키워드
 * 
 * 			2. 클래스 앞에 선언 : public static calss Test{}
 * 			   변수 앞에 선언 	: public static int x;
 * 			   메서드 앞에 선언 : public static void disp(){}
 * 
 * 			3. static 사용할 수 있는 곳 : 멤버변수(필드), 메서드, 초기화 블럭(p302)
 * 
 */
public class Ex07 {

	public static void main(String[] args) {
		// 1. 저축과 관련된 클래스 선언 - Save
		//    객체의 구성요소 파악(속성, 기능) -> 목록 작성
		//      ㄴ속성 : 예금주, [저축종류], 잔고(금액), 이자율, 가입일 , 만기일 등등
		//      ㄴ기능 : 입금, 출금 등등
		
		/*
		// 객체 선언 및 생성 코딩
		Save p1 = new Save("박예린", 15000, 0.02);
		Save p2 = new Save("박단", 4000, 0.02);
		Save p3 = new Save("안시은", 50000, 0.02);
		Save p4 = new Save("백경환", 500, 0.02);
		Save p5 = new Save("함세강", 105000, 0.02);
		// 수십만명이 예금 가입했다면..?  동일한 값을 가지고 있는 double형의 rate가 수십만개 -> 메모리 낭비
		*/
		
		// Save name, money 인스턴스 변수는 반드시 객체 생성한 후에 [객체명.필드명] 으로 사용이 가능하다.
		// Save rate		클래스 변수는 객체 생성하기 전에도 [클래스명.필드명] 으로 사용이 가능하다.
		//					프로그램 시작하면 메모리가 잡힌다. 프로그램이 종료되면 제거된다.
		
		// 에러메시지 : The field Save.rate [is not visible]
		// 원인 : 메모리에는 잡혀져 있지만, private 접근지정자 때문에 접근(access)을 못함
		// Save.rate = 0.04;
		
		// 클래스명.정적메서드()  => 정적메서드 : static getter, setter
		Save.setRate(0.04);
		System.out.println(Save.getRate());
		
		// 객체 배열 초기화
		Save[] ps = {
				new Save("김혜수", 15000, 0.02), 
				new Save("손예진", 4000, 0.02),    
				new Save("안정환", 50000, 0.02),  
				new Save("백청강", 500, 0.02),  
				new Save("한예슬", 105000, 0.02) 
		};
		
		for (int i = 0; i < ps.length; i++) {
			ps[i].dispSave();
		}
		
		System.out.println(); // 개행
		
		// Save.setRate() 를 써도 되고~
		// 객체명.setRate() 를 써도 된다~ 
		// 공유변수라서 한 사람이 rate를 바꿔도 다 같이 바뀜
		ps[3].setRate(0.07);
		
		for (int i = 0; i < ps.length; i++) {
			ps[i].dispSave();
		}
		
	} // main

} // class
