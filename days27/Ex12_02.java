package days27;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
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
public class Ex12_02 {

	public static void main(String[] args) throws IOException {
		
		// days27 패키지 안에 파일명이 Ex06 시작하는 파일만 찾아서 출력/삭제/이름변경 등을 하고싶다.
		String pathname = ".//src//days27"; // 상대경로로 표시했을 때만 아래 3가지 메서드가 표시되는 것이 다르다
		File file = new File(pathname);

		// 익명클래스
		File[] fileList = file.listFiles(  new FilenameFilter() {
				@Override
				// Ex12 코딩에서 dir : fileList[i]  name : fileList[i].getName() 과 매칭되는 부분
				public boolean accept(File dir, String name) { 
					return name.startsWith("Ex06");
				} // accept
			}
		);
		
		for (File f : fileList) {
			System.out.println(f.getName());
		}
		
	} // main

} // class

