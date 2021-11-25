package gof.creation.abstractfactory;

public class ConcreteFactory1 implements AbstractFactory {

    private static int sequence = 0;

    @Override
    public ProductA1 createProductA() {
        return new ProductA1("ProductA1 " + ++sequence);
    }

    @Override
    public ProductB1 createProductB() {
        return new ProductB1("ProductB1 " + ++sequence);
    }
}
