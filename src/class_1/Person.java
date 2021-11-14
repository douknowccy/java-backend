package class_1;

public class Person {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product buy(Market market,String productName){
        return market.sell(productName);

    }
}
