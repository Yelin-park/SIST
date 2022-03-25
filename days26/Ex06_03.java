package days26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Yelin
 * @date 2022. 3. 25. - 오후 2:39:52
 * @subject 
 * @content
 */
public class Ex06_03 {

	public static void main(String[] args) {
		String dir = System.getProperty("user.dir");
		String fileName = dir + "\\src\\com\\util\\jdbc.properties"; // Properties 파일이 있는 경로
		Properties p = new Properties(); 
		
		// 파일을 읽어서 Properties 로 저장 -> load() 메서드 사용
		try {
			p.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// System.out.println(p);
		System.out.println(p.getProperty("className"));
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
	} // main

} // class
