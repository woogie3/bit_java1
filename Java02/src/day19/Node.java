package day19;

public class Node<E> {//linkedList는 node기반
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
