package lab8_0_MySinglyLinkedList;

public class MySinglyLinkedList {
	Node header = null; // contains no data, cannot be removed

	public MySinglyLinkedList() {
		header = new Node(null, null);
	}

	public boolean search(String s) {
		Node current = header.next;
		while (current != null) {
			if(s.equals(current.data)) return true;
			current = current.next;
		}		
		return false;
	}

	public void addFirst(String s) {
		if (header.next == null) {
			Node n = new Node(s, null);
			header.next = n;
			return; 
		} 
		Node n = new Node(s, header.next);
		header.next = n;
		
	}

	public void addLast(String s) {
		if (header.next == null) {
			Node n = new Node(s, null);
			header.next = n;
			return;
		} else {
			Node n = new Node(s, null);
			Node d = header.next;
			while (d.next != null)	d = d.next;
			d.next = n;
		}
	}

	public void insert(String s, int pos) {
		if(this.size()==pos) { addLast(s);return;}
		if(pos==0) {addFirst(s); return;}
		if (this.size()>pos && pos>0) {
			int count = 1;			
			Node current = header.next;
			while (current != null) {
				if(pos == count) break;
				count++;
				current = current.next;
			}
			Node node = new Node(s,current.next);
			current.next = node;	
			return;
		}
		else 
		System.out.println("unpossible to add" + this.size());
	}

	/** size = the number of non-null nodes */
	public int size() {
		if(isEmpty()) return -1;
		int count = 0;
		if (header.next == null) return count;
		Node d = header.next;
		while (d != null) {
			count++;
			d = d.next;
		}
		return count;
	}

	public void remove(String s) {
		
		if(isEmpty()) return;
		
		Node current = header.next;		
		if(current.data.equals(s)) {
			header.next = current.next;
			return;
		}
		while (current.next != null) {
			if(s.equals(current.next.data)) { 
				current.next = current.next.next; 
				break;
			}
			current = current.next;				
		}		
	}

	public boolean isEmpty() {
		if(header.next == null) return true;
		return false;
	}

	@Override
	public String toString() {
		if (header.next == null) return null;
		Node d = header.next;
		
		StringBuilder s = new StringBuilder();
		while (d != null) {
			s.append(d.data);
			s.append("->");
			d = d.next;
		}
		return s.toString();
	}

	/** Implement as inner class */
	private static class Node {
		String data;
		Node next;

		private Node(String value, Node n) {
			data = value;
			next = n;
		}
	}

	public static void main(String[] args) {

		MySinglyLinkedList listLast = new MySinglyLinkedList();
		listLast.addLast("Bob");
		listLast.addLast("Harry");
		listLast.addLast("Steve");
		listLast.addLast("Duke");
		System.out.println(listLast.size() + ": " + listLast);
		
		listLast.remove("Duke");
		System.out.println(listLast.size() + ": " +listLast);

		MySinglyLinkedList listFirst = new MySinglyLinkedList();
		listFirst.addFirst("Bob");
		listFirst.addFirst("Harry");
		listFirst.addFirst("Steve");
		listFirst.addFirst("Duke");
		
		System.out.println(listFirst.size() + ": " + listFirst);

		 listFirst.insert("John",0);
		 System.out.println(listFirst.size() + ": " +listFirst);
		 System.out.println(listFirst.search("John"));

	}
}
