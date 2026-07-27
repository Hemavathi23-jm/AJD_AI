 public class EqualsString {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 =  new String("java");
        String s3 = "java";
        if (s1.equals(s2)) {
            System.out.println("s1 and s2 are equal");
        } else {
            System.out.println("s1 and s2 are not equal");
        }
        if (s1.equals(s3)) {
            System.out.println("s1 and s3 are equal");
        } else {
            System.out.println("s1 and s3 are not equal");
        }

}
}
/* it compares the values of the string not references(address) 
 use .equals() method */