public class NestedIf {
    public static void main(String[] args) {
        char gender = 'M';
        int age = 21;

        if (gender == 'M') {
            if (age >= 21) {
                System.out.println("If gender is Male and age is 21 or above, can get married");
            } else if (age < 21) {
                System.out.println("Need to wait");
            } else {
                System.out.println("Invalid age");
            }

        } else if (gender == 'F') {

            if (age >= 18) {
                System.out.println("If gender is Female and age is 18 or above, can get married");
            } else if (age < 18) {
                System.out.println("Need to wait");
            } else {
                System.out.println("Invalid age");
            }


        } else {
            System.out.println("Invalid gender");
        }
    }
}