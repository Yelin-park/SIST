package days16;

/**
 * @author Yelin
 * @date 2022. 3. 11. - 오후 4:47:06
 * @subject p307 초기화 예제6-30
 * @content p306 예제 꼭 해보기!
 */
public class Ex10_03 {

	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document();
		Document d3 = new Document("자바문서.txt");
		Document d4 = new Document();

	} // main

} // class

class Document{
	
	static int count; 	// 공유변수
	static int no;
	String fileName; 			// 인스턴스변수
	
	/*
	// 아래 코딩을 하면 어떤 생성자로도 객체를 생성하면 count가 증가
	{
		++count;
	}
	*/
	
	// 디폴트 생성자
	public Document() {
		this("제목없음 -" + ++count); // 디폴트 생성자로만 객체를 생성할 때 count 증가
	}
	
	public Document(String fileName) {
		this.fileName = fileName;
		System.out.printf("문서 \"%s\"가 생성되었습니다.\n", this.fileName);
	}
	
} // Document class