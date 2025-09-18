//INSERTION CODE
public class SinglyLL{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
        this.data=data;
        this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
//Add First
    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
//Add Last
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
//add middle

    public void addmiddle(int idx, int data){
        if(idx==0){
            addfirst(data);
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //print function
    public void print(){
        if(head==null){
            System.out.println("empty ll");
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        SinglyLL ll=new SinglyLL();
        ll.addfirst(2);
        ll.addLast(3);
        ll.addLast(5);
        ll.addfirst(7);
        ll.print();
        ll.addmiddle(1, 1000);
        ll.print();
    }
}



