package days15;

// package == default > 접근지정자 선택을 하니 접근지정자가 앞에 붙지않음

// private 를 붙이니 에러 메시지 발생
// 에러메시지 : Illegal modifier for the class Person; only public, abstract & final are permitted
// private class Person{

// default 패키지
class Person {

	// 속성(property) == 멤버변수 == 필드(field)
	String name;
	int age;
	
	// 기능(function) == 멤버함수 == 메서드(method)
	void walk() {
		System.out.printf("%s이 걷는다\n", name);
	}
	
	void run() {
		System.out.printf("%s이 뛴다\n", name);
	}
	
} // Person
