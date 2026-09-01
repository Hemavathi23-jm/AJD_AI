import java.util.Comparator;
import java.util.TreeSet;
class SortById implements Comparator<Student>{
    public int compare(Student o1, Student o2){
        return o1.id, o2.id;
    }
}
class Student 
{
    int id;
    String name;
    Student (int id, String name){//Constructor and close  the block before next methods
        this.id=id;
        this.name=name;
    }
        
        public String toString()// overriding the toString() to display the output
        {
            return id + " " + name;
        }
         
 

    }



public class new {
    public static void main(String[] args) {
        Student s1 = new Student(101, "raj");
        Student s2 = new Student(102, "suma");
        Student s3 = new Student(103,"hope" );
        SortById id =new SortById()
        TreeSet<Student> ts = new TreeSet<>(id);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        for (Student st : ts)//for each loop
        {
            System.out.println(st);

        }
    }
}

