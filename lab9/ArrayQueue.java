package lab9;


/**
 * For this problem, you will implement a queue of String, using an array in the background.
 *
 */
public class ArrayQueue {
	
	private final int INITIAL_LENGTH = 2;
	private String[] arr = new String[INITIAL_LENGTH];
	private int size = 0;
	private int front = -1;
	private int rear = 0;
	
	/** Retrieves, but does not remove, the element at the front/head of the queue. */
	public String peek() { // throws IllegalStateException
		if(isEmpty()) return null;
		return arr[front];
	}
	
	/** Retrieves and Remove: removes the element at the front/head of the queue. */
	public String dequeue()  { // throws IllegalStateException {
		//implement
		if(isEmpty()) return null;
		String str = arr[front];
		front++;
		size--;
		return str;
	}
	
	/** Insert: adds an element to the rear/end of the queue. */
	public void enqueue(String s) { 
		//implement
		if(isFull()) resize(); 
		//System.out.println(rear + ":" + size + s);
		if(front == -1) front ++;
		arr[rear] = s;
		size++;
		rear++;
		//System.out.println(front + ":" + rear + ":"+arr.length);
	}
	private void resize() {
		String[] tmp = new String[arr.length*2];
		
		//System.arraycopy(arr, 0, tmp, 0, size);		
		System.arraycopy(arr, front, tmp, 0, size);  
		rear = size; 
		front = 0;
		arr = tmp;
		//System.out.println(front + ":" + rear + ":"+arr.length);
	}

	private boolean isFull() {
		if(arr.length == rear) return true;
		return false;
	}
	/** Returns a string representation of this stack. The string
	 *  consists of all data values of the nodes in the stack, separated by spaces.
	 */
	@Override
	public String toString() {
		//implement
		if(isEmpty()) return null;
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = front ; i<rear; i++) {
			sb.append(arr[i] + (rear-1 == i?"":", "));
		}
		sb.append("]");
		return sb.toString();		
	}
	
	/** Returns the number of items in the queue */
	public int size() {
		//implement
		return size;
	}
	
	/** Returns true if there are no elements in the queue, false otherwise */
	public boolean isEmpty() {
		//implement
		if(size == 0) return true;
		return false;
	}

	/**
     * Removes all of the elements from this deque.
     * The deque will be empty after this call returns.
     */
	public void clear() {
		rear = 0;
		front = -1;
		size = 0;
		
		//for(String s: arr) dequeue();
	}

	/* You may use this method to test your stack */
	public static void main(String[] args) {
		try {
			ArrayQueue ns = new ArrayQueue();
			ns.enqueue("Bob");
			System.out.println(ns.size()+" " + ns);
			ns.enqueue("Harry");
			
			System.out.println(ns.size()+" " + ns);
			ns.enqueue("Steve");
			System.out.println(ns.size() +" "  + ns);
			System.out.println("Dequeue Operation : " + ns.dequeue());
			System.out.println("Dequeue Operation : " + ns.dequeue());
			System.out.println(ns.size()+" " + ns);
			ns.enqueue("Bill");
			ns.enqueue("Steve");ns.enqueue("Steve");ns.enqueue("Steve");ns.enqueue("Steve");ns.enqueue("Steve");
			System.out.println(ns.size()+" " + ns);
			
			ns.clear();
			System.out.println("After clear() Operation :" );
			System.out.println("Empty ArrayDeque : " + ns.isEmpty());
			

			System.out.println("Peek Operation : " + ns.peek());
			System.out.println(ns.size()+" " + ns);
			System.out.println("Dequeue Operation : " + ns.dequeue());
			System.out.println("Dequeue Operation : " + ns.dequeue());
			ns.enqueue("Bill");
			System.out.println("Empty ArrayDeque : " + ns.isEmpty());

			System.out.println("Dequeue Operation : " + ns.dequeue());

			
		} catch(Exception e) {
			System.out.println("Exception thrown of type " + e.getClass().getSimpleName());
		}
		
	}
}
