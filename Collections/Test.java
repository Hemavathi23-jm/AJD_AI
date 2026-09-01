import java.util.ArrayList;
import java.util.LinkedList;
public class Test {
    public static void main(String[] args) {
        ArrayList<Double> al = new ArrayList<>();//using of generics
        al.add(10.0);
        System.out.println("objects inside arraylist:"+al+"size:"+al.size());
        LinkedList<Double> ll = new LinkedList<>();
        ll.addAll(al);//addAll() is in built method of linkedlist, it will add all the values of arraylist to linkedlist
        ll.add(20.34);
        System.out.println("objects inside linkedlist:"+ll+"size:"+ll.size());
        System.out.println(ll.containsAll(al));//containsAll() is in built method of linkedlist, it will check whether all the values of arraylist are present in linkedlist or not
        ll.remove(1);//remove() is in built method of linkedlist, it will remove the value of index 1
    }
}
