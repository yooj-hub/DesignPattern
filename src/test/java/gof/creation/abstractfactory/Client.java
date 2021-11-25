package gof.creation.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();
        factory1.createProductA();
        factory1.createProductB();
        factory2.createProductA();
        factory2.createProductB();

    }

}
