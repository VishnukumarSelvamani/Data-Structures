public class Single{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class LL{
        Node head=null;

        void insertbeg(int data){
            Node newnNode = new Node(data);
            newnNode.next=head;
            head=newnNode;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.err.print("null");
        } 
    }
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertbeg(3);
        ll.insertbeg(4);
        ll.insertbeg(5);
        ll.display();
    }
}