package days28;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오후 4:38:11
 * @subject p915 직렬화(Serialization)
 * @content
 * 			객체를 통째로 파일 쓰기(저장)/읽기
 * 			객체를 통째로 네트워크롤 통해 송신(읽기)/수신(쓰기)
 * 			이걸 가능하게 해주는 것이 '직렬화'
 * 
 * 			1. 직렬화 : 객체 -> 데이터 스트림 변환하는 작업
 * 			2. 역직렬화 : 데이터 스트림  -> 객체 변환하는 작업
 */
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} // main

} // class

class Member {
	
	// field
	private String name;
	private int age;
	private boolean gender;
	private long type;
	
	// constructor
	public Member() { }

	public Member(String name, int age, boolean gender, long type) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public long getType() {
		return type;
	}

	public void setType(long type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", type=" + type + "]";
	}
	
} // Member class