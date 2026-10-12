package Stacks;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

class MyStack{
    Node head;
    int len;

    int peek() throws Exception{
        if(len==0){
            throw new Exception("Stack Underflow Errors");
        }
       else{ 
        return head.val;
    }
    }
    int pop() throws Exception{
        if(len==0){ 
            throw new Exception("Stack Underflow Errors");
        }
       else{
        int temp=head.val;
        head=head.next;
        len--;
        return temp;
    }
}
       void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println();
       
    }


    void push(int info){
        Node temp=new Node(info);
        if(len==0) head=temp;
        else{
            temp.next = head;
            head = temp;
        }
        len++;
        
    }
}

public class LLImplentationOfStack {
    public static void main(String[] args)throws Exception {
        MyStack st=new MyStack();
        // st.pop();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();

        st.pop();
        st.display();


    }
}
