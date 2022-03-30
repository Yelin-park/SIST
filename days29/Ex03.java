package days29;

/**
 * @author Yelin
 * @date 2022. 3. 30. - 오전 10:51:18
 * @subject p722 쓰레드(thread)
 * @content		
 * 				1. 프로세스(process)
 * 					작업관리자에서 확인 가능
 * 					- OS(운영체제)로부터 실행에 필요한 자원(메모리, CPU, 전력, 디스크 등)을 할당받아서 실행중인 프로그램을 '프로세스'라고 한다.
 * 						calc.exe 실행파일 -> 실행 -> 실행중인 프로그램 == 프로세스1
 * 						calc.exe 실행파일 -> 실행 -> 실행중인 프로그램 == 프로세스2
 * 					
 * 				2. 스레드(Thread)
 * 					작업관리자 - 성능 - 리소스모니터 - CPU 탭 - 스레드 확인 가능
 * 					- 프로세스 내에서 독립적으로 실행되는 메서드(기능)
 * 					- 최소한 기본 1개의 스레드는 가지고 있다 == main 스레드
 * 					- 여러 개의 스레드(멀티 스레드)가 존재할 수 있다.
 * 
 * 				3. 멀티 스레드와 멀티 태스킹
 * 					ㄴ 멀티 스레드 : 여러 개의 스레드 -- OS가 자동으로 관리 
 * 					ㄴ 멀티 태스킹 : 여러 개의 프로세스
 * 
 * 				4. CPU(중앙처리장치)는 시분할(시간을 분할)해서 멀티 태스킹을 하고 있다. -- OS가 자동으로 관리
 * 					ㄴ 시분할 하는데 너무 빨라서 우리 눈에는 동시에 처리하는 것처럼 보여짐
 * 					멀티 태스킹(멀티 스레드)은 'OS' 자동 관리하기 때문에 개발자가 스레드 처리하기 어렵다.
 * 				
 * 				5. 자바에서는 스레드를 어떻게 사용하는 방법(구현) 2가지
 * 					1) Runnable 인터페이스를 구현한 클래스 생성
 * 					2) Thread 클래스 사용
 * 
 * 
 */
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} // main

} // class
