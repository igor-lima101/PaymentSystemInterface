public class DebitCard implements PaymentMethod{

    @Override
    public void pay(double amount){
       if(amount <= 0){
           System.out.println("Error: insufficient founds...");
           return;
       }
        System.out.println("Paid [" + amount + "] with the debit Card...\n");
    }
}
