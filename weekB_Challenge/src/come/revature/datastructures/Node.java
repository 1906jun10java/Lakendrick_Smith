package come.revature.datastructures;

public class Node<T> {
	/*
	 * 
	 * 
	 * This class will represent an element in our LinkedList impelementation.
	 * This the generic placeholder for the datatype of the object contained in each element.
	 */
	
	private Node<T> nextNode; //reference to next element of the list
	private T data;    //actual object in the currrent element
	
	public Node<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	

}
