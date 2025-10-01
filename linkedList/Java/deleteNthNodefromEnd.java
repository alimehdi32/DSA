public class deleteNthNodefromEnd {
    
    public class Node {
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

    Node BruteForce(int n){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        int res = n - count;
        if(res == 0){
            head = head.next;
            return head;
        }
        int i=0;
        while(i < res-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;

    }

    Node Optimal(int n){
        Node slow = head;
        Node fast = head;
        for(int i=0; i<n; i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
