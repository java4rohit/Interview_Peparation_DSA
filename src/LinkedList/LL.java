package LinkedList;

public class LL {
    ListNode head;
    public class ListNode{
        int data;
       ListNode next;
        public ListNode(int data){
            this.data =data;
            this.next=null;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public void addFirst(int val){

        ListNode newNode = new ListNode(val);

        if(head == null){
           head = newNode;
           return;
        }
        newNode.next=head;
        head=newNode;
        return;
    }

    public void addLast(int val){

        ListNode newNode = new ListNode(val);
        ListNode curr = head;

        if(head==null){
            head =newNode;
            return;
        }

        while (curr.next!=null ){

            curr = curr.next;

        }
        curr.next=newNode;

        return;
    }
    private  void printLL() {
        ListNode curr = head;
        while (curr!=null ){
            System.out.print(curr.data+" -> ");
            curr = curr.next;

        }
        System.out.println("null");

    }
    private void reverseLinkedList() {

        ListNode prev = null;
        ListNode curr = head;

        while (curr.next!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;
        }
        System.out.println(prev);
    }

    private  void findMiddleDataFromLinkedList() {

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null ){
            slow= slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);

    }



    public static void main(String[] args) {
         LL list = new LL();
         list.addFirst(1);
         list.addFirst(2);

         list.addLast(3);
         list.addFirst(0);
        list.addFirst(4);
        list.addFirst(-1);

         list.printLL();



        list.reverseLinkedList();

         list.printLL();
    }



}
