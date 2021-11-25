package gof.creation.abstractfactory;

public class ProductB2 implements AbstractProductB{

    private String name;

    public ProductB2(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getFrom() {
        return "ProductB2";
    }
}
