package gof.creation.abstractfactory;

public class ProductA2 implements AbstractProductA{

    private String name;

    public ProductA2(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getFrom() {
        return "ProductA2";
    }
}
