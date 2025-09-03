//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        Cash cash = new Cash();
        Pix pix = new Pix("saokmso");
        CreditCard creditCard = new CreditCard(3029303, "marcio dos santos");
        DebitCard debitCard = new DebitCard();

        processor.processPayment(cash, 1000);
        processor.processPayment(pix, 150.00);
        processor.processPayment(creditCard, 200.00);
        processor.processPayment(debitCard, 0);

    }
}