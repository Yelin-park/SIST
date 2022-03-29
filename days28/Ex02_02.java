package days28;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오전 10:11:40
 * @subject p932 예제15-38
 * @content 나눈 파일 합치는 예제
 * 			 임시파일 처리***
 */
public class Ex02_02 {

	public static void main(String[] args) {
		String mergeFilename = "C:\\Users\\Yelin Park\\Documents\\Test용합쳤다.pdf";
		
		try {
			File temp = File.createTempFile("~mergeFilename", ".tmp"); // 임시파일 생성
			temp.deleteOnExit(); // 프로그램 종료할 때 임시파일 삭제
			FileOutputStream fos = new FileOutputStream(temp);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			BufferedInputStream bis = null;
			
			int num = 1;
			
			File f = new File(mergeFilename + "_." + num);
			while (f.exists()) {
				f.setReadOnly(); // 작업중에 파일의 내용 변경되지 않도록 하기
				bis = new BufferedInputStream(new FileInputStream(f));
				
				int data = 0;
				while ((data = bis.read()) != -1) {
					bos.write(data);
				} // while
				
				bis.close();
				
				f = new File(mergeFilename + "_." + ++num);
			} // while
			
			bos.close();
			
			File oldFile = new File(mergeFilename);
			if(oldFile.exists()) {
				oldFile.delete();
			} // if
			temp.renameTo(oldFile);
			
		} catch (IOException e) {
			e.printStackTrace();
		} // try

	} // main

} // class
