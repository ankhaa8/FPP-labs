package lab9;


/**
 * For this problem, you will implement a stack of String, 
   using an array in the background.
 *
 */
public class ArrayStack {
	
	private static int INITIAL_LENGTH = 10;
	private int top;
	private String[] stackArray;
	
	public ArrayStack() {
		//implement
		top = 0;
		stackArray = new String[INITIAL_LENGTH];
    }
	
	private void resize() {
		String[] tmp = new String[INITIAL_LENGTH*2];
		System.arraycopy(stackArray, 0, tmp, 0, top);
		stackArray = tmp;
	}
	/** Pushes input onto the stack */
	public void push(String s) {
		// implement
		if(top == INITIAL_LENGTH) resize();
		stackArray[top++] = s;	

	}
	
	/** Pops the input from the stack */
	public String pop()  { // throws EmptyStackException {
		//implement
		if(isEmpty()) return null;
		String s = stackArray[top-1];		
		top--;
		return s;
	}
	
	/** Returns (but does not remove) the value at the top of the stack */
	public String peek() { // throws EmptyStackException {
		//implement		
		if(isEmpty()) return null;
		return stackArray[top-1];
		
	}
	
	/** Returns a string representation of this stack. The string
	 *  consists of all data values of the nodes in the stack, separated by spaces.
	 */
	@Override
	public String toString() {
		//implement
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i<top; i++) {
			sb.append(stackArray[i] + (top-1 == i?"":", "));
		}
		sb.append("]");
		return sb.toString();
	}
	
	/** Returns the number of elements in the stack */
	public int size() {		
		return top;
	}
	
	/** Returns true if there are no elements in the stack, false otherwise */
	public boolean isEmpty() {
		//implement
		return (top == 0) ;
	}

	/**
	 * It determines whether an String exists in the stack. 
	 * If the element is found, it returns the 1-based position of the element from the top of the stack. 
	 * Else, it returns -1.
	 * 
	 */
	public int search(String o) {
		//implement
		for(int i = 0; i<size(); i++)
			if(stackArray[i].equals(o)) return i;
        return -1;
    }
	
	private int lastIndexOf(String o) {
		//implement
		int pos = -1;
		for (int i = 0; i < top; i++) {
			if(stackArray[i].equals(o)){
				pos = i;
				break;
			}
		}
		return pos;
	}

	/* You may use this method to test your stack */
	public static void main(String[] args) {
		try {
			ArrayStack ns = new ArrayStack();
			ns.push("Bob");
			System.out.println(ns.size()+" " + ns);
			ns.push("Harry");
			System.out.println(ns.size()+" " + ns);
			ns.push("Steve");
			System.out.println(ns.size() +" "  + ns);
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println(ns.size()+" " + ns);
			ns.push("Bill");
			System.out.println(ns.size()+" " + ns);
	        System.out.println("Search() Operation : "  + ns.search("Bill"));

			System.out.println("Peek Operation : " + ns.peek());
			System.out.println(ns.size());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Empty stack : " + ns.isEmpty());

			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Empty stack : " + ns.isEmpty());

		} catch(Exception e) {
			System.out.println("Exception thrown of type " + e.getClass().getSimpleName());
		}
		
	}
}
