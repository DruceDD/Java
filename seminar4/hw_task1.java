/*
Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список.
*/

package seminar4;

import java.util.LinkedList;


public class hw_task1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        LinkedList<Integer> revll = new LinkedList<Integer>();
        ll.add(4);
        ll.add(6);
        ll.add(2);
        ll.add(8);
        System.out.println("Исходный LinkedList: " + ll);
        revll = reverseLinkedList(ll);
        System.out.println("Развернутый LinkedList: " + revll);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> revlist)
    {
        LinkedList<Integer> revLinkedList = new LinkedList<Integer>();
        for (int i = revlist.size() - 1; i >= 0; i--) {
            revLinkedList.add(revlist.get(i));
        }
        return revLinkedList;
    }
}