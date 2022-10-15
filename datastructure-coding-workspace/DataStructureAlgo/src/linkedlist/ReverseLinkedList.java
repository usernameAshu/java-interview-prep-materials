package linkedlist;

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		
		Node<Integer> node6 = new Node<>(299, null);
		Node<Integer> node5 = new Node<>(105, node6);
		Node<Integer> node4 = new Node<>(201, node5);
		Node<Integer> node3 = new Node<>(103, node4);
		Node<Integer> node2 = new Node<>(101, node3);
		Node<Integer> node1 = new Node<>(200, node2);
		
		System.out.println("\n-----Before reversing----");
		traverse(node1);
		
		//Sliding Node approach 
		Node<Integer> p = node1;
		Node<Integer> q = null, r = null;
		
		while( p!= null) {
			r = q;
			q = p;
			p = p.next;
			q.next = r;
		}
		
		System.out.println("\n-----After reversing----");
		traverse(node6);
	}
	
	static void traverse(Node<Integer> first) {
		while(first != null) {
			System.out.print( first.data +"\t");
			first = first.next;
		}
	}

}
