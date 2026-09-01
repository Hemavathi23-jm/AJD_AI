import java.util.*;// * indicates all packages
public class ExForGenerics {
    public static void main(String [] arg) {
        ArrayList<String> al = new ArrayList<String>();// also permits to use ArrayList al = new ArrayList();
        al.add("C");
        al.add("A");
        al.add("10");
        for(String str: al) {
            System.out.println(str);
        }
        System.out.println("-----------------------------------");
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        for(Integer num: ll) {
            System.out.println(num);
        }
    }
}