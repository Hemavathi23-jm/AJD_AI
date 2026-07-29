class CreditCard
{
    int cardNo= 123456;
    int pin = 11111;

}
 class Hacker extends CreditCard
 {
    void ViewDetails()
    {
        System.out.println("Card Number: " + cardNo);
        System.out.println("PIN: " + pin);
    }
    Void ChangeDetails()
    {
        cardNo = 654321;
        pin = 22222;
        return null;
    }
 }
 class EInheritance
 {
    public static void main(String[] args) {
        Hacker h = new Hacker();
        h.ViewDetails();
        h.ChangeDetails();
        h.ViewDetails();
    }
}