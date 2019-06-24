package come.revature.datastructures;

import javax.xml.soap.Node;

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
		
		if(currentNode != null && currentNode.getData() != null && currentNode.getData().equals(key)) {
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
	
	public void removeDuplicates() {
		
		Node<T> currentNode = this.head;
		Node<T> tempNode;
		T currentValue = null;
		
		
		
		
		if(currentNode != null) {
			currentValue = currentNode.getData();
			System.out.println("at beginning of list, initial value = "+currentValue);
			
			do {
				System.out.println("beginning outer loop iteration");
				// dont need to re-check earlier nodes in the list
				
				tempNode = currentNode;
				
				while(tempNode != null && currentNode.getNextNode() != null) {
					
					T nextValue = tempNode.getNextNode().getData();
//					System.out.println(
							);
				}
				
				System.out.println("moving to currentNode to next node");
				if (currentNode.getNextNode() != null) {
					System.out.println("no more duplicates of " + currentValue + "left");
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
					this.printList();
					System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
					currentValue = currentValue.getNextNode.getNextNode().getData();
					currentNode = currentNode.getNextNode();
				
			}while(currentValue != null && currentNode.getNextNode() != null);
			// exit iteration if current node's value is null or there is no next node
			// note: a refinement would be to scrub out or skip all nodes with null values
			}
		}
	}
	
}
