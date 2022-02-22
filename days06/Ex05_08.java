package days06;

public class Ex05_08 {

	public static void main(String[] args) {
		// [8번 문제]
		// ____*
		// ___*
		// __*
		// _*
		// *
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(i+j == 6) {
					System.out.print("*");
				} else {
					System.out.print("_");
				}
			} 
			System.out.println();
		}


		

	}

}
