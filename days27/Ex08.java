package days27;

import java.io.File;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오후 2:44:29
 * @subject p920 예제15-30 / p922 예제15-31
 * @content 	canRead() canWrite() canExecute() isHidden()
 */
public class Ex08 {

	public static void main(String[] args) {
		String pathname = ".\\src\\days27\\Ex01.java";
		File f = new File(pathname);
		
		System.out.println(f.exists()); // exists() : 파일 객체 존재유무를 boolean으로 반환해주는 메서드
		
		if (f.exists() && f.isFile()) { // 존재유무 확인 && 파일인지 확인 
			System.out.println(f.canRead()); // 읽기 가능하니?
			System.out.println(f.canWrite()); // 쓰기 가능하니?(읽기전용인지 물어보는 것)
			System.out.println(f.canExecute()); // 실행 가능하니?
			System.out.println(f.isHidden()); // 숨겨졌니?
		} // if

	} // main

} // class












