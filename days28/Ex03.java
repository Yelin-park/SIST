package days28;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오전 10:24:24
 * @subject p874 바이트기반 스트림
 * @content		바이트 배열을 다루는 [메모리 스트림] - 메모리에 스트림을 만드면 읽기, 쓰기 성능이 빨라짐
 * 				ByteArrayInputStream
 * 				ByteArrayOutputStream
 * 
 *		// [][][][][][][][] -> bais 메모리 스트림 -> while (read() != -1)
 * 		// null
 * 		//						baos 메모리 스트림 -> baos.write(b);
 * 		// outsrc = baos.toByteArray();
 * 		// outsrc 출력
 * 				
 */
public class Ex03 {

	public static void main(String[] args) {
		byte[] insrc = {0,1,2,3,4,5,6,7,8,9}; // data의 소스를 가지고 있고 바이트 스트림을 읽을 변수라는 뜻으로 변수명 선언
		byte[] outsrc = null;
		
		// ByteArrayInputStream bais = new ByteArrayInputStream(insrc, 2, 5); // index 2 ~ 5에 위치하는 바이트 배열의 값을 읽어온다.
		try(ByteArrayInputStream bais = new ByteArrayInputStream(insrc);
			ByteArrayOutputStream baos = new ByteArrayOutputStream(); ) {// 바이트 배열을 전부다 읽어온다
			// outsrc = new byte[insrc.length];
			// int idx = 0;
			int b;
			while ((b = bais.read()) != -1) {
				// System.out.println(b);
				// outsrc[idx++] = (byte) b;
				baos.write(b);
			} // while
			
			outsrc = baos.toByteArray(); // 메모리 스트림에 있는 배열 값을 outsrc(바이트 배열)에 넣기
			
			System.out.println(Arrays.toString(outsrc));
			
			// bais.close();
		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
	} // main

} // class 
