package withoutisp;

public class Cashier implements Restaurant {

    @Override
    public void prepareOrder() {
        System.out.println("I dont know to prepare order");
    }

    @Override
    public void toPay() {
        System.out.println("Paying ...");
    }
}
