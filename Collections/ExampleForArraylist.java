import java.util.ArrayList;
class ExampleForArraylist{
 public static void main (String [] args){
    ArrayList al = new ArrayList();
    al.add(10);//add is in built method of arraylist, it will add the value in arraylist or collection
    al.add(20.34);
    al.add(null);
    al.add("java");
    System.out.println(al);
    System.out.println(al.size());// size of arraylist, size() is in built method of arraylist
    System.out.println(al.get(1));// get() is in built method of arraylist, it will return the value of index 1
    System.out.println(al.remove(2));// remove() is in built method of arraylist, it will remove the value of index 2
    System.out.println(al.indexOf("java"));// indexOf() is in built method of arraylist, it will return the index of value "java"
    System.out.println(al.contains(10));// contains() is in built method of arraylist,
 }   
}