package days20;
 
// import java.lang.*; // imprort 하지 않아도 자동으로 처리되어있어 lang 패키지 안에 있는 클래스들 사용 가능

/**
 * @author Yelin
 * @date 2022. 3. 17. - 오전 9:35:59
 * @subject p450 java.lang패키지와 유용한 클래스
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// 모든 클래스의 최상위 부모클래스는 Object 클래스이다.
		// Object 클래스 멤버(필드, 메서드)는 어떤 것들이 있는지 파악 -> 오버라이딩 사용
		
		// 1. [Object.hashCode() 메서드] - 객체 자신의 [해시코드]를 반환 (인스턴스가 생성될 때 마다 인스턴스 자신의 해시코드 값 반환)
		/*
		// 해시코드 값으로 같은 객체인지 아닌지 판별 가능
		Value v1 = new Value();
		int hashCode = v1.hashCode();	// 객체 자신의 해시코드를 반환(인스턴스가 생성될 때 마다 인스턴스 자신의 해시코드 값 반환)
		System.out.println(hashCode);   // 366712642 
		
		Value v2 = new Value();
		hashCode = v2.hashCode();		// 객체 자신의 해시코드를 반환(인스턴스가 생성될 때 마다 인스턴스 자신의 해시코드 값 반환)
		System.out.println(hashCode);   // 1829164700
		*/
		
		// 2. [Object.toString() 메서드] - 객체 자신의 [정보를 문자열]로 반환하는 메서드
		/*
		Value v1 = new Value();
		String objectInfo = v1.toString(); // "days20.Value@15db9742"
		System.out.println(objectInfo);    // "days20.Value@15db9742"
		System.out.println(v1.toString()); // "days20.Value@15db9742"
		System.out.println(v1);  		   // v1이라는 객체를 출력하겠다 == to.String() 메서드가 생략된 것 // "days20.Value@15db9742"
		// syso 안에 있는 코딩은 다 같은 의미의 코딩
		*/
		
		/*
		// MyPoint 클래스 선언(days16.MyPoint 복사) + days17.Employee에 toString() 오버라이딩 함
		MyPoint p1 = new MyPoint(10, 20);
		// p1.dispPoint();  				// > x = 10, y = 20 -> 이렇게 disp() 메서드 선언하지 말고 toString 오버라이딩하기
		System.out.println(p1.toString());  // 메서드 오버라이딩 전 : days20.MyPoint@15db9742 -> 오버라이딩 후 : 	> x = 10, y = 20
		System.out.println(p1); 			// > x = 10, y = 20
		*/
		// days20.MyPoint@15db9742
		// > 패키지명.클래스명@16진수값hashCode
		// > fullName@16진수형태의 해시코드값
		
		// 3. [Object.getClass() 메서드] - 객체의 클래스 정보를 담고 있는 Class 인스턴스를 반환하는 메서드
		/*
		Value v1 = new Value();
		// Class<? extends Number> 제네릭(지네릭스) 의미 이해 필요 -> 제네릭 수업 배울 때 상세히 배울 예정
		// 클래스이름 == Class
		Class cls = v1.getClass();
		System.out.println(v1);             // days20.Value@15db9742
		System.out.println(cls.getName());  // days20.Value  == fullName
		System.out.println(Integer.toHexString(v1.hashCode())); // 15db9742
		
		String infor = String.format("%s@%s", cls.getName(), Integer.toHexString(v1.hashCode()));
		System.out.println(infor);  // days20.Value@15db9742
		*/
		
		// *. [스레드와 관련된 메서드] - 스레드 수업 후 다시 배울 예정
		/*
		Object.notify();
		Object.notifyAll();
		Object.wait();
		*/
		
		// 4. [Object.equals() 메서드] - 같은 객체인지를 체크해서 true/false 반환하는 메서드
		
		int a = 10, b = 20;
		// System.out.println(a == b);  // false
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		// Value v2 = v1;	// 클래스 복사 -> 복사를 하면 결과값이 다 true로 바뀜
		System.out.println(v1 == v2); 						   // 객체 비교 false
		// System.out.println(v1.toString() == v2.toString()); // 위의 코딩과 같은 것
		// 0x100번지와 0x200번지가 같니? 라고 물어보는 코딩
		
		/*
		0x100
		[10]					[0x100] v1
				
		0x200
		[10]					[0x200] v2
		*/
		
		// 					0x100 == 0x200
		System.out.println(v1.equals(v2)); // false  -> 오버라이딩 후 true
		// ***** 재정의하지 않은 Object의 equals() 메서드는 ==연산자와 동일하다. ***** 
		// Value 클래스의 equals() 메서드를 재정의헤서 value 필드의 값만 같으면 동일하다고 코딩~
		
		// v1.equals(new MyPoint()); // 매개변수가 Object obj라서 담길 수 있음 -> 메서드에 체크해주는 코딩하기
		System.out.println(v1.equals(new MyPoint())); // false
		
		
	} // main

} // class

class Value{ // extends Object 생략 되어져있다.
	// hashCode() 설명 시 -> 멤버 선언 X, 생성자가 중복선언되지 않은 경우에는 컴파일러가 디폴트 생성자를 자동으로 추가
	
	// 4번 Object.equals() 메서드 설명할 때 추가함
	int value;
	
	Value() {	}
	
	Value(int value) {
		this.value = value;
	}

	// 4번 Object.equals() 메서드 설명할 때 추가함 -> Object.equals() 메서드 오버라이딩
	@Override
	public boolean equals(Object obj) { // Object obj : 인터페이스 매개변수 다형성
		Value v = null;
		if(obj instanceof Value) {
			// v = (Value)obj; // 다운캐스팅
			// if(this.value == v.value) return true;
			return this.value == ((Value)obj).value;  // 위의 두줄코딩을 한 줄 코딩
		}
		return false;
	} // equals
	
} // Value class



/*
 * 1.  인터페이스 장점 4가지를 적고 설명하세요.
 *    ㄱ. 개발 시간 단축 -> 인터페이스를 선언만 하고 구현하지 않아도 프로그램을 작성하고 인터페이스를 구현하는 클래스를 만드는 동시 개발 가능
 *    ㄴ. 표준화 가능 -> 인터페이스를 구현함으로써 일관되고 정형화 가능
 *    ㄷ. 서로 관계없는 클래스들을 관계를 맺어준다 -> 인터페이스를 통해서 서로 관계가 없는 클래스들의 관계를 맺어준다. 호환이 가능
 *    ㄹ. 독립적인 프로그래밍가능 -> 클래스 내용을 변경하더라도 다른 클래스에 영향을 미치지 않는다
 *    
 * 2. 인터페이스의 멤버 4가지 설명하세요.
 *    ㄱ. 상수 : 인터페이스는 100% 상수로 이루어짐
 *    ㄴ. 추상화메서드 : 인터페이스는 100% 추상화메서드로 이루어짐
 *    ㄷ. 디폴트메서드 : JDK 1.8부터 디폴트메서드 사용가능 -> 인터페이스에 새로운 메서드를 추가하면 그 인테페이스로 구현한 클래스를 다 재정의해야되는 문제
 *    					-> 디폴트메서드를 추가하면 필요한 클래스만 오버라이딩 하면됨
 *    ㄹ. static메서드 : static 메서드를 가지려면 별도의 클래스를 구현해야하는데 static 메서드를 인터페이스 안에 선언할 수 있게됨으로 클래스를 별도로 구현하지 X
 *    
 *  3. 익명 클래스 설명
 *  	생성과 선언을 동시에하고 이름이 없는 일회성(객체를 1번만 생성) 클래스이다.
 *  
 *  4. Frame을 상속받아서 MyFrorm 클래스를 만들고
 *      닫기 버튼을 클릭시 익명 클래스(어댑터)를 사용하여 프로그램 종료 기능 구현하고,
 *      버튼을 추가해서 버튼을 클릭할 때 "클릭됨" 메시지를 출력하도록 구현하세요.
 *      
 *  5. 자바에서 오류 / 에러 / 예외 에 대해서 설명하세요
 *  오류(==에러)로 프로그램 오작동 또는 비정상적으로 종료되는 원인
 *  	1) 컴파일 오류 : 컴파일시 발생하는 오류
 *  	2) 런타임(실행) 오류 : 실행시 발생하는 오류
 *  		ㄱ. 에러(error) : 메모리 부족, 스택오버플로워 복구할 수 없는 심각한 오류
 *  		ㄴ. 예외(exception) : 수습이 되는 비교적 덜 심각한 오류
 *  	3) 논리적 오류 : 실행은 되지만, 의도와 다르게 동작하는 것
 *  
 *  6. checked 예외와 unchecked 예외에 대해서 설명하세요.
 *    ㄱ. unchecked예외 -> 컴파일러가 예외처리 확인을 하지 않는 것, RuntimeException 클래스
 *    ㄴ. checked예외 -> 컴파일러가 예외처리 확인을 하지 않는 것, timeException 클래스
 *    
 *  7. 예외 처리 2가지 방법 설명하세요
 *   1) try-catch 문
 *   2) throws 메서드에 예외 선언하기
 *    
 *  8. try-with-resources 문에 대해서 설명하세요.
 *  	자원 자동 반환 문으로 JDK 1.7부터 사용 가능
 *  	try(Scanner sc = new Scanner(System.in);) { 이렇게 선언하면 자동으로 리소스를 반환해줌
 *  
 *  9. 예외 강제 발생에 대해서 설명하세요 
 *  	강제로 사용자가 예외를 발생시키는 것
 *  	new 예외객체생성
 *  	throw 예외객체
 *  
 *  10. 다중 catch 문과 멀티 catch 문에 대해서 설명하세요 . 
 *  	다중 catch문은 catch문을 여러 개 사용하는 것이고
 *  	멀티 catch문은 catch(예외 | 예외) | 기호로 여러 개를 선언하는 것
 *  
 *  11. finally 블럭에 대해서 설명하세요 
 *  	예외 발생 여부와 상관없이 무조건 실행되는 블럭으로 try-catch-[finally] 순이다.
 *  	리턴 값이 있으면 리턴값을 가지고 finally 블럭을 무조건 실행한다.
 *  
 *  12. try-with-resource 문을 사용해서 파일을 읽어서 라인번호를 붙여서 출력하는 코딩을 하세요.
 *  	String fileName = "C://temp//test.txt";
		int lineNum = 1;
		String line = "";
		
		try(FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr);) {
			while((line = br.readLine()) != null ) {
				System.out.printf("%d : %s\n", lineNum++, line);
			}
			br.readLine();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("그 외 예외");
			e1.printStackTrace();
		}
 *  
 *  13. 임의의 사용자 정의 예외 클래스를 구현하세요 .    
 *  	왜? 국어 점수가 0~100이 아니라면 getScor() 메서드에서 예외 발생
 *  	ScoreOutOfBoundException extends Exception{
 *  	}
 *         
 * */