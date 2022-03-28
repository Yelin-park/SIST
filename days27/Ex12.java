package days27;

import java.io.File;
import java.io.IOException;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오후 4:36:18
 * @subject p928 예제 15-34
 * @content days27 패키지 안에 파일명이 Ex06 시작하는 파일만 찾아서 출력/삭제/이름변경 등을 하고싶다.
 * 
 * 			이름변경 : renameTo()
 * 			삭제 : delete()
 * 
 */
public class Ex12 {

	public static void main(String[] args) throws IOException {
		
		// days27 패키지 안에 파일명이 Ex06 시작하는 파일만 찾아서 출력/삭제/이름변경 등을 하고싶다.
		String pathname = ".//src//days27"; // 상대경로로 표시했을 때만 아래 3가지 메서드가 표시되는 것이 다르다
		File file = new File(pathname);
		
		File[] fileList = file.listFiles(); // 폴더 + 파일이 있다
		for (int i = 0; i < fileList.length; i++) {
			if(fileList[i].isFile()) {
				String fileName = fileList[i].getName();
				if(fileName.startsWith("Ex06")) { // Ex06으로 시작하느냐
					System.out.println(fileName);
				} // if
				
			} // if
				
		} // for i
		
	} // main

} // class

/*
 		// String pathname = "C:\\Class\\JavaClass\\javaPro"; // 절대경로 -> C:\Class\JavaClass\javaPro
		System.out.println(file.getAbsolutePath()); // C:\Class\JavaClass\javaPro\.\src\days27
		System.out.println(file.getCanonicalPath()); // C:\Class\JavaClass\javaPro\src\days27 -> 절대경로
		System.out.println(file.getPath()); // .\src\days27
*/
