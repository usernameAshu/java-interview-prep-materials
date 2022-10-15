package linkedlist.doubly;

class Node<E> {
	
	Node<E> prev;
	E data;
	Node<E> next;

	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}
	
	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

}

public class DoublyLinkedList {

	public static void main(String[] args) {

		Node<Integer> node6 = new Node<>(299, null);
		Node<Integer> node5 = new Node<>(105, node6);
		Node<Integer> node4 = new Node<>(201, node5);
		Node<Integer> node3 = new Node<>(103, node4);
		Node<Integer> node2 = new Node<>(101, node3);
		Node<Integer> node1 = new Node<>(200, node2);
		
		node1.prev = null;
		node2.prev = node1;
		node3.prev = node2;
		node4.prev = node3;
		node5.prev = node4;
		node6.prev = node5;
		
		
		Node<Integer> p = node1;
		Node<Integer> first = node1;
		Node<Integer> newNode = new Node<>(999, null);
		newNode.prev = null;
		int insertPos = 4;
		int initPos = 1;
		
		traverse(first);
		
		while(initPos < insertPos-1) {
			p = p.next;
			initPos++;
		}
		
		if(insertPos == 1) {
			first =  newNode;
		}
		
		newNode.next = p.next;
		newNode.prev = p;
		if(p.next != null) {
			p.next.prev = newNode;
		}
		p.next = newNode;
		
		traverse(first);
	}
	
	private static void traverse(Node<Integer> now) {
		// traversing a singly linked list
		while (now != null) {
			System.out.print(now.data+ "\t");
			now = now.next;
		}
		System.out.println();
	}
	
}
