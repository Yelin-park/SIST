package days28;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오전 10:48:23
 * @subject Ex04,04_02짝 Ex04_03,_04 짝
 * @content [DataInputStream과 DataOutputStream] 보조 스트림 사용하기 전 예제
 * 
 * 				p879 [FileInputStream과 FileOutputStream]
 * 					1. 파일 읽고 쓰는 바이트 스트림
 * 					2. 실행파일, 이미지, 동영상 파일, 텍스트 파일 등 (+ 네트워크 = 전송, ex) 카톡)
 * 
 * 				p883 [BufferedInputStream과 BufferedOutputStream] 
 * 					1. 바이트 스트림의 입출력 효율을 높이기 위해서 사용하는 보조스트림
 * 					2. 한 바이트씩 입출력하는 것보다 버퍼(임시기억공간)를 사용해서 여러 바이트를 입출력하는 것이 효율적이다.
 * 
 * 				p886 [DataInputStream과 DataOutputStream]
 * 					1. 데이터를 읽고 쓰는데 byte 단위가 아닌 기본형으로 읽고 쓸 수 있는 장점을 가진 바이트 스트림
 */
public class Ex04 {

	public static void main(String[] args) {
		String name = "꼬여사";
		int kor = 98, eng = 78, mat = 88;
		int tot = kor + eng + mat;
		double avg = (double)tot / 3;
		boolean gender = false;
		
		// 텍스트 파일 읽기/쓰기 -> 바이트 스트림말고 문자 스트림 사용하면 됌
		// FileReader(읽기), [FileWriter(쓰기(출력))]
		// 위의 한 학생의 성적 정보를 파일로 저장
		String fileName =".\\src\\days28\\student.txt";
		try(FileWriter fw = new FileWriter(fileName, true); // boolean append 매개변수에 값을 주면 파일에 새로운 데이터를 추가 OR 새로운 파일 생성
			BufferedWriter bw = new BufferedWriter(fw); ) { // 보조스트림 8196 byte 버퍼(기본값)
			
			/*
			fw.write(name + "\r\n"); // 스트림에 쓰는 작업
			fw.write(kor + "\r\n");
			fw.write(eng + "\r\n");
			fw.write(mat + "\r\n");
			fw.write(avg + "" + "\r\n");
			fw.write(gender + "" + "\r\n");
			*/
			
			String data = String.format("%s, %d, %d, %d, %d, %.2f, %b\n", name, kor, eng, mat, tot, avg, gender);
			// fw.write(data);
			// fw.flush(); // 스트림에 있는 데이터를 저장
			bw.write(data);
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
		System.out.println("END");

	} // main

} // class
