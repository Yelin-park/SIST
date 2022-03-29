package days28;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오전 10:48:23
 * @subject [student.dat] 파일 읽기
 * @content p892 예제15-13 비슷 FileInputStream과 DataInputStream 사용
 * 				p886 [DataInputStream과 DataOutputStream]
 * 					1. 데이터를 읽고 쓰는데 byte 단위가 아닌 [기본형]으로 읽고 쓸 수 있는 장점을 가진 바이트 보조 스트림
 */
public class Ex04_04 {

	public static void main(String[] args) {
		// [DataInputStream과 DataOutputStream] 바이트 보조 스트림 사용
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		boolean gender;
		
		// 텍스트 파일 읽기/쓰기 -> 바이트 스트림말고 문자 스트림 사용하면 됌
		// FileReader(읽기), [FileWriter(쓰기(출력))]
		// 위의 한 학생의 성적 정보를 파일로 저장
		String fileName =".\\src\\days28\\student.dat";
		try(FileInputStream in = new FileInputStream(fileName);
			DataInputStream dis = new DataInputStream(in);) { 
			
			// while (dis.available() > 0) { // 읽어올 바이트 갯수가 남아있으면 출력
			while(true) { // true일 때 계속 돌리다가 예외가 발생하면 아무것도 처리하지않는 예외처리하기(EOFException)
				// 저장된 순서대로 읽어와야 함!
				name = dis.readUTF();
				kor = dis.readInt();
				eng = dis.readInt();
				mat = dis.readInt();
				tot = dis.readInt();
				avg = dis.readDouble();
				gender = dis.readBoolean();
				
				String data = String.format("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %.2f, 성별 : %b\n", name, kor, eng, mat, tot, avg, gender);
				System.out.println(data);
			} // while

		} catch(EOFException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
		System.out.println("END");

	} // main

} // class
