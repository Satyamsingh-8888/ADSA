//deletion
public class singlyLLdelete{
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
    int size;

    public void addfirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
//remove first
    public int removefirst(){
        if(size==0){
            System.out.println("empty ll");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            
            return val;
        }
        int val=head.data;
        head=head.next;
        return val;
    }
//remove last

    public int removelast(){
        if(size==0){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        Node prev=head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        return val;
        
    }

    //remove from index
    public int deleteindx(int idx){
        if(idx<0 || idx>=size){
            System.out.println("invalid");
            return Integer.MIN_VALUE;
        }
        if(idx==0){
            return removefirst();
        }
        if(idx==size-1){
            return removelast();
        }
        Node prev=head;
        for(int i=0; i<idx-1; i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=prev.next.next;
        return val;
    }

    public void print(){
        if(head==null){
            System.out.println("empty ll");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        singlyLLdelete ll=new singlyLLdelete();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addfirst(9);
        ll.addfirst(78);
        ll.print();
        ll.deleteindx(2);
        ll.print();
    }
}