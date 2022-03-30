package days29;

/**
 * @author Yelin
 * @date 2022. 3. 30. - 오전 11:33:52
 * @subject 스레드 사용해보는 예제
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		
		// main 스레드(스레드는 기본적으로 1개 존재한다) == 독릭접으로 일하는 일꾼
		Thread t = Thread.currentThread(); // 현재 실행되고 있는 스레드를 가져오는 메서드
		String tName = t.getName(); // 스레드의 이름을 가져오는 메서드
		System.out.println(tName); // main
		
		// main 스레드보다 먼저 시키기 위해서 코딩을 위로 올림 - 독립적으로 스레드(일꾼)을 만들어서 장보기를 시키자
		Runnable target = new ShoppingWorker(); // Runnable로 선언해도 된다. 인터페이스를 구현했기 때문에
		// ShoppingWorker target = new ShoppingWorker();
		// target.run(); // 일을 할수는 있지만 독립적으로 일을 하지 않음, main 스레드의 일이 끝나야 실행되는듯?
		Thread 장보기일꾼 = new Thread(target);
		장보기일꾼.setName("shopping");
		장보기일꾼.start(); // start() 메서드를 선언하면 내부적으로 ShoppingWorker 클래스 안에 있는 run() 이라는 메서드를 호출되어진다.
		
		// 1) 방청소 - 내부적으로 main 스레드가 실행 중
		/*
		for (int i = 1; i <= 100; i++) {
			System.out.printf("> %s - 방청소 : %d%%\n", tName, i);
		} // for i
		*/
		
		// 1) 방청소 - 방청소일꾼이 청소중
		Thread 방청소일꾼 = new CleaningWorker("cleaning");
		// 방청소일꾼.setName("cleaning");
		방청소일꾼.start();
		
		// 2) 마트에서 장보기 - main 스레드(일꾼)은 1개이니까 방청소가 끝나고 마트에서 장을 보러가야함
		/*
		for (int i = 1; i <= 100; i++) {
			System.out.printf("> %s - 장보기 : %d%%\n", tName, i);
		} // for i
		*/
		
		/*
		// 2) 마트에서 장보기 - 독립적으로 스레드(일꾼)을 만들어서 장보기를 시키자
		Runnable target = new ShoppingWorker(); // Runnable로 선언해도 된다. 인터페이스를 구현했기 때문에
		// ShoppingWorker target = new ShoppingWorker();
		// target.run(); // 일을 할수는 있지만 독립적으로 일을 하지 않음, main 스레드의 일이 끝나야 실행되는듯?
		Thread 장보기일꾼 = new Thread(target);
		장보기일꾼.setName("shopping");
		장보기일꾼.start(); // start() 메서드를 선언하면 내부적으로 ShoppingWorker 클래스 안에 있는 run() 이라는 메서드를 호출되어진다.
		*/
		
		
		System.out.println("END");
		
	} // main - main 스레드가 종료된다 == 실행중인 프로그램 종료 == 프로세스 종료

} // class

// 청소하는 일꾼(== 스레드)
class CleaningWorker extends Thread{
	
	public CleaningWorker(String name) {
		super(name);
	}

	@Override
	public void run() {
		// run() 메서드 : 이 스레드가 독립적으로 해야될 일(기능)을 구현
		Thread t = Thread.currentThread(); 	// 현재 실행되고 있는 스레드를 가져오는 메서드
		String tName = t.getName(); 		// 스레드의 이름을 가져오는 메서드
		for (int i = 1; i <= 100; i++) {
			System.out.printf("> %s - 방청소 : %d%%\n", tName, i);
		} // for i
	} // run
} // CleaningWorker

// 장보기 일을 하는 일꾼(== 스레드)
class ShoppingWorker implements Runnable{

	@Override
	public void run() {
		// run() 메서드 : 이 스레드가 독립적으로 해야될 일(기능)을 구현
		Thread t = Thread.currentThread(); 	// 현재 실행되고 있는 스레드를 가져오는 메서드
		String tName = t.getName(); 		// 스레드의 이름을 가져오는 메서드
		for (int i = 1; i <= 100; i++) {
			System.out.printf("> %s - 장보기 : %d%%\n", tName, i);
		} // for i
	} // run
	
} // ShoppingWorker

/*
> main - 방청소 : 95%
> main - 방청소 : 96%
> main - 방청소 : 97%
> main - 방청소 : 98%
> main - 방청소 : 99%
> main - 방청소 : 100%
END                      --> main 스레드가 일을 끝내고, 장보기일꾼에게 일을 시키는 상황
> shopping - 장보기 : 1%
> shopping - 장보기 : 2%
> shopping - 장보기 : 3%
> shopping - 장보기 : 4%
> shopping - 장보기 : 5%
> shopping - 장보기 : 6%
*/