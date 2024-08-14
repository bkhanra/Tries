package Tries;

public class Trie {
	
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode('\0');
	}
	
	private void addHelper(TrieNode root, String word) {
	    if (word.length() == 0) {
	        root.isTerminal = true;
	        return;
	    }
	    int childIndex = Character.toUpperCase(word.charAt(0)) - 'A';
	    TrieNode child = root.children[childIndex];

	    if (child == null) {
	        child = new TrieNode(Character.toUpperCase(word.charAt(0)));
	        root.children[childIndex] = child;
	        root.childCount++;
	    }

	    addHelper(child, word.substring(1));
	}

	
	public void add(String word) {		
		addHelper(root,word);		
	}
	
	private boolean searchHelper(TrieNode root, String word) {
	    if (word.length() == 0) {
	        return root.isTerminal;
	    }
	    int childIndex = Character.toUpperCase(word.charAt(0)) - 'A';
	    TrieNode child = root.children[childIndex];
	    if (child == null) {
	        return false;
	    } else {
	        return searchHelper(child, word.substring(1));
	    }
	}

	
	public boolean search(String word) {		
		return searchHelper(root,word);		
	}
	
	private void removeHelper(TrieNode root, String word) {
		if(word.length()==0) {
			root.isTerminal = false;
			return;
		}
		int childIndex = Character.toUpperCase(word.charAt(0)) - 'A';
		TrieNode child = root.children[childIndex];
	    if (child == null) {
	        return;
	    } else {
	    	removeHelper(child, word.substring(1));
	    }
		
	}
	
	public void remove(String word) {
		removeHelper(root,word);
	}

}
 