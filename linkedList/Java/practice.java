package linkedList.Java;

public class practice {
    
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    void addElement(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return;
            }
            Node tempNode = head;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
            return;
        }

        void deleteElement(){
            Node tempNode = head;
            Node prevNode = null;

            while(tempNode != null){
                if(tempNode.data > 25){
                    if(prevNode == null){
                        head = tempNode.next;
                        tempNode = head;
                    }else{
                        prevNode.next = tempNode.next;
                        tempNode = tempNode.next;
                    }
                }else{
                    prevNode = tempNode;
                    tempNode = tempNode.next;
                }
            }
        }

        void display(){
            Node tempNode = head;
            while(tempNode != null){
                System.out.println(tempNode.data);
                tempNode = tempNode.next;
            }
        }

        public static void main(String[] args) {
            practice obj = new practice();
            obj.addElement(10);
            obj.addElement(20);
            obj.addElement(30);
            obj.addElement(40);
            obj.addElement(50);
            obj.addElement(60);
            obj.addElement(70);
            obj.display();
            obj.deleteElement();
            obj.display();
            
        }
}
