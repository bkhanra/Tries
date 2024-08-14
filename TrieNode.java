package Tries;

public class TrieNode {
	
	char data;
	boolean isTerminal;
	TrieNode[] children;
	int childCount;
	
	public TrieNode(char data) {
	    this.data = Character.toUpperCase(data);
	    this.isTerminal = false;
	    this.children = new TrieNode[26];
	    childCount = 0;
	}

	

}
