package withisp;

public class RestaurantService {

    public static void main(String[] args) {

        HamburguerOrder hamburguerOrder = new HamburguerOrder();
        hamburguerOrder.prepareOrder();
        
        Cashier cashier = new Cashier();
        cashier.toPay();
    }
}
