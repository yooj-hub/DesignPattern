package gof.creation.abstractfactory;

public class ConcreteFactory2 implements AbstractFactory{
    private static int sequence = 0;

    @Override
    public ProductA2 createProductA() {
        return new ProductA2("ProductA2 " + ++sequence);
    }

    @Override
    public ProductB2 createProductB() {
        return new ProductB2("ProductB2 " + ++sequence);
    }
}
