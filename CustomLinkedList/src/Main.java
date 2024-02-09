public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        for(int i = 1; i < 10; i++){
            list.addLast(i);
//            list1.addFirst(i);
        }
//          list.addAtIndex(0,6);

          System.out.println(list);
          System.out.println(list.FindNthNodeFromEnding(5));
//          System.out.println("size - " + list.size);
//          list.deleteLastNode();
//          System.out.println(list);
//          System.out.println("size - " + list.size);
//        System.out.println(list1);
//        System.out.println(list2);
    }
}