package days28;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오전 9:25:16
 * @subject p931 예제15-37
 * @content 지정된 파일을 지정된 크기로 잘라서 여러 개의 파일로 저장하기
 * 			파일 객체 메서드 중...
 * 			flush() 메서드 : 저장, 스트림 비우는 메서드 (데이터가 읽혀서 스트림 객체에 저장되어 있는 데이터를 물리적인 공간에 저장을 하고 스트림을 깨끗이 비우는 메서드)
 * 			close() 메서드 : 선(flush 작업) 후 닫기 (flush 작업이 일어난 뒤 파일을 닫는 작업)
 * 
 * String pathname = "C:\\Users\\Yelin Park\\Documents\\2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf";
 */
public class Ex02 {

	public static void main(String[] args) {
		String pathname = "C:\\Users\\Yelin Park\\Documents\\Test용.pdf"; // 1,051,551 바이트
		final int VOLUME = 100000;
		File f = new File(pathname);
		System.out.println(">원본 파일 크기 : " + f.length() + "bytes");
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		int data = 0; // 1바이트를 읽어서 저장하는 변수
		int i = 0; // 읽은 바이트수를 카운트 변수
		int number = 0;
		try(FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);) {
			
			while ((data = bis.read()) != -1) { // 더 이상 읽을게 없을 때 까지 읽어서
				if(i % VOLUME == 0) { // i가 0으로 들어오면 초기생성 / i가 100,000으로 나눠 떨어진다면
					if( i != 0) bos.close();// i가 0이 아니면 파일스트림을 저장을 해라
					fos = new FileOutputStream(pathname + "_." + (++number));
					bos = new BufferedOutputStream(fos);
				} // if
				
				bos.write(data); // BufferedOutputStream인 bos에 저장
				i++;
				
			} // while
			System.out.println("END");
		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
	} // main

} // class

// i = 0		파일스트림 저장X, for, bos 객체 생성 _.1
// i = 100000	파일스트림 저장 _.2  fos,bos 객체 생성 _.3
// i = 200000	파일스트림 저장 _.3  fos,bos 객체 생성 _.4
// i = 300000	파일스트림 저장 _.4  fos,bos 객체 생성 _.5
// i = 400000	파일스트림 저장 _.5  fos,bos 객체 생성 _.6
// i = 51551	파일스트림 저장 _.n  fos,bos 객체 생성 _.n+1