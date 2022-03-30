package days29;

/**
 * @author Yelin
 * @date 2022. 3. 30. - 오후 3:28:48
 * @subject 멀티스레드 [문제점만 파악] -> 해결은 동기화 처리 배울 때 다시!
 * @content
 * 
 * 		[***박예린***] -> 하나의 스레드가 작업을 마무리할 때까지 다른 스레드가 공유자원을 사용하지 못하도록 하는 작업을 [동기화처리]라고 한다.
 *						들어오지 말아야하는 공유자원 영역을 '임계영역'이라고 한다. -> 들어오지 못하게 잠금을 한다. == 동기화처리	
 *						
 *		화장실에 들어간 A가 죽었다.. 다른 사람이 사용 못한다.. -> 데드락
 *		
 *		A 못		B 망치
 *		둘 중에 하나를 줘야지 작업을 할 수 있는데.. 작업을 못하고 있는 상황.. -> 데드락
 *
 *		화장실에 대변기, 소변기, 세면대가 있는데... 
 *		대변기를 잠궈야되는데 화장실 전체를 잠그면 사용을 다 못함.. -> 어디를 잠금할건지 영역을 정하는 것을 '임계영역'
 *		
 * 
 */
public class Ex10 {

	public static void main(String[] args) {
		// 멀티스레드 [문제점만 파악] -> 해결은 동기화 처리 배울 때 다시!
		//   ㄴ 스레드가 2개 이상
		// 인쇄기는 1개라서 [공유자원]
		// 인쇄하는 사람은 5명[멀티스레드]
		// -> 멀티스레드가 공유자원을 사용할 때 문제발생
		
		PrintMachine machine = new PrintMachine();
		
		PrintWorker t1 = new PrintWorker("야리니", machine);
		PrintWorker t2 = new PrintWorker("백종원", machine);
		PrintWorker t3 = new PrintWorker("유재석", machine);
		PrintWorker t4 = new PrintWorker("문별이", machine);
		PrintWorker t5 = new PrintWorker("안혜진", machine);
		
		t1.start(); 
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		// [***박예린***] -> 하나의 스레드가 작업을 마무리할 때까지 다른 스레드가 공유자원을 사용하지 못하도록 하는 작업을 [동기화처리]라고 한다.
		
		
	} // main

} // class

// 프린트기가 하나의 인쇄 작업이 끝날 때 까지 기다려야 되는 것 - 동기화 처리
// 인쇄하는 일꾼(스레드)
class PrintWorker extends Thread{
	
	String content; // 인쇄할 내용물
	PrintMachine machine; // 인쇄기
	
	// 생성자 의존성 주입(DI)
	public PrintWorker(String content, PrintMachine machine) {
		super();
		this.content = content;
		this.machine = machine;
	} // 생성자
	
	@Override
	public void run() {
		this.machine.printContent(content); // 잠금 처리 되는데 이 작업은 동기화 배울 때 다시~
	} // run
	
} // PrintWorker

class PrintMachine{
	
	public void printContent(String content) { // "홍길동" 입력하면..
		// [***홍길동***] -> 이렇게 인쇄가 된다고 가정..
		try {
			System.out.print("[");
			Thread.sleep(500); // 프린트하다가 다른 스레드한테 갈 수도 있다.. 0.5초 일시정지(임의로 시간 정함.)
			System.out.print("***");
			Thread.sleep(500);
			
			for (int i = 0; i < content.length(); i++) {
				System.out.print(content.charAt(i));
				Thread.sleep(200);
			} // for i
			
			System.out.print("***");
			Thread.sleep(500);
			System.out.print("]");
			System.out.println(); // 개행
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // try
		
	} // printContent
	
} // PrintMachine