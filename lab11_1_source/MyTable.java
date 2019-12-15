package lab11_1_source;

public class MyTable {
	
	private Entry[] entries;
	
	public MyTable() {
		entries = new Entry[26]; 
		
	}
	
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		//implement		
		int index = c - 97;
		if(0 > index && index >= 26) return null;
		if(entries[index].key == c) 
				return entries[index].value;
		
		return null;
	}
	
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		//implement
			
		int index = c - 97;
		if(0 > index && index >= 26) return;		
		
		
		entries[index] = new Entry(s,c); 
		
		//entries[index].value = s;

	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	
	public String toString() {
		//implement
		
		StringBuilder sb =  new StringBuilder();		
		for(int i = 0; i<26; i++) 
			if(entries[i] != null) sb.append(i +":"+ entries[i].key + "->" + entries[i].value+"\n");
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
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		t.add('w',"Wildcard");
		
		System.out.println(t);
		
		String s = t.get('b');
		System.out.println(s);
		
		
		
		
	}

}