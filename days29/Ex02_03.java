package days29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Yelin
 * @date 2022. 3. 30. - 오전 10:31:58
 * @subject 
 * @content
 * 			[직렬화 정리]
 * 			- 직렬화 개념 ? 객체 -> 스트림 변환			/ 스트림 ? 자바 입출력 하는 단위
 * 			- 역직렬화 개념 ? 스트림 -> 객체 변환
 * 
 * 			- 왜 직렬화를 하는가? 	데이터를 이름, 나이 등 하나 하나를 전송/저장 하는 것보다는..
 * 								클래스를 만들어서 [객체] 하나를 스트림을 통해서 전송/저장 하는 것이 낫다. == 편리하다.
 * 								네트워크로 객체 전송, 파일을 전송하기 위해서 직렬화를 한다.
 * 
 * 			- Member 클래스 이름, 나이, 성별, 타입의 필드를 파일로 저장
 * 				아래와 같이 이렇게 구현했었는데.. ObjectOutputStream 보조스트림을 사용하면 객체 -> 스트림 변환 후 파일로 저장/네트워크 전송을 해준다
 * 				writeExternal() {
 * 					fos
 * 					bos
 * 					bos.write(이름) -> 저장하는 작업
 * 					bos.write(나이) -> 저장하는 작업
 * 				}
 * 
 * 				FileOutputStream fos
 * 				ObjectOutputStream 보조스트림 = new (fos); 
 * 
 * 				oos.writeObject(new Member());  -> 직렬화가 불가능하다는 에러가 떠서 Member 클래스를 Serializable 인터페이스로 구현!
 * 
 * 				Member m = (Member) ois.readObject(); -> 스트림을 객체로 변환(역직렬화), 다운캐스팅 필요
 * 
 * 				P 부모클래스 직렬화하면 자식클래스가 직렬화 인터페이스를 구현하지 않아도 직렬화 가능
 * 				P 부모클래스 직렬화 안하면 자식클래스 필드만 직렬화 가능
 * 					-> 부모클래스의 필드를 직렬화 하고싶으면 메서드를 직접 구현해야됨(writeObject(), readObject() )
 * 
 */
public class Ex02_03 {

	public static void main(String[] args) throws IOException {
		// 1. 부모가 직렬화가 가능한 클래스로 선언이 되면, 자식은 자동으로 직렬화가 가능한 클래스가 된다.
		// 2. 부모의 멤버는 직렬화 대상에서 제외가 되고, 자식 멤버만 직렬화가 가능하다.
		// 3. 직렬화 대상에 제외된 부모의 멤버도 직렬화 포함 시키고 싶다면... -> 직접 메서드를 구현해야 한다.
		
		try(FileOutputStream fos = new FileOutputStream(".\\src\\days29\\child.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos); ) {
			
			Child c = new Child();
			c.name = "홍길동";
			c.age = 20;
			
			oos.writeObject(c); // 객체를 직렬화 시켜서 파일 저장(쓰기)
			
		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
		System.out.println("> 엔터 치면 계속합니다");
		System.in.read();
		System.in.skip(System.in.available());
		
		try(FileInputStream fis = new FileInputStream(".\\src\\days29\\child.dat");
				ObjectInputStream oos = new ObjectInputStream(fis); ) {
				
				Child c = (Child) oos.readObject();
				System.out.println(c.name); // name이 출력되면 직렬화 대상에 포함된 것을 확인할 수 있음
				System.out.println(c.age);
				
			} catch (Exception e) {
				e.printStackTrace();
			} // try
		
		System.out.println("END");

	} // main

} // class

// 직렬화가 불가능한 클래스
class Parent {
	public String name;
}

// 직렬화 가능한 클래스
class Child extends Parent implements Serializable{ 

	private static final long serialVersionUID = -1937494941033300428L;
	
	public int age;
	
	// oos.writrObject(c) -> c가 out이 되어서... 
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.writeUTF(name); // 부모의 직렬화 제외된 필드를 추가한 것
		out.defaultWriteObject(); // child 필드 - age
	} // writeObject
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		name = in.readUTF();
		in.defaultReadObject(); // child 필드 - age
	} // readObject
	
} // Child