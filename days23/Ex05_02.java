package days23;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.MessageFormat;
import java.util.Scanner;

/**
 * @author Yelin
 * @date 2022. 3. 22. - 오전 11:46:48
 * @subject p551 MessageFormat 클래스의 parse() 메서드 ***
 * @content 예제10-21은 합쳤고 강사님은 그냥 값을 뽑아내셨음
 */
public class Ex05_02 {

	public static void main(String[] args) throws Exception {
		String tableName = "CUST_INFO";
		String fileName = ".\\src\\days23\\data4.txt";
		String msg = "INSERT INTO " + tableName + " VALUES ({0},{1},{2},{3});";
		
		// 키보드로부터 읽어오기(키보드 -> System.in -> Scanner sc;)
		// Scanner sc = new Scanner(System.in);
		
		// 파일을 읽기 위한 스캐너
		Scanner sc = new Scanner(new File(fileName));
		
		String pattern = "INSERT INTO CUST_INFO VALUES ({0},{1},{2},{3});";
		// String pattern = "{0},{1},{2},{3}";
		MessageFormat mf = new MessageFormat(pattern);
		
		while (sc.hasNextLine()) { // 파일에 읽을 라인이 있니? 있다면 true, 없다면 false
			String line = sc.nextLine();
			// System.out.println(line);
			Object[] objs = mf.parse(line);
			for (Object a : objs) {
				System.out.println(a);
			}
			System.out.println("=============================");
			// System.out.println(MessageFormat.format(msg, objs));
		}// while
		
		sc.close();

	} // main

} // class
