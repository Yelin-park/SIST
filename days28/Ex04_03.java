package days28;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오전 10:48:23
 * @subject		[student.txt] 파일을 읽어서 출력하기
 * @content 	p892 예제15-13 비슷
 * 				p886 [DataInputStream과 DataOutputStream]
 * 					1. 데이터를 읽고 쓰는데 byte 단위가 아닌 기본형으로 읽고 쓸 수 있는 장점을 가진 바이트 스트림
 */
public class Ex04_03 {

	public static void main(String[] args) {
		// [DataInputStream과 DataOutputStream] 보조 스트림 사용하기 전
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		boolean gender;

		String fileName =".\\src\\days28\\student.txt";
		try(FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr); ) { 
			
			String line = "";
			// 꼬여사, 98, 78, 88, 264, 88.00, false -> ,(콤마)로 split() 메서드 사용하면 각각 잘라올 수 있음
			while((  line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
		System.out.println("END");

	} // main

} // class
