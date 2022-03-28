package days27;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오후 2:16:22
 * @subject p915 File 클래스 설명
 * @content		File 클래스 : 파일과 디렉토리를 관리하는 클래스
 * 				p919 예제15-29 비슷한 유형으로 코딩
 * 
 * 		// 목록을 돌려주는 메서드 2가지, 리턴값이 다르다.
 * 		// String[] currDir.list();
 * 		// File[] 	currDir.listFiles();
 */
public class Ex07 {

	public static void main(String[] args) {
		String currentDirectory = System.getProperty("user.dir"); // C:\Class\JavaClass\javaPro
		
		// currentDirectory(현재경로)를 가지고 있는 파일 객체 생성
		File currDir = new File(currentDirectory);
		
		// 하위폴더 + 파일목록
		File[] fileList = currDir.listFiles();
		for (int i = 0; i < fileList.length; i++) {
			// 1. 유형 확인해서 출력하기
			if (fileList[i].isDirectory()) { // 디렉토리냐?
				System.out.print("[폴더]");
			} else if(fileList[i].isFile()) { // 파일이냐?
				System.out.print("[파일]");
			} // if-else
			
			// 2. 파일명, 폴더명 출력하기
			System.out.print("\t" + fileList[i].getName());
			
			// 3. 마지막 수정된 날짜 가져오기
			long lm = fileList[i].lastModified(); // 2022-02-15 오후 2:49
			
			Date d = new Date(lm);
			String pattern = "yyyy-MM-dd a hh:mm";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			String date = sdf.format(d);
			System.out.print("\t" + date);
			
			// 4. 파일 크기 가져오기
			if(fileList[i].isFile()) {
				System.out.println("\t" + fileList[i].length() + "bytes");
			}
			
			System.out.println();
			
		} // for i

	} // main

} // class
