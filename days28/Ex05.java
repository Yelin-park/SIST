package days28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Yelin
 * @date 2022. 3. 29. - 오후 12:05:29
 * @subject p892 SequenceInputStream
 * @content		Sequence(순차적) + InputStream(읽기용도의 바이트 스트림) : 순차적으로 바이트 스트림을 읽기 위한 것
 * 					1. 여러 개의 입력 스트림을 연속적으로 연결해서 하나의 스트림으로 처리하고자 할 때 사용한다.
 * 						분리된 파일을 하나로 합칠 때 사용 - SequenceInputStream sis = new SequenceInputStream(en);
 */
public class Ex05 {

	public static void main(String[] args) {
		// 2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf
		// 2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf_.1
		// 2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf_.2
		// 2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf_.3
		// 2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf_.4
		// 2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf_.5 .. 11번까지
		
		try {
			FileInputStream fis1 = new FileInputStream("2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf_.1");
			/*
			int b;
			while ((b = fis1.read()) != -1) {
				// 읽어와서 출력 또는 파일로 저장 작업 코딩...
			}
			*/
			FileInputStream fis2 = new FileInputStream("2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf_.2");
			/*
			while ((b = fis2.read()) != -1) {
				// 읽어와서 출력 또는 파일로 저장 작업 코딩...
			}
			*/
			FileInputStream fis3 = new FileInputStream("2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf_.3");
			/*
			while ((b = fis3.read()) != -1) {
				// 읽어와서 출력 또는 파일로 저장 작업 코딩...
			}
			*/
			FileInputStream fis4 = new FileInputStream("2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf_.4");
			FileInputStream fis5 = new FileInputStream("2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf_.5");
			FileInputStream fis6 = new FileInputStream("2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf_.6");
			FileInputStream fis7 = new FileInputStream("2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf_.7");
			FileInputStream fis8 = new FileInputStream("2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf_.8");
			FileInputStream fis9 = new FileInputStream("2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf_.9");
			FileInputStream fis10 = new FileInputStream("2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf_.10");
			FileInputStream fis11 = new FileInputStream("2022년 정기 기사 2회 수험표 프린트 _ Q-net.pdf_.11");
			
			// 순서가 있는 List 인터페이스를 구현한 컬랙션 클래스 사용 + 동기화처리유무 판단
			// ArrayList
			Vector<FileInputStream> vt = new Vector<FileInputStream>();
			vt.addElement(fis1);
			vt.addElement(fis2);
			vt.addElement(fis3);
			vt.addElement(fis4);
			vt.addElement(fis5);
			vt.addElement(fis6);
			vt.addElement(fis7);
			vt.addElement(fis8);
			vt.addElement(fis9);
			vt.addElement(fis10);
			vt.addElement(fis11);
			
			Enumeration<FileInputStream> en = vt.elements();
			
			// [분리된 파일을 합치는 코딩을 할 때 SequenceInputStream 사용하면 편리!]
			// SequenceInputStream sis = new SequenceInputStream(Enumeration <? extends InputStream> e);
			SequenceInputStream sis = new SequenceInputStream(en);
			int b;
			while((b = sis.read()) != -1) {
				// 읽어와서 출력 또는 파일로 저장하는 코딩...
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // main

} // class
