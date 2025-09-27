package linkedList.Java;

public class listaddition {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = l1;
        ListNode curr = l1.next;
        while(curr != null){
            ListNode newNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNode;
        }
        l1.next = null;
        l1 = prev;
        System.out.println("l1 is reversed. head-> " + l1);

        ListNode prevNode = l2;
        ListNode currNode = l2.next;
        while(currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        l2.next = null;
        l2 = prevNode;
        System.out.println("l2 is reversed. head-> " + l2);


        ListNode head = null;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while(temp1.next != null){
            System.out.println(temp1.val + " " + temp2.val);
            int sum = temp1.val + temp2.val;
            System.out.println(sum);
            ListNode Node = new ListNode(sum);
            if(head == null){
                head = Node;
            }else {
                Node.next = head;
                head = Node;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return head;
    }

    void addElement(ListNode head, int data){
            ListNode newNode = new ListNode(data);

            if(head == null){
                head = newNode;
                return;
            }
            ListNode tempNode = head;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
            return;
        }

        void display(ListNode head){
            ListNode tempNode = head;
            while(tempNode != null){
                System.out.print(tempNode.val + " -> ");
                tempNode = tempNode.next;
            }
            System.out.print("null");
        }

        public static void main(String args[]){
            listaddition list = new listaddition();
            
            ListNode head1 = new ListNode(2);
            list.addElement(head1, 4);
            list.addElement(head1, 3);
            ListNode head2 = new ListNode(5);
            list.addElement(head2, 6);
            list.addElement(head2, 4);
            ListNode head3 = list.addTwoNumbers(head1, head2);
            list.display(head3);
        }
}
