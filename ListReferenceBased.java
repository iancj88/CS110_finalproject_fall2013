
public class ListReferenceBased implements ListInterface {
	private Node curr_node;
	private Node prev_node;
	private Node inpt_node;
	private Node head_node;
	private int node_count;


	// default constructor
	public ListReferenceBased() {
		head_node = null;
		node_count = 0;
	}


	//add Object at desired index position
	public void add(int index, Object obj) {

		inpt_node = new Node(obj);
		
		if (head_node == null) {
			head_node = inpt_node;
			node_count = 1;
			return;
		}
		
		//check to make sure inpt and head nodes are not null:
		if (inpt_node == null || head_node == null) {
			System.out.println("Cannot add null value nodes");
			return;
		}
		//iterate through each node until reaching the desired index
		//set index - 1 node reference to new node, and node currently holding 
		curr_node = head_node;
		
		for (int i = 1; i <= index; i++) {
			prev_node = curr_node;
			if(curr_node.getNext() != null)
				curr_node = curr_node.getNext();
			
			if (i == index) {h
												//do not attempt setNext method with a null value
				inpt_node.setNext(curr_node);	//set reference new node to previously referenced node
				prev_node.setNext(inpt_node);		//re-reference preceeding node to new node
				node_count++;
				return;
			}

		}
	}
	
	//return item held by argument index node
	public Object get(int index) {
	
		if ( this.isEmpty()) {
			System.out.println("List Empty");
			return null;
		}
		curr_node = head_node;
		//System.out.println("curr_node item:" + curr_node.getItem();
		for(int i = 0; i < index; i++) {
			if(i == index -1)
				return curr_node.getItem();
			curr_node = curr_node.getNext();
		}
		return null;
	}
	
	//remove the node at the index argument
	public void remove(int index) {
	
		curr_node = head_node;
		for (int i = 0; i < index; i++) {
			if (i == index - 2)
				prev_node = curr_node;
			else if (i == index -1) {
				prev_node.setNext(curr_node.getNext());		//de-reference node at index
				node_count--;
				return;
			}
			curr_node = curr_node.getNext();
		}
	}
	
	//method to determine if list is empty
	public boolean isEmpty() {
		return head_node == null;
	}
	
	//method returns size (number of items) held in array
	public int size() {
		return node_count;
	}
	
	//method to remove all items from list;
	public void removeAll() {
		head_node = null;
		node_count = 0;
	}
	
	
}