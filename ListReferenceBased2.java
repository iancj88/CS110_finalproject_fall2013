import java.util.*;
public class ListReferenceBased2 implements ListInterface {

	private Node header;
	private Node currNode;
	private Node prevNode;
	
	private int nodeCount;
	
	public ListReferenceBased2() {
		header = null;
		nodeCount = 0;
	}
	
	public void add(int index, Object obj) {
	
		Node newNode = new Node(obj);

		//case where list is empty
		if(header == null) {
			header = newNode;
		}
		//case where new Node is placed at end of list
		else if(index > this.size() && header != null) {
			currNode = header;
			
			for(int i = 0; i <= index; i++) {
				if (i==index) {
					
				}
				prevNode = currNode;
				currNode = currNode.getNext();
				
			}
			currNode.setNext(newNode);
			System.out.println("put new Node at end of list");
		}
		
		//case where new Node is placed at end of list
		else if(index > this.size() && header != null) {
			currNode = header;
			while (currNode.getNext() != null) {
				prevNode = currNode;
				currNode = currNode.getNext();
			}
			currNode.setNext(newNode);
			System.out.println("put new Node at end of list");
		}
		

		
		//case where new Node is place at point not at end of list
		else {
			for(int i = 0; i < index; i++) {
				System.out.println("put new Node in List");
			}
		
		}
		
		nodeCount++;
		System.out.println("nodeCount:" + nodeCount);
		
	}
	
	public int size() {
		return nodeCount;
	}
	
	public boolean isEmpty() {
		return nodeCount == 0;
	}
	
	public Object get(int index) {
		Object returnObj = null;
		for(int i = 0; i <= index; i++) {
			if(i<index-1)
				currNode = currNode.getNext();
			if(i==index)
				returnObj = currNode.getItem();
		}
		return returnObj;
	}
	
	public void remove(int index) {
		nodeCount--;
	}
	
	public void removeAll() {
		nodeCount = 0;
		header = null;
	}
	
}