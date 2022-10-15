package linkedlist;

class Node<E> {
	E data;
	Node<E> next;

	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}

public class LinkedListMain {

	public static void main(String[] args) {

		Node<Integer> node6 = new Node<>(299, null);
		Node<Integer> node5 = new Node<>(105, node6);
		Node<Integer> node4 = new Node<>(201, node5);
		Node<Integer> node3 = new Node<>(103, node4);
		Node<Integer> node2 = new Node<>(101, node3);
		Node<Integer> node1 = new Node<>(200, node2);

		System.out.println("--------------Traversing Linked list-----------------");
		traverse(node1);

		System.out.println("--------------Max element in Linked list-----------------");
		max(node1);

		
		System.out.println("--------------Searching in Linked list-----------------");
		int search = 211;
		String result = search(node1, search);
		System.out.println(result);

		System.out.println("--------------Inserting in Linked list-----------------");
		insertNode(node1);
	}

	private static void insertNode(Node<Integer> node1) {
		// insert a new node
		Node<Integer> newNode = new Node(999, null);
		int insertPos = 4;
		Node<Integer> presentNode = node1;
		int countPos = 1;
		while (countPos < insertPos - 1) {
			presentNode = presentNode.next;
			countPos++;
		}
		System.out.println("New Node inserts after: " + presentNode.data);
		newNode.next = presentNode.next;
		presentNode.next = newNode;
		traverse(node1);
	}

	private static String search(Node<Integer> now, int search) {
		// Searching in LinkedList
		while (now != null) {
			if (now.data == search)
				return "present";

			now = now.next;
		}
		return "absent";
	}

	private static void max(Node<Integer> now) {
		// max element
		int max = 0;
		while (now != null) {
			if (max < now.data)
				max = now.data;

			now = now.next;
		}
		System.out.println("Max: " + max);
	}

	private static void traverse(Node<Integer> now) {
		// traversing a singly linked list
		while (now != null) {
			System.out.println(now.data);
			now = now.next;
		}
	}

}
