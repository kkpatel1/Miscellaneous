class Node {
	int data;
	Node next;
	public Node() {
		next=null;
	}
	public Node(int data) {
		this.data=data;
		next=null;
	}
}
class LinkedList {
	Node first;
	public LinkedList() {
		first = new Node();
	}
	boolean isEmpty() {
		return (first.data==0 && first.next==null);
	}
	int length() {
            if(isEmpty()) return 0;
            Node current=first;
            for(int i=1; ;i++) {
		if(current.next!=null)	current=current.next;
		else return i;
            }
	}

	LinkedList insert(int k, int data) {
		Node insertElement = new Node(data);
		Node current=first;
		if(isEmpty()) {
			first=insertElement;
			return this;
		}
		else {
			if(k==1) {
				insertElement.next=first;
				first=insertElement;
			}
			else {
				for(int i=1; i<k-1; i++) {
					current=current.next;
				}
				Node temp=current.next;
				insertElement.next=temp;
				current.next = insertElement;				
			}
			return this;
		}
	}
	void display() {
		Node current = first;
		if(!isEmpty()) {
			for(int i=0; current!=null; i++) {
				System.out.print(current.data+" ");
				current=current.next;
			}
		}
		System.out.println();
	}
}
public class partiallyReversal {
    static void partiallyReversalMethod(LinkedList A, int n) {
        LinkedList[] arr = new LinkedList[(A.length()/n)+1];
        Node current = A.first;
        Node temp = A.first;
        for(int j=0; j<arr.length; j++) {
            arr[j] = new LinkedList();
            arr[j].first=temp;
            current = temp;
            for(int i=1; i<n && current!=null; i++) {
                current=current.next;
            }
            if(current!=null) {
                temp = current.next;
                current.next=null;
            }            
        }
        for(int i=0; i<arr.length; i++) {
            completeReverse(arr[i]);
        }
        for(int i=0; i<arr.length-1; i++) {
            Node currentArr1 = arr[i].first;
            while(currentArr1.next!=null) {
                currentArr1=currentArr1.next;
            }
            currentArr1.next = arr[i+1].first;
        }
        A.first = arr[0].first;
    }
    static void completeReverse(LinkedList A) {
        Node current = A.first;
        Node prev=null;
        Node next;
        while(current!=null) {
            next=current.next;
            current.next = prev;
            prev=current;
            current=next;
        }
        A.first=prev;
    }
    public static void main(String[] args) {
        LinkedList A = new LinkedList();
        A.insert(1,1);
        A.insert(2,3);
        A.insert(3,6);
        A.insert(4,8);
        A.insert(5,9);
        A.insert(6,2);
        A.insert(7,10);
        A.insert(8,12);
        A.insert(8,11);
        A.insert(8,20);
        System.out.println("\nLinkedList A is");
        A.display();
        int n=3;
        partiallyReversalMethod(A,n);
        System.out.println("\nPartially Reversed Linked List of A with n="+n);
        A.display();
    }
}