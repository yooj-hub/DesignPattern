package gof.creation.abstractfactory;

public class ProductA1 implements AbstractProductA{

    private String name;

    public ProductA1(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getFrom() {
        return "ProductA1";
    }
}
