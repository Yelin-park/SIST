package days21;

/**
 * @author Yelin
 * @date 2022. 3. 18. - 오전 9:44:51
 * @subject p476 StringBuffer 클래스와 StringBuilder 클래스
 * @content 아래 로직들 String 클래스 메서드 사용을 안하는게 좋음 로직만 그냥 알고있어라
 */
public class Ex01 {
	
	public static void main(String[] args) {
		String str1 ="안녕하세요.홍길동입니다.";
		// String 클래스 선언 X -> Ex02
		// str1 문자열을 자주 변경할 일이 있다고 가정 - 추가, 삭제, 수정
		// 1. 안녕 문자열 뒤에 (Hello) 문자열을 삽입(insert) -> "안녕(Hello)하세요.홍길동입니다."
		//		ㄱ. 안녕 위치 찾아야됨 -> indexOf(), lastIndexOf()
		/*
		int findIndex = str1.indexOf("안녕");
		int index = findIndex + "안녕".length();
		String before = str1.substring(0, index);
		String after = str1.substring(index);
		str1 = before + "(Hello)" + after;
		System.out.println(str1);
		*/
		
		// 2. 홍길동을 찾아서 "야리니"으로 수정
		/*
		int findIndex = str1.indexOf("홍길동");
		int index = findIndex + "홍길동".length();
		String before = str1.substring(0, findIndex);
		String after = str1.substring(index);
		str1 = before + "야리니" + after;
		System.out.println(str1);
		*/
		
		/*
		// str1.replace("홍길동", "야리니"); -> str1 변수에 담지 않으면 str1 값은 바뀌지 않음
		str1 = str1.replace("홍길동", "야리니"); // replaceAll(정규표현식, 바꿀문자열), replaceFirst(정규표현식, 바꿀문자열)
		System.out.println(str1);
		*/
		
		// 3. 홍길동을 찾아서 삭제 - "안녕하세요.입니다."
		
		int findIndex = str1.indexOf("홍길동");
		int index = findIndex + "홍길동".length();
		String before = str1.substring(0, findIndex);
		String after = str1.substring(index);
		str1 = before + after;
		System.out.println(str1);
		
		str1 = str1.replace("홍길동", "");
		System.out.println(str1);
		
		
	} // main


} // class

/*
 * 1. String path = "C:\\SS16Class5\\JavaClass\\javaPro\\src\\days20\\SS16교육생명단.txt";
 *    위의 절대경로에서 파일명만  String fileName 변수에 저장하고
 *    파일명의 확장자만  String extender 변수에 저장하세요.
 *    
 * 2. 객체로 부터 Class 객체를 얻어오는 3가지 방법에 대해서 설명하세요 . 
 *   ㄱ. getClass()
 *   ㄴ. 클래스명.class
 *   ㄷ. Class.forName("패키지명.클래스명")
 *   
 * 3. 얕은복제, 깊은 복제에 대해 설명하세요 
 * 		얕은 복제 : 같은 인스턴스 주소를 가르키는 것 원본에 영향을 미침 
 * 		깊은 복제 : 인스턴스에 있는 값만 복사하여 전혀 다른 인스턴스 주소를 가르키는 것
 * 
 * 4.   String 클래스의 메서드 설명
  ㄱ. length() : 문자열의 길이를 반환  
  ㄴ. charAt() : 해당하는 index 위치에 있는 문자를 반환
  ㄷ. compareTo() : 값이 같은지 다른지 숫자로 표현, 음수,양수로나오고 0이나오면 같음
  ㄹ. equals() / equalsIgnoreCase() : 문자열이 같은지, 대소문자 구분없이 확인하여 반환
  ㅁ. concat() : 문자열을 합쳐주는 메서드
  ㅅ. startsWith() : 문자열이 원하는 문자열로 시작하는지 확인해 주는 메서드 
  ㅇ. endWith()    : 문자열이 원하는 문자열로 끝나는지 확인해 주는 메서드
  ㅈ. indexOf()     : 문자열 중 원하는 문자열이 앞에서부터 찾아서 위치하는 인덱스 값을 반환
      lastIndexOf() : 문자열 중 원하는 문자열이 뒤에서부터 찾아서 위치하는 인덱스 값을 반환
  ㅊ. replace()   
            replaceAll( regex ) : 문자열 중 regex에 해당하는 문자열을 다 바꾼다.
            replaceFirst(regex) : 문자열 중 regex에 해당하는 첫번째 문자열만 바꾼다
  ㅋ. String [] split() : regex로 구분하여 배열로 담아 반환하는 메서드
  ㅌ. toUpperCase() / toLowerCase() : 대문자, 소문자로 바꿔서 반환하는 메서드
  ㅍ. trim() : 앞 뒤 공백을 제거하여 반환하는 메서드
  ㅎ. valueOf() : 기본형 int를 String으로 변환하는 메서드
  ㄱ. join() : 문자열을 원하는 구분자로 이어주는 메서드
  ㄴ. format()  : 원하는 형식으로 출력해주는 메서드
  ㄷ. matches() : 정규표현식을 넣어서 문자열이 정규표현식과 맞는 t/f 반환
  ㄹ. substring() : begin 인덱스부터 마지막 인덱스값 -1에 해당하는 문자열을 반환
  : 	문자열 속에서 내가 원하는 문자열을 반환
  :    
  
  5. 기본형 int 을 String 으로 변환하는 코딩을 하세요..
		int a = 10;
		String sa = String.valueOf(a);
		System.out.println(sa);
  
  6. 아래 코딩을 주석을 달아서 설명하세요. p472~473
   public static void main(String[] args) throws UnsupportedEncodingException {  // UnsupportedEncodingException 예외를 던졌고 main() 까지 왔기에 비정상적 종료
      String str = "가";      				
      byte [] bArr = str.getBytes("UTF-8");    					// 가 문자열의 byte 값을 byte 배열인 bArr에 담는다. UTF-8 인코딩으로 / 문자열 -> byte[] 배열 
       															// 왜 위의 코딩 사용? 메시지/파일 -> 소켓(전화기)으로  네트워크(바이트) -> 송/수신
      System.out.println("UTF-8 : "  + joinByteArr(bArr));      // bArr에 있는 값을 합쳐서 문자열로 만들고 UTF-8을 앞에 붙인다. 오버라이딩 하지 않으면 결과 값은 null
      System.out.println("UTF-8 : " + new String(bArr,"UTF-8")); // String 생성자(byte[], "인코딩")
   } 
   
 7. Object 클래스의  equals() 메서드와   == 연산자를 비교해서 차이점을 설명하세요.
    Object클래스의 equals() 메서드를 오버라이딩 하지 않으면 == 연산자와 같은 기능을 한다. ( 주소 값을 비교하는 기능을 함)
    equals() 메서드에서 같은 클래스 타입의 객체가 가지고 있는 값이 같으면 true로 변환하는 코딩을 해주어야 한다.
    공변반환타입이 적용이 되어 리턴타입을 자식클래스 타입으로 다운캐스팅하여 반환하기
    
    객체를 equals() 사용하면 실행 X
 * */
