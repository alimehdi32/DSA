import java.util.HashMap;
import java.util.Map;

public class StartingPointLoop {
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


    Node getStartingPoint(Node head){
        Node temp = head;
        Map<Node, Integer> map = new HashMap<>();
        while(temp != null){
            if(map.containsKey(temp)){
                return temp;
            }
            map.put(temp, 1)
            temp = temp.next;
        }
        return null;
    
    }


    //Tortoise&Hare algorithm
    Node detectLoopOptimal(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
