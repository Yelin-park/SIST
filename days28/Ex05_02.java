package days28;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오후 12:20:34
 * @subject p893 예제15-14 SequenceInputStream 예제 - 이해를 하기 위한 작업
 * @content			연속적인 바이트 배열을 SequenceInputStream 사용하여 처리
 * 					SequenceInputStream 사용하려고하니 InputStream 타입의 Enumeration(열거형)을 달라고 함
 * 					그래서 바이트 배열을 ByteArrayInputStream으로 바꾸고 Vector(또는 ArrayList) 컬렉션 클래스를 생성해 add() 메서드로 추가
 * 					elements() 메서드로 요소를 가져와 Enumeration 생성하여 SequenceInputStream의 매개변수로 할당
 */
public class Ex05_02 {

	public static void main(String[] args) {
		byte[] a = {0, 1, 2, 3};
		byte[] b = {4, 5, 6};
		byte[] c = {7, 8, 9};
		
		// SequenceInputStream 사용
		Vector<ByteArrayInputStream> vt = new Vector<ByteArrayInputStream>();
		vt.add(new ByteArrayInputStream(a));
		vt.add(new ByteArrayInputStream(b));
		vt.add(new ByteArrayInputStream(c));
		
		Enumeration<ByteArrayInputStream> en = vt.elements();
		
		SequenceInputStream sis = new SequenceInputStream(en); // 이걸로 읽고
		ByteArrayOutputStream baos = new ByteArrayOutputStream(); // 이걸로 쓰기
		byte[] d = null;
		int data = 0;
		try {
			while ((data = sis.read()) != -1) {
				baos.write(data);
			} // while
		} catch (IOException e) {
			e.printStackTrace();
		} // try-catch
		
		d = baos.toByteArray();
		System.out.println(Arrays.toString(d));
		
		/*
		// SequenceInputStream 사용 X
		byte[] d = new byte[a.length + b.length + c.length];
		System.arraycopy(a, 0, d, 0, a.length);
		System.arraycopy(b, 0, d, 4, b.length);
		System.arraycopy(c, 0, d, 7, c.length);
		*/

	} // main

} // class
