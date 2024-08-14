package Tries;

public class TrieUse {

	public static void main(String[] args) {
		
		Trie t = new Trie();
		
	
		t.add("NOTE");
		t.add("AND");
		t.add("NOT");
		t.add("no");
		t.remove("No");
		
		System.out.println(t.search("NO"));

	}

}
