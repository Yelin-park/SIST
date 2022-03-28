package days27;

import java.io.File;
import java.io.IOException;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오후 3:37:20
 * @subject 폴더/파일 존재 유무 확인 후 생성하는 작업
 * @content createNewFile() mkdir() mkdirs()
 */
public class Ex11 {

	public static void main(String[] args) throws IOException {
		// C:\\upload 폴더 있는지 확인 후에 없으면 생성하는 코딩
		String pathName = "C:\\Users\\Yelin Park\\Documents\\upload\\2022-03-28";
		
		// 파일, 디렉토리 관리하는 클래스 - File 클래스
		File file = new File(pathName);
		
		// exists() 메서드 : 파일/디렉토리 존재 유무를 boolean으로 반환해주는 메서드
		if( !file.exists() ) { // 존재하지 않는다면
			// System.out.println(file.createNewFile()); // 파일 생성하는 메서드
			
			// \\upload\\2022-03-28"; upload 폴더도 없는데 2022-03-28 폴더를 생성하려고 하니 생성되지 않는다.
			// System.out.println( file.mkdir() ); // 디렉토리 생성하는 메서드
			
			System.out.println( file.mkdirs() ); // 경로상에 없는 폴더 다 생성해주는 메서드
			
		} // if

	} // main

} // class
