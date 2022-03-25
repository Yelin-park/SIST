package days26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

/**
 * @author Yelin
 * @date 2022. 3. 25. - 오후 2:39:52
 * @subject 
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		String dir = System.getProperty("user.dir");
		String fileName = dir + "\\src\\com\\util\\jdbc.properties"; // Properties 파일이 있는 경로
		
		Properties p = new Properties(); 
		// 파일을 읽어서 Properties 로 저장
		try(FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr); ) {
			String line;
			while ( (line = br.readLine()) != null) {
				if (!line.startsWith("#")) {
					String[] kv = line.split("=");
					String key = kv[0];
					String value = kv[1];
					p.setProperty(key, value);
				} // if
			} // while
			System.out.println(p);
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

} // class
