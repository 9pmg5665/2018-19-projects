package queue;

public class TestQueue {

	public static void main(String[] args) {
		Object o;
	    ArrayQueue<Integer> A = new ArrayQueue<Integer>();
	    A.status("new ArrayQueue<Integer> A", null);
	    A.enqueue(7);
	    A.status("A.enqueue(7)", null);
	    o = A.dequeue();
	    A.status("A.dequeue()", o);
	    A.enqueue(9);
	    A.status("A.enqueue(9)", null);
	    o = A.dequeue();
	    A.status("A.dequeue()", o);
	    
	    ArrayQueue<String> B = new ArrayQueue<String>();
	    B.status("new ArrayQueue<String> B", null);
	    B.enqueue("Bob");
	    B.status("B.enqueue(\"Bob\")", null);
	    B.enqueue("Alice");
	    B.status("B.enqueue(\"Alice\")", null);
	    o = B.dequeue();
	    B.status("B.dequeue()", o);
	    B.enqueue("Eve");
	    B.status("B.enqueue(\"Eve\")", null);

	}

}
