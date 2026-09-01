import java.util.TreeSet;
class Student implements Comparable<Student>//Comparable<ClassName>
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
         public int compareTo(Student st) {// Syntax : public int compareTo(classname object)
             return this.name.compareTo(st.name);// using of compareTo() to compare and sort according to name
         }
 

    }



public class ExStudent {
    public static void main(String[] args) {
        Student s1 = new Student(101, "raj");
        Student s2 = new Student(102, "suma");
        Student s3 = new Student(103,"hope" );
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        for (Student st : ts)//for each loop
        {
            System.out.println(st);

        }
    }
}
