import java.util.*;
public class DetectLoop {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
     Node head=null;


    boolean detectLoopBruteForce(Node head){
        Node temp = head;
        Map<Node, Integer> map = new HashMap<>();
        while(temp != null){
            if(map.containsKey(temp)){
                return true;
            }
            map.put(temp, 1)
            temp = temp.next;
        }
        return false;
    
    }


    //Tortoise&Hare algorithm
    boolean detectLoopOptimal(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DetectLoop obj = new DetectLoop();
        obj.head = new Node(1);
        obj.head.next = new Node(2);
        obj.head.next.next = new Node(3);
        obj.head.next.next.next = new Node(4);
        obj.head.next.next.next.next = new Node(5);
        obj.head.next.next.next.next.next = obj.head.next.next;
        System.out.println(obj.detectLoopOptimal(obj.head));
        
    }
}
