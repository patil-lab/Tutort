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

	void setEnd() {
		flag = true;
	}

	boolean isEnd() {
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

		node.setEnd();
	}

	boolean search(String word) {
		Node node = root;
		for (int i = 0; i < word.length(); i++) {
			if (!node.containsKey(word.charAt(i))) {

				return false;
			}
			node = node.get(word.charAt(i));
		}

		return node.isEnd();


	}

	boolean startsWith(String prefix) {
		Node node = root;
		for (int i = 0; i < prefix.length(); i++) {
			if (!node.containsKey(prefix.charAt(i))) {
				return false;
			}
			node = node.get((prefix.charAt(i)));
		}
		return true;
	}
}
