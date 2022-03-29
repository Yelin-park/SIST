package days28;

import java.io.BufferedReader;
import java.io.RandomAccessFile;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오후 3:54:40
 * @subject p913 예제15-26 변형
 * @content RandomAccessFile
 */
public class Ex10_02 {

	public static void main(String[] args) {
		int [] score = {
	            1,100,90,90,            
	            2,70,90,100,
	            3,100,100,100,
	            4,70,60,80,
	            5,70,90,100
	      };
		
		String name = ".\\src\\days28\\score.dat";
		String mode = "rw";
		try(RandomAccessFile raf = new RandomAccessFile(name, mode );) {
			for (int i = 0; i < score.length; i++) {
				System.out.println("> 현재 FP(file-pointer) : " + raf.getFilePointer() + " - " + score[i]);
				raf.writeInt(score[i]);
			} // for i
			
			System.out.println("> 엔터 치면 계속 진행합니다.");
			System.in.read();
			System.in.skip(System.in.available()); // 남아있는거 모두 제거하는 코딩
			
			// [문제1] 3번 학생의 번호, 국어, 영어, 수학 점수 정보만 출력
			int pos = 4 + 4 + 4 + 4; // 한 학생의 정보 위치들
			raf.seek(pos * 2);
			int no = raf.readInt();
			int kor = raf.readInt();
			int eng = raf.readInt();
			int mat = raf.readInt();
			System.out.printf("번호:%d, 국어:%d, 영어:%d, 수학:%d\n", no, kor, eng, mat);
			
			System.out.println("> 엔터 치면 계속 진행합니다.");
			System.in.read();
			System.in.skip(System.in.available()); // 남아있는거 모두 제거하는 코딩
			
			// [문제2] 3번 학생의 수학 점수를 20점으로 수정
			pos = 4 + 4 + 4 + 4; // 한 학생의 정보 위치들
			raf.seek(pos * 2 + 4 + 4 + 4); // 수학 위치 44
			raf.writeInt(20);
			
			System.out.println("> 엔터 치면 계속 진행합니다.");
			System.in.read();
			System.in.skip(System.in.available()); // 남아있는거 모두 제거하는 코딩
			
			// [문제3] 모든 학생의 정보를 출력 번호, 국어, 영어, 수학
			raf.seek(0); // 처음으로 돌려놓고 출력
			for (int i = 0; i < score.length; i++) {
				int info = raf.readInt();
				System.out.print(info + "\t");
				if((i + 1) % 4 == 0) System.out.println();
			} // for i
			
		} catch (Exception e) {
			e.printStackTrace();
		} // try

	} // main

} // class

/*
> 현재 FP(file-pointer) : 0 - 1
> 현재 FP(file-pointer) : 4 - 100
> 현재 FP(file-pointer) : 8 - 90
> 현재 FP(file-pointer) : 12 - 90
> 현재 FP(file-pointer) : 16 - 2
> 현재 FP(file-pointer) : 20 - 70
> 현재 FP(file-pointer) : 24 - 90
> 현재 FP(file-pointer) : 28 - 100
> 현재 FP(file-pointer) : 32 - 3
> 현재 FP(file-pointer) : 36 - 100
> 현재 FP(file-pointer) : 40 - 100
> 현재 FP(file-pointer) : 44 - 100
> 현재 FP(file-pointer) : 48 - 4
> 현재 FP(file-pointer) : 52 - 70
> 현재 FP(file-pointer) : 56 - 60
> 현재 FP(file-pointer) : 60 - 80
> 현재 FP(file-pointer) : 64 - 5
> 현재 FP(file-pointer) : 68 - 70
> 현재 FP(file-pointer) : 72 - 90
> 현재 FP(file-pointer) : 76 - 100
*/
