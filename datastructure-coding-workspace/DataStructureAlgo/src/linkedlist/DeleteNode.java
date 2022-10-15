package linkedlist;

public class DeleteNode {
	
	public static void main(String[] args) {
		
		Node<Integer> node6 = new Node<>(299, null);
		Node<Integer> node5 = new Node<>(105, node6);
		Node<Integer> node4 = new Node<>(201, node5);
		Node<Integer> node3 = new Node<>(103, node4);
		Node<Integer> node2 = new Node<>(101, node3);
		Node<Integer> node1 = new Node<>(200, node2);
		
		int deletePos = 4;
		
		traverse(node1);
		
		Node<Integer> p = node1;
		Node<Integer> q = null;
		int count = 1;
		
		while(p!=null) {
			if(deletePos == 1) {
				p.next = null;
				break;
			} else if(count == deletePos) {
				q.next = p.next;
				break;
			}
			p = p.next;
			count++;
		}
		
		traverse(node1);
	}
	
	static void traverse(Node<Integer> first) {
		while(first != null) {
			System.out.print( first.data +"\t");
			first = first.next;
		}
		System.out.println();
	}

}
