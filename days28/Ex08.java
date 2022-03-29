package days28;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오후 2:32:21
 * @subject p905 InputStream[Reader]와 OutputStream[Writer] 문자 보조 스트림
 * @content		바이트스트림 : InputStream / OutputStream
 * 				문자스트림 : Reader / Writer
 * 			- 바이트스트림 + 문자스트림을 연결해주는 역할의 문자스트림 -> 즉, 바이트스트림을 문자스트림으로 변환해준다.
 * 
 * 			- 키보드로부터 입력
 * 				System 클래스 필요 -> in : 입력 / out : 출력 스트림
 * 				입력 : System.in
 * 				출력 : System.out
 * 
 * 			'a' 엔터 -> System.in으로 바이트스트림 반환 -> InputStreamReader으로 문자열 스트림 반환 -> ['a'][][][] BufferedReader 보조스트림이 라인 단위로 가져옴
 * 			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * 			name = br.readLine();
 */
public class Ex08 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in; // 바이트 스트림
		
		System.out.println("입력하세요?");
		int b = is.read(); // int[][][][] 로 받지만, 0~255 정수인 byte값을 반환 -> ex) a를 입력하면 97로 반환
		char ch = (char)b;
		System.out.println(ch);
		
	} // main

} // class
