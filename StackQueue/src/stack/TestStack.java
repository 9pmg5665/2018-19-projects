package stack;

public class TestStack {

	public static void main(String[] args) {
	    Object o;
	    ArrayStack<Integer> A = new ArrayStack<Integer>();
	    A.status("new ArrayStack<Integer> A", null);
	    A.push(7);
	    A.status("A.push(7)", null);
	    o = A.pop();
	    A.status("A.pop()", o);
	    A.push(9);
	    A.status("A.push(9)", null);
	    o = A.pop();
	    A.status("A.pop()", o);
	    ArrayStack<String> B = new ArrayStack<String>();
	    B.status("new ArrayStack<String> B", null);
	    B.push("Bob");
	    B.status("B.push(\"Bob\")", null);
	    B.push("Alice");
	    B.status("B.push(\"Alice\")", null);
	    o = B.pop();
	    B.status("B.pop()", o);
	    B.push("Eve");
	    B.status("B.push(\"Eve\")", null);
	  }

}
