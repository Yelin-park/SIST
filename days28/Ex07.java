package days28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오후 12:45:36
 * @subject p898 문자기반 스트림
 * @content
 * 				1. 최상위 부모 Reader와 Writer
 * 
 * 				2. FileReader와 FileWriter
 * 					- 파일로부터 텍스트 데이터를 읽고, 쓰는데 사용
 * 				3. p901 PipedReader와 PipedWriter
 * 					- 프로세스 간의 데이터 전송 -> 쓰레드 배워야 테스트 가능해서 이정도만 알고 넘어가기
 * 
 *  			4. p903 StringReader와 StringWriter 메모리 스트림 *** 자주 사용
 *  				- 문자열을 다루는 메모리 스트림
 *  				- CharArrayReader, CharArrayWriter 메모리 스트림/ ByteArrayReader, ByteArrayWriter
 */
public class Ex07 {

	public static void main(String[] args) throws IOException {
		
		String source =
				"package days28;\r\n"
				+ "\r\n"
				+ "import java.io.File;\r\n"
				+ "import java.io.FileInputStream;\r\n"
				+ "import java.io.FileOutputStream;\r\n"
				+ "import java.io.PrintStream;\r\n"
				+ "\r\n"
				+ "/**\r\n"
				+ " * @author Yelin\r\n"
				+ " * @date 2022. 3. 29. - 오전 9:03:19\r\n"
				+ " * @subject 실행파일 복사하기(교재에는 없음)\r\n"
				+ " * @content 실행파일은 문자 스트림으로 읽으면 안됨X 2바이트씩 읽으면 데이터를 못가져옴\r\n"
				+ " * 				int read(), 읽을게 없으면 -1 반환\r\n"
				+ " * \r\n"
				+ " * \r\n"
				+ " */\r\n"
				+ "public class Ex01 {\r\n"
				+ "	\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		String pathname = \"C:\\\\Program Files (x86)\\\\CBT\\\\CBT.exe\";\r\n"
				+ "		String copyPathname = \"C:\\\\Users\\\\Yelin Park\\\\Documents\\\\CBT.exe\";\r\n"
				+ "		\r\n"
				+ "		fileCopy_byteStream(pathname, copyPathname);\r\n"
				+ "\r\n"
				+ "	} // main\r\n"
				+ "\r\n"
				+ "	private static void fileCopy_byteStream(String pathname, String copyPathname) {\r\n"
				+ "		long start = System.nanoTime();\r\n"
				+ "		\r\n"
				+ "		File f1 = new File(pathname);\r\n"
				+ "		PrintStream ps = System.out; // 화면에 출력하는 스트림 객체, 바이트 스트림\r\n"
				+ "		try(FileInputStream fis = new FileInputStream(f1);\r\n"
				+ "			FileOutputStream fos = new FileOutputStream(copyPathname); ) {\r\n"
				+ "			int b;\r\n"
				+ "			while( (b = fis.read()) != -1) {\r\n"
				+ "				// ps.write(b);\r\n"
				+ "				// ps.print(b); // 한바이트씩 출력\r\n"
				+ "				fos.write(b); // 파일로 복사\r\n"
				+ "			}\r\n"
				+ "		} catch (Exception e) {\r\n"
				+ "			e.printStackTrace();\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "		long end = System.nanoTime();\r\n"
				+ "		System.out.println(\"> 처리 시간 : \" + (end-start) + \"ns - 파일(\" + f1.length() + \"bytes) 복사 완료!!\");\r\n"
				+ "		\r\n"
				+ "	} // fileCopy_byteStream\r\n"
				+ "\r\n"
				+ "} // class";
		
		// [문제2] source 문자열의 11번째 라인의 5번째 문자 출력
		StringReader sr = new StringReader(source);
		BufferedReader br = new BufferedReader(sr);
		int i = 1;
		while( i++ <= 10) br.readLine();
		
		// 1
		int j = 1;
		while (j++ <=5) {
			br.read();
		}
		System.out.println((char)br.read());
		
		// 2
		String line11 = br.readLine();
		char ch5 = line11.charAt(5-1);
		char[] buf = line11.toCharArray();
		char a = buf[4];
		
		// 3
		String s = line11.substring(15, 6);
		
		
		// [문제] source 문자열의 11번째 라인의 문자열 출력
		// 3번 방법
		StringReader sr2 = new StringReader(source);
		// 라인 단위로 처리하는 보조 스트림에 StringReader를 담아 가공
		BufferedReader br2 = new BufferedReader(sr); // BufferedReader는 문자스트림을 매개변수로 주면됨
		// 10개 라인 버리기
		int k = 1;
		while( k++ <= 10) {
			br2.readLine();
		}
		
		System.out.println(br2.readLine());

		// 1번 방법
		String[] lines = source.split("\r\n");
		System.out.println(lines[10]);

		// 2번 방법
		int fromIndex = 0 , findIndex = 0;
		int z = 1;
		while(z <= 10) {
			findIndex = source.indexOf("\r\n", fromIndex);
			fromIndex = findIndex + 1;
		}
		System.out.println(source.substring(findIndex, fromIndex));

		
	} // main

} // class