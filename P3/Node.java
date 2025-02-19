package P3;

public class Node {
	private int data;
	private Node next;
	
	//inisialisasi Node
	public Node(int data) {
		this.data = data;
	}
	
	//setter dan getter
	public void setData(int data) {
	        this.data = data;
	}
	 
	public int getData() {
	        return data;
    }
	
	public void setNext(Node next) {
	        this.next = next;
	}
	 
	public Node getNext() {
	        return next;
	}
}