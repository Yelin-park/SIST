package days27;

import java.io.File;
import java.io.IOException;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오후 3:37:20
 * @subject 폴더/파일 존재 유무 확인 후 삭제하는 작업
 * @content
 */
public class Ex11_02 {

	public static void main(String[] args) throws IOException {
		// String pathName = "C:\\Users\\Yelin Park\\Documents\\upload\\2022-03-28\\Test.java";
		// String pathName = "C:\\Users\\Yelin Park\\Documents\\upload\\2022-03-28";
		// 삭제하고자 하는 폴더에 aaa, bbb와 같은 하위 폴더가 있는 경우 delete() 메서드로 삭제 안됨
		String pathName = "C:\\Users\\Yelin Park\\Documents\\upload";
		
		File file = new File(pathName);
		// delete() 메서드 : 해당하는 경로에 있는 파일/폴더 삭제 후 boolean 반환
		System.out.println(file.delete()); // true -> Test.java 파일 삭제 / pathName 다시 지정 후 2022-03-28 폴더 삭제

	} // main

} // class
