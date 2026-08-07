public class UncheckedExample {
    public static void main(String[] args){
        // This will throw an ArrayIndexOutOfBoundsException, which is an unchecked exception
        int arr[]={10,20,30,49};
        System.out.println(arr[100]);
    }
    
}
