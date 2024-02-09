public class LinkedList {
    Node head;
    Node tail;
    int size;
//    ----->>>> Add last ------------------
    public void addLast(int data){
      Node tba = new Node(data);
      if(head == null){
          head = tba;
          tail = tba;
      }else{
          tail.next = tba;
          tail = tba;
      }
      size += 1;
    }
    public void addFirst(int data){
        Node tba = new Node(data);
        if(head == null){
            head = tba;
            tail = tba;
        }else{
            tba.next = head;
            head = tba;
        }
        size += 1;
    }
    public void addAtIndex(int idx, int data){
        if(size < idx){
            System.out.println("provide index with in the range");
            return;
        }else if(idx == 0){
            addFirst(data);
        }else if(idx == size){
            addLast(data);
        }else{
//            --->> by using the 1st constructor in node class
//            Node tba = new Node(data);
//            Node curr = head;
//            while (idx-- > 1) {
//                curr = curr.next;
//            }
//            tba.next = curr.next;
//            curr.next = tba;
//            size += 1;
//          ----------------------------------------------------
//            -->> by using the second constructor in node class;
            Node curr = head;
            for(int i = 0; i < idx - 1; i++) curr = curr.next;
            Node tba = new Node(data,curr.next);
            curr.next = tba;
            size += 1;
        }
    }
    public void deleteLastNode(){
        Node curr = head;
        if(head.next == null){
            head = null;
        }else {
            while (curr.next != null) {
                if (curr.next.next == null) {
                    curr.next = null;
                } else {
                    curr = curr.next;
                }
            }
        }
        size -= 1;
    }
    public int FindNthNodeFromEnding(int idx){
        Node slow = head,fast = head;
        for(int i = 0; i < idx; i++) fast = fast.next;
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node curr = head;
        if(head == null) return "list is empty!!";
        while(curr != null){
            sb.append(curr.data).append("->");
            curr = curr.next;
        }
        sb.delete(sb.length() - 2,sb.length());
        return sb.toString();
    }
}
