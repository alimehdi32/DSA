import java.util.List;
import java.util.ArrayList;

public class SegregateEvenOdd {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    Node head = null;


    Node BruteForce(Node head){
        Node temp = head;
        List<Integer> list = new ArrayList<>();
        
        while( temp != null && temp.next != null ){
            list.add(temp.data);
            temp = temp.next.next;
        }
        temp = head.next;

        while( temp != null && temp.next != null ){
            list.add(temp.data);
            temp = temp.next.next;
        }

        int i=0;
        temp = head;
        while( temp != null ){
            temp.data = list.get(i);
            i++;
            temp = temp.next;
        }


        return head;
    }

    Node Optimal(Node head){
        Node temp = head;
        Node even = head.next;
        Node evenhead = head.next;

        while( even != null && even.next != null ){
            temp.next = temp.next.next;
            even.next = even.next.next;
            temp = temp.next;
            even = even.next;
        }
        temp.next = evenhead;

        return head;
    }
}
