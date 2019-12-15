package lab9_4_startup;


public class NodeQueue {
	/* stores the element at the front of the queue, if it exists */
	private Node head;
	
	/* stores the element at the end of the queue, if it exists */
	private Node tail;
	
	public NodeQueue() {
		head = new Node();
		tail = new Node();
	}
	/**
	 * Inserts a new node containing s at end of queue
	 */
	public void enqueue(String s) {
		//implement
		if (head.next == null) {
			Node n = new Node();
			n.data = s;
			head.next = n;
			tail.next = n;
			return;
		} else {
			Node node = new Node();
			node.data = s;			
			Node d = tail.next;			
			d.next = node;
			tail.next = node;
		}
	}	
	/**
	 * Removes node from the front of the queue and returns its value if
	 * head is n
	 */
	public String dequeue() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		Node node = head.next;
		head.next = node.next;
		return node.data;
	}	
	/**
	 * Returns value stored at the front of the queue
	 * @return
	 * @throws QueueException
	 */
	public String peek() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		
		return head.next.data;
	}
	public boolean isEmpty() {
		return head.next == null;
	}
	@Override
	public String toString() {
		if(isEmpty()) return "<empty queue>";
		return head.toString();
	}
}


