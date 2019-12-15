package lab8_2_code;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node(null, null, null);
	}

	public void add(String item) {

		Node first = header.next;

		if (first == null) {
			Node n = new Node(header, item, null);
			header.next = n;

		} else {
			Node n = new Node(header, item, first);
			header.next = n;
			first.previous = n;

		}

	}

	void insert(String data, int pos) {
		Node current = getNode(pos);
		Node node = new Node(current.previous, data, current);
		
		current.previous.next = node;
		current.previous = node;
	}

	public void sort() {
		if(header.next == null || size() <=1) return;
		for(Node i = header.next; i != null; i=i.next){
			Node nextMinPos = minNode(i);
			swap(i,nextMinPos);
		}
	}

	void swap(Node n1, Node n2) {
		Node tmp = new Node(null, n1.value, null);
		n1.value = n2.value;
		n2.value = tmp.value;		
	}

	public Node minNode(Node n) {
		Node m = n;		
		for(Node i = n.next; i != null; i = i.next){
			if(i.value.compareTo(m.value)<0){
				m = i;				
			}
		}
		return m;
	}

	public Node getNode(int pos) {
		if (pos > size())
			throw new IndexOutOfBoundsException();
		Node curr = header.next;
		for (int i = 0; i < pos; i++) {
			curr = curr.next;
		}
		return curr;
	}


	public int size() {
		int count = 0;
		Node curr = header.next;

		while (curr != null) {
			count++;
			curr = curr.next;
		}

		return count;
	}

	public String toString() {
		String result = "";
		Node curr = header.next;

		while (curr != null) {
			result += curr.value + "-> ";
			curr = curr.next;
		}

		return result;
	}

	class Node {
		Node previous;
		String value;
		Node next;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}
	}

}
