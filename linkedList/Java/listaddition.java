import java.util.*;

public class listaddition {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  ListNode head=null;

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

    void addElement(int data){
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

        public int getDecimalValue() {
        ListNode temp = head;
        long binary = 0;
        long multiply = 1;
        int power = 1;

        while( temp != null ){
            binary = temp.val * multiply + binary;
            System.out.println("Binary: " + binary);
            System.out.println("Multiply: " + multiply);
            System.out.println("Power: " + power);
            multiply*= 10;
            power*= 2;
            temp = temp.next;
        }
        power/= 2;
        int sum = 0;
        while( binary != 0){
            long digit = binary % 10;
            sum = sum + (int) digit * power;
            power/= 2;
            binary/= 10;
        }

        return sum;
    }

        public static void main(String args[]){
            listaddition list = new listaddition();
            
           list.addElement(1);
           list.addElement(1);
           list.addElement(1);
           list.addElement(1);
           list.addElement(0);
           list.addElement(1);
           list.addElement(0);
           list.addElement(0);
           list.addElement(0);
           list.addElement(0);
           list.addElement(1);
          
           list.display(list.head);
           System.out.println(list.getDecimalValue());
        }
}
