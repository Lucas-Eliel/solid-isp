package withoutisp;

public class HamburguerOrder implements Restaurant {

    @Override
    public void prepareOrder() {
        System.out.println("The chef is preparing hamburguer ...");
    }

    @Override
    public void toPay() {
        System.out.println("I dont know to pay");
    }
}
