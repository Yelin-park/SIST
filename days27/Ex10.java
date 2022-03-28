package days27;

import java.io.File;

import com.util.FileUtil;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오후 5:04:45
 * @subject com.util.FileUtill.java 안에 있는 메서드 사용해보기
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// com.util.FileUtill.java
		
		String path = System.getProperty("user.dir") + "\\src\\days01\\Ex07.java";
		System.out.println(path); // C:\Class\JavaClass\javaPro\src\days01\Ex07.java
		
		// 1. 전체 경로에서 파일명만 가져오기
		File f = new File(path);
		String fileName = f.getName();
		System.out.println(fileName); // Ex07.java
		
		// 2. 확장자만 가져오기
		String extension = FileUtil.getExtension(f); 
		System.out.println(extension); // .java
		
		// 3. 확장자를 뺀 파일이름만 가져오기
		String baseName = FileUtil.getBaseName(fileName);
		System.out.println(baseName); // Ex07

	} // main

} // class
