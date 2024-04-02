package chapter14.collection.arraylist;

import java.util.ArrayList;

// 자료구조 : 큐 를 ArrayList 클래스로 구현란 예제.
// 큐 : First Input First Output(FIFO)
class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	//데이터 저장(추가)
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	// 데이터 꺼내오기
	public String deQueue() {
		int len = arrayQueue.size(); // 3
		if(len==0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return (arrayQueue.remove(0));
	}
}

//자료구조 : ArrayList클래스 이용하여, 스택을 구현한 예제
// 스택: Last Input First Output (LIFO)
public class QueueTest {

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}
