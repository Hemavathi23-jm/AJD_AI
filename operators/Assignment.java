public class Assignment{
    public static void main(String [] args){

        int a=15;

        a+=5;
        System.out.println("Value of a after addition: " + a);// a=a+5=>20
        
        a-=7;
        System.out.println("Value of a after subtraction: " + a);// a=a-7=>13

        a*=4;
        System.out.println("Value of a after multiplication: " + a);// a=a*4=>52

        a/=2;
        System.out.println("Value of a after division: " + a);// a=a/2=>26

        a%=5;
        System.out.println("Value of a after modulus: " + a);// a=a%5=>1
    }
}
