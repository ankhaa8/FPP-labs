package lab4_4;

public class BinarySearchStr {
	public boolean search(String s, char c) { 		
		
		if(s == null || s.isEmpty()) return false;	
		
		if(s.length() == 1) return s.charAt(0) == c;
		
		int m = s.length()/2;	
		char ch = s.charAt(m);
		
		if(ch == c) return true;
		
		if(c < ch)
			return search(s.substring(0,m),c);
		
		return search(s.substring(m+1),c);						
	} 
	
	public String sort(String str) {
		
		char[] adjs = str.toCharArray();
		
		for (int i = 0; i < adjs.length; i++) {		
			for (int j = i+1; j < adjs.length; j++) {
				if(adjs[i]>adjs[j]) {
					char tmp = adjs[i];
					adjs[i] = adjs[j];
					adjs[j] = tmp;
				}				
			}
			
		}
		str = new String(adjs);
		//System.out.println(str.toString());
		return str;
	}
	
}
