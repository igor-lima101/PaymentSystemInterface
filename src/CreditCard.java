public class CreditCard implements PaymentMethod {

    private Integer cardNumber;
    private String cardHolder;

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public CreditCard(Integer cardNumber, String cardHolder){
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount){
        System.out.println("Paid [" + amount + "] with the credit Card: [" + cardNumber + "]\n");
    }
}
