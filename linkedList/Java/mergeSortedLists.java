class Solution {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    ListNode list1=null, list2=null;

    ListNode addElement(int data, ListNode head){
            ListNode newNode = new ListNode(data);

            if(head == null){
                head = newNode;
                return head;
            }
            ListNode tempNode = head;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
            return head;
        }

        
 
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode a=null;
        ListNode newList = null;
        ListNode tmp=newList;
        while(temp1!=null){
            
            int value = Math.min(temp1.val, temp2.val);
            System.out.println("value: " + value);
            ListNode newNode = new ListNode(value);
            if(newList==null){
                newList=newNode;
                tmp=newList;
            }else{
                tmp.next=newNode;
                tmp=newNode;
            }
            if(temp1.val < temp2.val){
                temp1=temp1.next;
            }else{
                temp2=temp2.next;
            }
            if(temp1==null && temp2==null)
            break;
            if(temp1==null){
                a=temp2;
                break;
            }
            if(temp2==null){
                a=temp1;
                break;
            }
        }
        if(a!=null){
            while(a!=null){
                ListNode newNode = new ListNode(a.val);
                if(newList==null){
                newList=newNode;
                tmp=newList;
            }else{
                tmp.next=newNode;
                tmp=newNode;
            }
            a=a.next;
            }
        }
        return newList;

        

    }

    void display(ListNode head){
            ListNode tempNode = head;
            while(tempNode != null){
                System.out.print(tempNode.val + " -> ");
                tempNode = tempNode.next;
            }
            System.out.print("null");
            System.out.println();
        }



        public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
       // ListNode tmp = head.next;
       System.err.println("When function is called:" + temp.val + " " + temp.next + " "+ temp.next.next + " " + temp.next.next.next);
        while(temp.next.next!=null){
            System.out.println("value of temp at while start:" + temp);
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else{
            temp = temp.next;
            }
            System.out.println("value of temp at while end:" + temp);
        }
        return head;
    }


    public static void main(String args[]){
        Solution obj = new Solution();
        /*obj.list1 = obj.addElement(1, obj.list1);
        obj.list1 = obj.addElement(2, obj.list1);
        obj.list1 = obj.addElement(4, obj.list1);
        obj.list2 = obj.addElement(1, obj.list2);
        obj.list2 = obj.addElement(3, obj.list2);
        obj.list2 = obj.addElement(4, obj.list2);
        obj.display(obj.list1);
        obj.display(obj.list2);*/
        // obj.list2 = obj.addElement(0, obj.list2);

        // ListNode head = obj.mergeTwoLists(obj.list1, obj.list2);
        // obj.display(head);
        obj.list1 = obj.addElement(1, obj.list1);
        obj.list1 = obj.addElement(1, obj.list1);
        obj.list1 = obj.addElement(2, obj.list1);
        ListNode head = obj.deleteDuplicates(obj.list1);
        obj.display(head);
    
    

    }
}