package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06_02 {

	public static void main(String[] args) throws IOException {
		// 이름을 키보드로부터 입력받아서 name 변수에 저장하고
		// 출력형식) 이름=홍길동
		// 출력하는 코딩을 하세요.
		
		String name;
		System.out.print(">이름을 입력하세요:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		name = br.readLine();
		System.out.printf("이름=%s", name);

	}

}
