package days29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Yelin
 * @date 2022. 3. 30. - 오전 9:06:03
 * @subject p934 직렬화(Serialization) 객체 -> 스트림 변환 why? 자바 입출력
 * @content 		ㄴ 객체 단위로 입출력을 하기 위해서 직렬화를 한다.
 * 					ㄴ 데이터 전송 -> 직렬화(객체~스트림 변환) -> 역직렬화(스트림 ~ 객체 변환)
 * 
 * 				한 멤버의 정보를 네트워크 전송 / 파일 저장 -> 아래 코딩은 파일 저장 작업만 할거고, 네트워크 전송은 네트워크 파트를 배운 후에!
 */
public class Ex01_02 {

	public static void main(String[] args) {
		/*
		Member m1 = new Member("야리니", 20, false, 2);
		
		String fileName = ".\\src\\days29\\member.txt";
		
		// 멤버 정보를 파일에 저장하는 메서드 호출
		// m1.writeExternal(fileName);
		
		// 파일로부터 멤버 정보를 읽어오는 메서드 호출
		Member m = m1.readExternal(fileName);
		System.out.println(m);
		
		System.out.println("END");
		
		// 위의 코딩과 같이 객체를 직렬화하고 역직렬화하는 방법 몰라도 된다.
		// why? ObjectInputStream과 ObjectOutputStream 스트림 클래스 존재, 사용 방법 숙지
		*/

	} // main

} // class
/*
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
		return String.format("%s,%d,%b,%d", name, age, gender, type);
	}
	
	// 멤버 객체를 파일에 저장하는 메서드
	public void writeExternal(String fileName) {
		try(FileWriter fw = new FileWriter(fileName); BufferedWriter bw = new BufferedWriter(fw);) {
			
			bw.write(this.name + "\n");
			bw.write(this.age + "\n");
			bw.write(this.gender + "\n");
			bw.write(this.type + "\n");
			
			System.out.println("> 멤버 객체 저장 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}// writeExternal
	
	// 파일을 읽어와서 멤버 객체를 반환하는 메서드
	public Member readExternal(String fileName) {
		Member m = null;
		try(FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr); ) {

			String name = br.readLine();
			int age = Integer.parseInt(br.readLine());
			boolean gender = Boolean.parseBoolean(br.readLine());
			long type = Long.parseLong(br.readLine());
				
			m = new Member(name, age, gender, type);
			return m;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null; // return m; 같은 코딩
		} // try
		
	} // readExternal
	
} // Member class
*/