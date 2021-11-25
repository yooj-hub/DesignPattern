package gof.creation.abstractfactory;

public class ProductB1 implements AbstractProductB{

    private String name;
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getFrom() {
        return "ProductB1";
    }

    public ProductB1(String name) {
        this.name = name;
    }
}
