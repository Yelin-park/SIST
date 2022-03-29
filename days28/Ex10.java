package days28;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오후 3:37:12
 * @subject p911 RandomAccess[File]
 * @content		1. 파일을 다루는 스트림
 * 				2. 장점(특징) : 파일의 어느 위치에나 읽기/쓰기 작업 가능한 스트림
 * 									[seek(pos)] write~(), read~(0
 * 				2. 장점(특징) : 읽기 가능 + 쓰기 가능
 * 				 
 */
public class Ex10 {

	public static void main(String[] args) throws IOException {
		
		String s = "I Love Normal Java";
		String q = "Javabook";
		
		String name = ".\\src\\days28\\random.txt"; // 저장(쓰기), 읽기
		String mode = "rw"; // r(읽기), rw(읽기쓰기), rws, rwd(지금은 읽기쓰기라고 생각하기^^)
		try(RandomAccessFile raf = new RandomAccessFile(name, mode);) {
			raf.writeBytes(s);
		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
		System.out.println("> 엔터 치면 계속 진행합니다.");
		System.in.read();
		System.in.skip(System.in.available()); // 남아있는거 모두 제거하는 코딩
		
		try(RandomAccessFile raf = new RandomAccessFile(name, mode);) {
			// 내가 쓰고자 하는 파일의 위치를 지정해서 그 위치에 q 문자열 저장(쓰기)
			// 쓰고자(읽고자) 하는 파일의 위치 == 파일 포인터(file-pointer)
			raf.seek(7); // 파일 위치(파일 포인터)를 변경하는 메서드(단위 : byte)
			raf.writeBytes(q); // 내가 원하는 위치에 쓰기 작업 == 덮어쓰기함(그 위치에 다른 문자가 있으면 덮어써짐)
		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
		System.out.println("> 엔터 치면 계속 진행합니다.");
		System.in.read();
		System.in.skip(System.in.available()); // 남아있는거 모두 제거하는 코딩
		
		try(RandomAccessFile raf = new RandomAccessFile(name, mode);) {
			raf.seek(2);
			String line = raf.readLine(); // 내가 원하는 임의의 위치부터 읽기 작업
			System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
		System.out.println("END");
		
	} // main

} // class
