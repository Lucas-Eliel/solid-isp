package withisp;

public class Cashier implements RestaurantPay {

    @Override
    public void toPay() {
        System.out.println("Paying ...");
    }
}
