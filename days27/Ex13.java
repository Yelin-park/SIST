package days27;

import java.io.File;
import com.util.FileUtil;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오후 4:53:40
 * @subject p930 예제15-36 비슷함
 * @content
 */
public class Ex13 {

	public static void main(String[] args) {
		// 4자리의 파일명으로 다시 저장
		// 1.png -> 0001.png
		// 2.png -> 0002.png
		// 11.png -> 0011.png
		
		String pathname = ".\\src\\days27\\images";
		File f = new File(pathname);
		
		File[] flist = f.listFiles();
		
		for (int i = 0; i < flist.length; i++) {
			String fileName = flist[i].getName();
			// System.out.println(fileName);
			String baseName = FileUtil.getBaseName(fileName);
			String ext = FileUtil.getExtension(fileName);
			String newBaseName = String.format("%04d", Integer.parseInt(baseName));
			String newFileName = String.format("%s%s", newBaseName, ext);
			// flist[i].renameTo(new File(pathname, newFileName)); // String을 줄수도 있고
			flist[i].renameTo(new File(f, newFileName)); // File 객체를 줘도 됨
			
		} // for i

	} // main

} // class
