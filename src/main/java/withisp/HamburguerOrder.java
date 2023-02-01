package withisp;

public class HamburguerOrder implements RestaurantOrder {

    @Override
    public void prepareOrder() {
        System.out.println("The chef is preparing hamburguer ...");
    }

}
