package Examples;

class Node {
	Node links[] = new Node[26];
	boolean flag = false;

	public Node() {

	}

	boolean containsKey(Character c) {
		return links[c - 'a'] != null;
	}

	void put(Character c, Node node) {
		links[c - 'a'] = node;
	}

	Node get(Character c) {
		return links[c - 'a'];
	}

	void seEnd() {
		flag = true;
	}

	boolean getEnd() {
		return flag;
	}

}

public class Trie {
	private static Node root;

	void insert(String word) {
		Node node = new Node();
		for (int i = 0; i < word.length(); i++) {

			if (!node.containsKey(word.charAt(i))) {

				node.put(word.charAt(i), new Node());
			}

			node.get(word.charAt(i));
		}
	}
}
