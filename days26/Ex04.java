package days26;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * @author Yelin
 * @date 2022. 3. 25. - 오후 12:25:33
 * @subject p650 예제11-33 비슷한 거
 * @content days21.Ex09.java
 */
public class Ex04 {
	// 파일을 읽어서 A 12, 막대그래프 ####
	public static void main(String[] args) {
		String fileName = "days20\\Ex01.java";
		String path = String.format("%s\\src\\%s", System.getProperty("user.dir"), fileName);
		
		//      	A		 1++;    -> character 문자를 읽어서 Integer에 갯수 만큼 증가
		HashMap<Character, Integer> map = new HashMap<>(); // int[] counter = new int[26]; // 대소문자 구분없이 A나 a는 0번 째 인덱스에 집어 넣을 것,  Z z 는 [25]
		
		char one; 
		int code;
		
		try( FileReader fr = new FileReader(path); ) {
			while( (code = fr.read()) != -1 ) { // 모든 문자를 다 읽어서 체크
				one = (char) code; // 읽어온 문자를 char로 변환해서 one에 넣기
				if (map.containsKey(one)) {
					map.put(one, map.get(one) + 1);
				} else {
					map.put(one, 0); // 1
				}
			} // while
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Iterator<Entry<Character, Integer>> ir = map.entrySet().iterator();
		while (ir.hasNext()) {
			Entry<Character, Integer> entry = (Entry<Character, Integer>) ir.next();
			System.out.printf("[%c] : %s(%d)\n", entry.getKey(), printBarGraph('*', entry.getValue()),entry.getValue());
		}

	} // main
	
	public static String printBarGraph(char style, int length) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append(style);
		}
		return sb.toString();
	} // printBarGraph

} // class
