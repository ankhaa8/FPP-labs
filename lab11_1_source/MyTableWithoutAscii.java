package lab11_1_source;

public class MyTableWithoutAscii {
	
	private static int size;
	private Entry[] entries;
	
	public MyTableWithoutAscii() {
		entries = new Entry[26]; 
		size = 0;
	}
	
	public void resize() {
		Entry[] tmp = new Entry[size*2];
		System.arraycopy(entries, 0, tmp, 0, size);
		entries = tmp;
	}
	//returns the String that is matched with char c in the table
	public String get(char c){
		//implement
		
		for(int i=0; i<size; i++) {
			if(entries[i].key == c) return entries[i].value;
		}
		return null;
	}
	
	public int getEntryIndex(char c) {
		for(int i=0; i<size; i++) {
			if(entries[i].key == c) return i;
		}
		return -1;
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		//implement
		if(size == entries.length) resize();
		
		if(get(c) == null) { 
			entries[size] = new Entry(s,c); 
			size++; 
		}
		
		int index = getEntryIndex(c);
		if(index != -1) entries[index].value = s;

	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		//implement
		if(size == 0) return null;
		StringBuilder sb =  new StringBuilder();		
		for(int i=0; i<size; i++) 
			sb.append(entries[i].key + "->" + entries[i].value+"\n");
		return sb.toString();
	}
	
	
	private class Entry {
		 char key;
		 String value;
		
		Entry(String str, char ch){
			key = ch;
			value = str;
		}
		
		
		//returns a String of the form "ch->str" 
		public String toString() {
			return key + "->" + value;
		}
	}
	
	public static void main(String[] args){
		//System.out.print("%d%c"+'A'+'A');
		MyTableWithoutAscii t = new MyTableWithoutAscii();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		t.add('w',"Wildcard");
		
		System.out.println(t);
		
		String s = t.get('b');
		System.out.println(s);
		int a = 'A';
		System.out.println(a);
		
		
		
	}

}