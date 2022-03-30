package days29;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Yelin
 * @date 2022. 3. 30. - 오전 9:06:03
 * @subject p934 직렬화(Serialization)
 * @content 	
 * 				1. ObjectInputStream과 ObjectOutputStream 스트림 클래스 사용하여 직렬화해보기!
 * 
 * 				2. 직렬화 가능한 클래스로 만들기 위해서는 Serializable 인터페이스를 구현해야된다. (implements Serializable)
 * 					1) [파일 -> 객체 -> 스트림 : 직렬화]
 * 					2) [파일 -> 스트림 -> 객체 변환 : 역직렬화]
 * 
 * 					- Externalizable 인터페이스 구현 후 writeExternal()와 readExternal() 메서드 직접 구현하면 이것도 가능
 * 
 * 				3. transient 제어자
 * 					- 직렬화 대상에서 제외시키는 제어자
 * 
 */
public class Ex01_03 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days29\\member.dat";
		Member m1 = new Member("야리니", 20, false, 2);

		// [파일 -> 객체 -> 스트림 : 직렬화]
		// m1 객체를 직렬화해서 파일로 저장
		// ObjectOutputStream : 보조스트림
		// FileOutputStream : 바이트 스트림
		
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			// 애러메시지 : java.io.NotSerializableException: days29.Member
			// 해석 : 직렬화를 할 수 없는 클래스다.
			// 해결 : 직렬화를 하려고하는 클래스를 Serializable 인터페이스를 구현해주면 된다. (implements Serializable)
			oos.writeObject(m1); // writeObject(객체) 메서드로 쓰기, 저장, 전송 작업이 되어진다.
			
		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
		
		// [파일 -> 스트림 -> 객체 변환 : 역직렬화]
		try(FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			Member m = (Member) ois.readObject(); // 다운캐스팅 작업 필요
			System.out.println(m); // type 필드는 직렬화 대상에서 제외되었기에 0(기본값)
			
		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
		System.out.println("END");
		
	} // main

} // class

// Externalizable 인터페이스를 구현해서
// writeExternal() 직접 구현
// readExternal() 직접 구현
class Person implements Externalizable{
	
	String name;
	int age;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	
	
} // Person

// [직렬화가 가능한 클래스 선언]
// 1. implements Serializable : 빈 인터페이스
class Member implements Serializable{
	// 시리얼 버전 UID
	private static final long serialVersionUID = 2336313051081995427L;
	
	// field
	private String name;
	private int age;
	private boolean gender;
	private transient long type; // 직렬화 제외(객체 -> 스트림)
	
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
		return String.format("%s,%d,%b,%d", name, age, gender, type);
	}
	
} // Member class