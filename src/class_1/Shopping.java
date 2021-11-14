package class_1;

public class Shopping {

    public static void main(String[] args) {
        Product apple = new Product();
        apple.setName("apple");
        Product orange = new Product();
        orange.setName("orange");
        Product juice = new Product();
        juice.setName("juice");

        Market market = new Market();
        market.setName("Falco Market");
        market.setProducts(new Product[]{apple, juice, orange});

        Person client = new Person();
        client.setName("Elon");
        String productName = "apple";
        Product product = client.buy(market, productName);
        if (product == null) {
            System.out.println(client.getName() + "沒有買到" + productName);

        } else {
            System.out.println(client.getName() + "買到了" + productName);
        }


    }
}
