class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val) {
        this.val = val;
    }
}

class DLL {
    ListNode head;
    ListNode tail;
    int size;
    void insertAtHead(int val){
        ListNode temp=new ListNode(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }
    
    void insertAtTail(int val) {
        ListNode temp = new ListNode(val);
        if (head == null)
            head = tail = temp;
        else {
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }
    void display(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    void displayReverse() {
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}

public class DoublyLinkedListClass {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.display();
        list.insertAtTail(40);
        list.display();
        list.displayReverse();
        // list.deleteAtHead();
        // list.deleteAtTail();
        // list.display();
    }
}