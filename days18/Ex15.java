package days18;

/**
 * @author Yelin
 * @date 2022. 3. 15. - 오후 4:35:36
 * @subject p388 예제7_25 인터페이스 다형성 설명하는 예제
 * @content
 */
public class Ex15 {

	public static void main(String[] args) {
		// 인터페이스 업캐스팅
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
		

	} // main

} // class

interface Parseable {
	// 구분 분석하는 메서드
	void parse(String fileName); // public abstract 생략가능
}

class XMLParser implements Parseable {

	@Override
	public void parse(String fileName) {
		System.out.println(fileName + "- XML parsing completed.");
	}
	
} // XMLParser

class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println(fileName + "- HTML parsing completed.");
	}
	
} // HTMLParser

// 인터페이스 업캐스팅
// Parseable p = new XMLParser();

class ParserManager {
	// 리턴타입이 parseable 인터페이스 -> 아직 배운적 없음
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser(); // 인터페이스 업캐스팅
		} else {
			Parseable p = new HTMLParser();
			return p;
			// return new HTMLparser();
		}
		
	} // Parseable getParser
} // ParserManager
