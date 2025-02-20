package stack;

/**
  * Implementation of the stack ADT using a fixed-length array.  An
  * exception is thrown if a push operation is attempted when the size
  * of the stack is equal to the length of the array.  This class
  * includes the main methods of the built-in class java.util.Stack.
  */
public class ArrayStack<E> implements Stack<E> {
  protected int capacity; 	// The actual capacity of the stack array
  public static final int CAPACITY = 1000;	// default array capacity
  protected E S[];		// Generic array used to implement the stack 
  protected int top = -1;	// index for the top of the stack
  public ArrayStack() {
    this(CAPACITY); // default capacity 
  }
  public ArrayStack(int cap) {
    capacity = cap;
    S = (E[]) new Object[capacity]; // compiler may give warning, but this is ok
  }
  public int size() { 
    return (top + 1);
  }
  public boolean isEmpty() {
    return (top < 0);
  }
  public void push(E element) {
    if (size() == capacity)
      throw new FullStackException("Stack is full.");
    S[++top] = element;
  }
  public E top() throws EmptyStackException {
    if (isEmpty())
      throw new EmptyStackException("Stack is empty.");
    return S[top];
    }
  public E pop() throws EmptyStackException {
    E element;
    if (isEmpty())
      throw new EmptyStackException("Stack is empty.");
    element = S[top];
    S[top--] = null; // dereference S[top] for garbage collection.
    return element;
  }
  public String toString() {
	    String s;
	    s = "[";
	    if (size() > 0) s+= S[0];
	    if (size() > 1)
	      for (int i = 1; i <= size()-1; i++) {
		s += ", " + S[i];
	      }
	    return s + "]";
	  }
	//  Prints status information about a recent operation and the stack.
	  public void status(String op, Object element) {
	    System.out.print("------> " + op);   // print this operation
	    System.out.println(", returns " + element); // what was returned
	    System.out.print("result: size = " + size() + ", isEmpty = " + isEmpty());
	    System.out.println(", stack: " + this);       // contents of the stack
	  }
	 /**
	  * Test our program by performing a series of operations on stacks,
	  * printing the operations performed, the returned elements and the
	  * contents of the stack involved, after each operation.
	  */
	  
	}