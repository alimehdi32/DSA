import java.util.HashMap;
import java.util.Map;

public class LengthOfLoop {
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


    int LengthOfLoopBruteForce(Node head){
        Node temp = head;
        Map<Node, Integer> map = new HashMap<>();
        int timer = 0;
        while(temp != null){
            if(map.containsKey(temp)){
                return timer-map.get(temp);
            }
            map.put(temp, timer)
            temp = temp.next;
            timer++;
        }
        return 0;
    
    }

    int FindLength(Node slow, Node fast){
        int timer=1;
        fast=fast.next;
        while(slow != fast){
            fast=fast.next;
            timer++;
        }
        return timer;
    }
    //Tortoise&Hare algorithm
    int LengthOfLoopOptimal(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return FindLength(slow, fast);
            }
        }
        return 0;
    }
}
