public class Pix implements PaymentMethod{

    private String pixKey;

    public String getPixKey() {
        return pixKey;
    }

    public void setPixKey(String pixKey) {
        this.pixKey = pixKey;
    }

    public Pix(String pixKey){
        this.pixKey = pixKey;
    }

    @Override
    public void pay(double amount){
        System.out.println("Paid [" + amount + "] with pix: (key: " + pixKey + ")\n");
    }
}
