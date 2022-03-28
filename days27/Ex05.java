package days27;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오전 11:25:46
 * @subject  p868 Chapter15 입출력(I/O)
 * @content
 * 				1. 자바 입출력 == Input / Output == I/O
 *				
 *				2. 컴퓨터 내/외부의 장치와 프로그램 간에 데이터를 주고 받는 것
 *					예) 키보드 장치 	-> 	프로그램(Ex05.java) 	-> 	콘솔창 출력
 *								데이터 받기             	데이터 주기
 *								  입력						출력
 *
 *				3. 자바의 모든 데이터 입출력은 스트림(Stream)이라는 개념으로 이루어진다.
 *				
 *				4. 스트림(Stream) ?
 *					ㄱ. 음료수를 마실 때 필요한 빨대 == 스트림 객체
 *					ㄴ. 스트림 객체는 단방향이기에 스트림은 2가지 종류가 있다.
 *						읽기(입력용) 스트림
 *						쓰기(출력용) 스트림
 *					ㄷ. 스트림의 사전적의미 : 흐르는 물
 *
 *				5. 자바의 스트림은 대상으로 2가지 종류 구분(대상 : 읽고 쓰는 대상) ***
 *					ㄱ. 문자(텍스트) 스트림
 *						- 읽기(입력용) 스트림 : 최상위 부모인터페이스는 Reader 인터페이스
 *						- 쓰기(출력용) 스트림 : 최상위 부모인터페이스는 Writer 인터페이스
 *							ex) 대부분 XXXReader, XXXWriter
 *								BufferedReader, InputStreamReader, FileReader, FileWriter
 *						- 기본단위 : 유니코드 2바이트 == 1문자 == 2바이트(16비트)
 *						- 한 문자, 문자열, 문자 배열
 *
 *					ㄴ. 바이트 스트림
 * 						- 읽기(입력용) 스트림 : 최상위 부모인터페이스 InputStream 인터페이스
 *						- 쓰기(출력용) 스트림 : 최상위 부모인터페이스 OutputStream 인터페이스
 *							ex) 대부분 XXXInputStream, XXXOutputStream
 *								FileInputStream, FileOutputStream
 *						- 기본단위 : 1바이트(8비트)
 *						- 바이트, 바이트배열, 정수(int) [][][][00001111] -> [] 1바이트만 저장함
 *
 *				6. 보조스트림 - 어떤 스트림을 사용하기(I/O) 더 쉽도록 보조해주는 스트림
 *					ex) BufferedReader 문자를 읽기위한 용도의 보조 스트림
 *					BufferedReader br = new BufferedReader(new FileReader("a.txt"))
 *					new FileReader("a.txt") : a.txt 파일을 1문자(2바이트 단위)로 읽기 위한 스트림 == 읽기 문자 스트림
 *					br.readLine(); : 한 라인단위로 처리하기 쉬움
 *
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} // main

} // class
