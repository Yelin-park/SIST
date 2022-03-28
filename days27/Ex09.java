package days27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author Yelin
 * @date 2022. 3. 28. - 오후 2:53:46
 * @subject 모든 자바파일을 검색해서 "Lotto" 문자열을 포함하는 파일만 찾아서 출력
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		String dir = ".\\src";
		// 모든 자바파일을 검색해서 "Lotto" 문자열을 포함하는 파일만 찾아서 출력
		String keyword = "Lotto";

		File searchDir = new File(dir); // src 폴더 안에 있는 모든 하위 폴더들을 다 검색하겠다.

		// 검색 후 찾으면 출력해주는 메서드
		printsearchFiles(searchDir, keyword);

	} // main

	// 메서드
	private static void printsearchFiles(File searchDir, String keyword) {
		// 검색할 위치의 하위 폴더와 파일 목록을 가져옴
		File[] files = searchDir.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) { // 검색하고자 하는 것이 디렉토리냐? true이면 하위 폴더
				printsearchFiles(files[i], keyword); // 재귀함수로 인해 몯
			} else { // 아니라면 파일
				String fileName = files[i].getName(); // 파일명만 가져옴(???.java)
				String extension = fileName.substring(fileName.lastIndexOf(".") + 1); // .java
				if(extension.equals("java")) { // 조건 : ???.java -> 확장자 java인 것만 / 문자열 비교는 equals!!!
					try(
						FileReader fr = new FileReader(files[i]); // FileReader는 한 문자만 읽어올 수 있고
						BufferedReader br = new BufferedReader(fr); ) { // BufferedReader는 라인 단위로 읽어올 수 있음
						String line;
						StringBuffer sb = new StringBuffer(); // 모든 파일의 내용들이 들어감
						
						while ((line = br.readLine()) != null) {
							sb.append(line + "\r\n"); // 한 라인씩 읽어온 것을 StringBuffer인 sb에 넣기
						} // while
						
						if (sb.indexOf(keyword) != -1) { // 모든 파일의 내용이 있는 sb에서 keyword("Lotto")가 없으면 -1
							System.out.println(files[i]); // 파일 안에 "Lotto" 라는 단어가 있는 것을 출력
						} // if
						
					} catch (Exception e) {
						e.printStackTrace();
					} // try-catch
					
				} // if
				
			} // if-else
			
		} // for i
		
	} // printsearchFiles

} // class
