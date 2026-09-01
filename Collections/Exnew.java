import java.util.*;

public class Exnew {
    public static void main(String[] args) {
        System.out.println("Linkedlist class");

        Queue <String> q = new LinkedList<>();
        q.offer("A");
        q.offer("B");
        q.offer("c");
        q.offer("d");
         System.out.println(q.peek());//A
         System.out.println(q.poll());//A
         System.out.println(q.poll());//B
         System.out.println(q.poll());//c
         for(String str : q){
            System.out.println(str);
         }

System.out.println("PriorityQueue");
  Queue <Integer> pq = new PriorityQueue<>();
            pq.add(19);
            pq.add(10);
            pq.add(5);
            pq.add(2);
            System.out.println(pq.element());//
            System.out.println(pq.remove());
            System.out.println(pq.remove());
            for(Integer in : pq){
                System.out.println(in);
            }

            System.out.println("ArrayDequeue");
      Queue <Integer> aq = new ArrayDeque<>();
            aq.add(19);
            aq.add(10);
            aq.add(5);
            aq.add(2);
            System.out.println(aq.element());//2
            System.out.println(aq.remove());//2(minimum priority)
            System.out.println(aq.remove());//5
            for(Integer in : aq){
                System.out.println(in);
            }
      


        }
    
}
