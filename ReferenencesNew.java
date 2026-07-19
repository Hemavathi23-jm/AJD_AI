public class ReferenencesNew {
    public static void main(String [] args){
        String s1 = "Java";
        String s2 = new String("Java");
        if (s1==s2){
            System.out.println("References are equal");
        }
        else{
            System.out.println("References are not equal");
        }
    }
}
