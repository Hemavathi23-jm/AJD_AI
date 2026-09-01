import java.util.LinkedList;
public class ExampleForLinkedlist {
    public static void main(String[] args) {
        LinkedList<Double> ll = new LinkedList<>();
        ll.add(10.0);//add is in built method of linkedlist, it will add the value in linkedlist or collection
        ll.add(20.34);
        ll.add(20.0);
        ll.add(30.0);
        System.out.println(ll);
        System.out.println(ll.size());// size of linkedlist, size() is in built method of linkedlist
        for(int i=0;i<ll.size();i++){//traversing the linkedlist using for loop
            System.out.println(ll.get(i));// get() is in built method of linkedlist, it will return the value of index i
        }
    }
}
