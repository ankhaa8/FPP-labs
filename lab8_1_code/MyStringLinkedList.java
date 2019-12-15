package lab8_1_code;

public class MyStringLinkedList{

	Node header;

	MyStringLinkedList() {
		header = new Node(null, null, null);
	}
	
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
	
	public boolean isEmpty() {
		if(header.next == null) return true;
		return false;
	}
	
	private void addLast(String string) {
		if (isEmpty()) {
			Node n = new Node(null,string, null);
			header.next = n; 
			return;
		} else {			
			Node d = header.next;
			while (d.next != null)	d = d.next;
			Node n = new Node(d, string, null);			
			d.next = n;			
		}		
	}	
	public void addFirst(String s) {
		if (isEmpty()) {
			Node n = new Node(null, s, null);			
			header.next = n;	
			return; 
		} 
		Node n = new Node(null , s, header.next);
		header.next.previous = n;
		header.next = n;		
	}
	
	public String toString() {
		if(isEmpty()) return null;
		StringBuffer sb = new StringBuffer();
		Node curr = header.next;
		while (curr != null) {			
			sb.append(curr.value + "-> ");
			curr = curr.next;
		}
		return sb.toString();
	}
	
	public String reserve() {
		if(isEmpty()) return null;
		StringBuffer sb = new StringBuffer();
		Node curr = header.next;
		while (curr.next != null) {			
			curr = curr.next;
		}
		
		while (curr!= null) {	
			sb.append(curr.value);
			sb.append("<- ");
			curr = curr.previous;
		}
		return sb.toString();
	}
	
	public Object findFirst() {
		if(isEmpty()) return null;		
		//System.out.println(header.next.value);
		return header.next;		
	}
	
	public Object findLast() {
		if(isEmpty()) return null;		
		Node current = header.next;
		while(current.next != null) current = current.next;
		//System.out.println(current.value);
		return current;
		
	}
	public boolean find(Object s) {
		if(isEmpty()) return false;
		Node current = header.next;
		Node node = (Node) s;
		while(current != null) {
			if(current.value.equals(node.value)) return true;
			current = current.next;
		}
		return false;
	}
	
	public Object/*Node*/ get(int index) {
		if(isEmpty()) return null;
		if(size()<index && index<0) return -1;
		
		int count = 0;			
		Node current = header.next;			
		while (current != null) {
			if(index == count) break;
			count++;
			current = current.next;
		}		
		return current;		
	}
	
	public void add(int index, Object element) {
		Node node = (Node) element;
		if(this.size() == index) { addLast(node.value); return;}
		if(index == 0) { addFirst(node.value); return; }
		
		if (this.size() > index && index > 0) {
			int count = 0;			
			Node current = header.next;			
			while (current != null) {
				if(index == count) break;
				count++;
				current = current.next;
			}
			
			node.previous = current.previous;
			node.next = current;
			current.previous.next = node;
			current.previous = node;
			return;
		}		
	}
	
	public Object removeFirst() {
		if(isEmpty()) return null;
		
		Node node = header.next;
		Node current = header.next;
		current = current.next;
		current.previous = null;
		header.next = current;
		
		return node;
	}
	
	public Object removeLast() {
		if(isEmpty()) return null;
		
		Node current = header.next;
		while(current.next!=null) {			
			current = current.next;
		}		
		current.previous.next = null;
		return current;
	}
	
	public int findIndex(Object s) {
		if(isEmpty()) return -1;
		
		int count = 0;			
		Node current = header.next;	
		Node node = (Node) s;
		while (current != null) {
			if(current.value.equals(node.value)) return count;
			count++;
			current = current.next;
		}	
		return -1;
	}
	
	public boolean remove(int index) {
		if(isEmpty()) return false;
		
		if(size()<index && index<0) return false;
		
		if(size() == index) { removeLast();return true;}
		
		if(index == 0) {removeFirst(); return true;}
		
		int count = 0;			
		Node current = header.next;			
		while (current != null) {
			if(index == count) break;
			count++;
			current = current.next;
		}
		current.previous.next = current.next;
		current.next.previous = current.previous;
		
		return true;		
	}
	
	public boolean remove(Object element) {
		if(isEmpty()) return false;
		
		Node current = header.next;
		Node node = (Node) element;
		while(current != null) {
			if(current.value.equals(node.value)) {
				if(current.next == null) removeLast();
				else if(current.previous == null) removeFirst();
				else {
					current.previous.next = current.next;
					current.next.previous = current.previous;
				}
				return true;
			}
			current = current.next;
		}				
		return false;
	}
	
	public Object findMin(){
		if(isEmpty()) return null;
		
		Node current = header.next;
		Node node = new Node(null,current.value,current.next);
		
		while(current.next != null) {			
			current = current.next;
			if(node.value.compareTo(current.value)>0) {
				node.value = current.value;
				node.previous = current.previous;
				node.next = current.next;
			}
		}
		return node;		
	}
	
	public Object findMax(){
		if(isEmpty()) return null;
		
		Node current = header.next;
		Node node = new Node(null,current.value,current.next);
		
		while(current.next!=null) {			
			current = current.next;
			if(node.value.compareTo(current.value)<0) {
				node.value = current.value;
				node.previous = current.previous;
				node.next = current.next;
			} 
		}
		return node;		
	}
	
	public void sort() {		
		for (Node i = header.next; i!=null; i = i.next) {		
			for (Node j = i.next; j!=null; j = j.next) {
				if(i.value.compareTo(j.value)>0) {
					String tmp = i.value;
					i.value = j.value;
					j.value = tmp;					
				}				
			}			
		}
	}
	
	public String recurMax() {				
		return maxR(header.next.value, header.next);
	}
	
	public String maxR(String str, Node current) {
		if(isEmpty()) return null;
		
		if (current.next == null) return current.value.compareTo(str)>0?current.value:str;		
		
		if(str.compareTo(current.next.value)>0) return maxR(str,current.next);		
		
		return maxR(current.next.value, current.next);
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

	public static void main(String[] args) {
		MyStringLinkedList list = new MyStringLinkedList();
		
		System.out.println("addLast():");
		list.addLast("Bob");
		list.addLast("Steve");
		list.addLast("Harry");		
		System.out.println(list+"\n");
		
		System.out.println("addFirst():");
		list.addFirst("John");
		list.addFirst("Tom");
		System.out.println(list+"\n");
		
		System.out.println("add(index = 3, Object node(null, Smith, null)):");
		MyStringLinkedList.Node node = list.new Node(null,"Smith",null);
		list.add(3,node);
		System.out.println(list+"\n"); 
		
		System.out.println("recurMax():");
		System.out.println(list.recurMax());
		
		System.out.println("remove(Object node(null, Smith, null)):");
		list.remove(node);
		System.out.println(list+"\n");
		
		System.out.println("findIndex(Object node(null, Bob, null)):");
		MyStringLinkedList.Node nn = list.new Node(null,"Bob",null);
		System.out.println(list.findIndex(nn)+"\n");
		
		System.out.println("find(Object node(null, Bob, null)):");
		System.out.println(list.find(nn)+"\n");
		
		System.out.println("findMin():");
		System.out.println("List: "+list);
		Node fmin = (Node) list.findMin();
		System.out.println(fmin.value+"\n");
		
		System.out.println("findMax():");
		System.out.println("List: "+list);
		Node fmax = (Node) list.findMax();
		System.out.println(fmax.value+"\n");
		
		System.out.println("findFirst():");
		System.out.println("List: "+list);
		Node first = (Node) list.findFirst();
		System.out.println(first.value+"\n");
		
		System.out.println("findLast():");
		System.out.println("List: "+list);
		Node last = (Node) list.findLast();
		System.out.println(last.value+"\n");
		
		System.out.println("Reserve():");
		System.out.println("List: "+list);
		System.out.println(list.reserve()+"\n");
		
		System.out.println("removeLast():");
		System.out.println("List: "+list);
		Node remNode = (Node) list.removeLast();
		System.out.println("Removed element: "+remNode.value);
		System.out.println("List: "+list+"\n");
		
		System.out.println("sort():");
		list.sort();
		System.out.println(list+"\n");
		
		System.out.println("removeFirst():");
		System.out.println("List: "+list);
		Node remFNode = (Node) list.removeFirst();
		System.out.println("Removed element: "+remFNode.value);
		System.out.println("List: "+list+"\n");
		list.removeFirst();
		
		//
		//
		//
		//System.out.println(list);
		
		
		
		

	}

	
}
