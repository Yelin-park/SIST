package days03;

/**
 * @author Yelin
 * @date 2022. 2. 17. - 오전 9:48:31
 * @subject 
 * @content 1. 에러메시지 : Duplicate local variable temp
 */
public class Ex01 {

	public static void main(String[] args) {
		
		int x=1 , y=2;
		{
			int temp = x;
			// 에러메시지 : Duplicate local variable temp
			// 해석 : temp라는 지역변수가 두 번 선언되었다(중복)
			// int temp = x;
			
			x = y;
			y = temp;
		}

	} // main

} // class




// 'A'  65   -> 2진수 0,1 [][][][][][][][] [][][][][][][][]
// 128  64  32  16  8  4  2  1
//  0    1   0    0  0  0  0  1   > 65를 2진수로 바꾼 것(64 1개, 1 1개)
// 2진수로 8진수는 3개씩 끊어서 똑같이 계산하기
// 01 000 001
//   1   0    1
// 2진수로 16진수는 4개씩 끊어서 똑같이 계산
// 0100 0001
//  4    1

// utf-8은 한 글자가 3byte [][][][][][][][] [][][][][][][][] [][][][][][][][]
// euc-kr은 한 글자가 2byte [][][][][][][][] [][][][][][][][]
// 그래서 ecu로 인코딩한 것을 utf-8로 디코딩하면 글자가 깨짐