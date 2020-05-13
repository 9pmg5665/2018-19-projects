package queue;

public class ArrayQueue<E> implements  Queue<E> {

	protected int n; 	// The actual capacity of the stack array
	public static final int CAPACITY = 1000;	// default array capacity
	protected E q[];		// Generic array used to implement the stack 
	protected int head =0, tail =0;
	public ArrayQueue() {
	    this(CAPACITY); // default capacity 
	  }
	  public ArrayQueue(int cap) {
	    n = cap;
	    q = (E[]) new Object[n]; // compiler may give warning, but this is ok
	  }
	public int size() {
		return (n- head +tail) % n;
	}
	@Override
	public boolean isEmpty() {
		return head==tail;
	}
	@Override
	public E front() throws EmptyQueueException {
		return null;
	}
	@Override
	public void enqueue(E element) {
		if (size() == n-1)
				throw new FullQueueException();
			else {
				q[tail] = element;
				tail = (tail +1) % n;
			}
	}
	@Override
	public E dequeue() throws EmptyQueueException {
		E obj=null;
		if (isEmpty())
			throw new EmptyQueueException();
		else {
			obj = q[head];
			head = (head +1) % n;
		}
		return obj;
	}	
	
//  Prints status information about a recent operation and the stack.
	  public void status(String op, Object element) {
	    System.out.print("------> " + op);   // print this operation
	    System.out.println(", returns " + element); // what was returned
	    System.out.print("result: size = " + size() + ", isEmpty = " + isEmpty());
	    System.out.println(", queue: " + this);       // contents of the stack
	  }
	  public String toString() {
		    String s;
		    s = "[";
		    if (size() > 0) s+= q[head];
		    if (size() > 1) {
		      for (int i= 1; i <= size()-1; i++) {
		    	  s += ", " + q[(head+i) %n];
		      }
		    }
		    return s + "]";
		  }
}
