
 class Bank {//amount is off double type
    double amount;

    Bank(double amount) {//constructor
        this.amount = amount;
    }

    void withdraw(double withdrawalAmount){//withdraw method
        String message =  (withdrawalAmount <= amount)
         ? "Withdrawal successful"
         :"Insufficient balance" ;
        System.out.println(message);
    
    if(withdrawalAmount <= amount){//balance amt after withdrawal
        amount = amount - withdrawalAmount;
        System.out.println(amount);

    }
}
    void deposit(double depositAmount){// deposit method
        amount = amount + depositAmount;
        System.out.println(amount);
   
    }

    public static void main(String[] args) {
        Bank b = new Bank(10000f);
        System.out.println(b.amount);
        b.withdraw(5000f);
        b.deposit(5000);
        System.out.println(b.amount);
    }
}

