package days21;

import java.io.FileReader;
import java.util.Arrays;

/**
 * @author Yelin
 * @date 2022. 3. 18. - 오후 3:14:15
 * @subject p502 예제9-28
 * @content 예제9-28 변형
 */
public class Ex09 {

	public static void main(String[] args) {
		// String.repeat(); JDK 11버전부터~ ***
		// [문제] days20.Ex01.java 파일을 읽어서 알파벳이 몇 개 있는지 배열에 저장해서 막대그래프 그리기
		
		String fileName = "days20\\Ex01.java";
		// 경로
		// 	ㄴ 절대경로 = C\\temp\\test\\abc.txt;
		//	ㄴ 상대경로 = 기준점 -> javaPro 프로젝트명 -> .으로 나타냄\
		// String 기준경로 = System.getProperty("user.dir"); // System.getProperty("user.dir") => 기준경로를 가져오는 코딩 ***[암기]
		// System.out.println(기준경로); // C:\Class\JavaClass\javaPro
		
		String path = String.format("%s\\src\\%s", System.getProperty("user.dir"), fileName); // ***[암기]
		// System.out.println(path); // C:\Class\JavaClass\javaPro\src\days20\Ex01.java
		
		int[] counter = new int[26]; // 대소문자 구분없이 A나 a는 0번 째 인덱스에 집어 넣을 것,  Z z 는 [25]
		// ASCII 문자코드 : A 65, a 97 | Z 90 z 122 -> 65이거나 97이면 [0]번째 값 증가
		char one; // 알파벳 한 문자 한 문자를 읽어와서 저장할 변수
		int code;
		
		// try-with-resources문
		try( FileReader fr = new FileReader(path); ) {
			while( (code = fr.read()) != -1 ) {  // read()는 읽어서 숫자로 돌려주고 읽을 게 없으면 -1을 돌려줌
				// System.out.printf("%d-%c\n",code, (char)code); // 읽어오는지 확인하는 코딩
				if('A' <= code && code <= 'Z' || 'a' <= code && code <= 'z') { // Character.isAlphabetic(code);
					code = Character.toUpperCase(code); // 읽어온 영문자를 다 대문자로 변환하여 code 변수에 담기 -> 65~90으로 바뀌어짐
					counter[code-65]++; // code값이 65면 [0]번째, 66이면 [1]번째, 67이면 [2]번째 에 들어가야 하니까 -65를 해준 것
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(counter));
		
		// 막대그래프 메서드 호출
		for (int i = 0; i < counter.length; i++) {
			System.out.printf("[%c] : %s(%d)\n", i+65, printBarGraph('*', counter[i]), counter[i]); // i+65 -> 영문자로 변환하는 코딩
		}
		
		// [응용하면 단어 갯수 파악 가능]

	} // main
	
	// 막대그래프 그리는 메서드
	// printBarGraph('*', 10) => **********
	public static String printBarGraph(char style, int length) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append(style);
		}
		return sb.toString();
	}

} // class

// com.util.Rnd.java => com.util 패키지 안에 Rnd 클래스 파일 생성
