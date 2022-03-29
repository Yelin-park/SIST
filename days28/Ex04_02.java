package days28;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오전 10:48:23
 * @subject		
 * @content 	[DataInputStream과 DataOutputStream] 바이트 보조 스트림 사용하는 예제
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
 * 					1. 데이터를 읽고 쓰는데 byte 단위가 아닌 [기본형]으로 읽고 쓸 수 있는 장점을 가진 바이트 보조 스트림
 */
public class Ex04_02 {

	public static void main(String[] args) {
		String name = "야리니";
		int kor = 90, eng = 68, mat = 98;
		int tot = kor + eng + mat;
		double avg = (double)tot / 3;
		boolean gender = false;
		
		// 텍스트 파일 읽기/쓰기 -> 바이트 스트림말고 문자 스트림 사용하면 됌
		// FileReader(읽기), [FileWriter(쓰기(출력))]
		// 위의 한 학생의 성적 정보를 파일로 저장
		String fileName =".\\src\\days28\\student.dat";
		try(FileOutputStream out = new FileOutputStream(fileName, true);
			DataOutputStream dos = new DataOutputStream(out);) { // DataOutputStream은 보조스트림이라 FileOutputStream 필요
			
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
		System.out.println("END");

	} // main

} // class
