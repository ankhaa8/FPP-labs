package lab8_0_MySinglyLinkedList;

public interface MyLinkedList {

	public boolean IsEmpty();
	public void addFirst(String s);
	public void addLast(String s);
	public String toString();
	public int size();
	public boolean search(String s);
	public void insert(String data, int pos);
	public boolean remove(String s);

}
