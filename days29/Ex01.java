package days29;

import java.io.BufferedReader;
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
public class Ex01 {

	public static void main(String[] args) {
		Member m1 = new Member("야리니", 20, false, 2);
		
		String fileName = ".\\src\\days29\\member.txt";
		
		/*
		// 멤버 정보를 파일에 저장하는 코딩..
		try(FileWriter fw = new FileWriter(fileName )) {
			
			fw.write(m1.toString());
			fw.flush(); // 파일은 저장, 네트워크이었다면 전송
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		// 멤버 정보가 저장된 파일을 읽기
		try(FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr); ) {
			
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				// String line -> Member m 객체 변환
				String[] data = line.split(",");
				String name = data[0];
				int age = Integer.parseInt(data[1]);
				boolean gender = Boolean.parseBoolean(data[2]);
				long type = Long.parseLong(data[3]);
				
				Member m = new Member(name, age, gender, type);
			} // while
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("END");
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
	
} // Member class
*/