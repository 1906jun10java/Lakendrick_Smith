package come.revature.datastructures;

public class MyLinkedList<T> {
	
	public MyLinkedList() {
		
	}
	
	// root node of the list, the 'head'
	private Node<T> head;
	
	// end node of the list, the 'tail'
	private Node<T> tail;
	
	//insert a node at teh end of the list
	public void insert(T data) {
		
		//create a new Node for the data
		Node<T>newNode = new Node<>(null, data);
		
		if(this.head == null) {
		System.out.println("List is empty, adding first element");	
		this.head = newNode;
		this.tail = newNode;
		
		}
		// otherwise, we add this as the tail
		else {
			this.tail.setNextNode(newNode);
			this.tail = newNode;
			
		}
	}
	
	//remove and return the first item in the list
	public T poll() {
		Node<T> firstNode = this.head;
		if(firstNode != null) {
			this.head = firstNode.getNextNode();
			return this.head.getData();
		}
		return null;
	}
	
	// return bud do not remove the first item
	public T peek() {
		if (this.head != null) {
			
			return this.head.getData();
		}
		
		return null;
	}
	
	//remove first node whodse data matches provided key
	public boolean removeByKey(T key) {
		
		if (key == null) {
			return false;
		}
		Node<T> currentNode = this.head;
		
		
		Node<T> nextNode = currentNode.getNextNode();
		
		if(currentNode != null && currentNode.getData().equals(key)) {
			this.head = nextNode;
			return true;
		}
		
		while(currentNode != null) {
			
			// if nextNode is not null and matches the key,
			// point currentNode to the node after NextNode and return true
			
			if (nextNode != null && nextNode.getData().equals(key)) {
				currentNode.setNextNode(nextNode.getNextNode());
				return true;
			}
			
			//advance currentNode to the next node in the list
			currentNode = currentNode.getNextNode();
			
			// if nextNode is not null, advance next node to the one after it
			if(nextNode != null) {
				nextNode = nextNode.getNextNode();
			}
		}
		
		return false;
	}
	
	
	public void printList() {
		Node<T> currentNode = this.head;
		while(currentNode != null) {
			System.out.println("Node location: "+currentNode.hashCode()+", Node value: " + currentNode.getData());
			currentNode = currentNode.getNextNode();
		}
	}
}
