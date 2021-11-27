package gof.creation.factorymethod;

public class ConcreteCreator implements Creator {
    @Override
    public Product factoryMethod(String kind, String name) {
        if (kind.equals("A") || kind.equals("a")) {
            return new ConcreteProductA(name);
        } else if (kind.equals("B") || kind.equals("b")) {
            return new ConcreteProductB(name);
        }
        throw new IllegalArgumentException("지원하지 않는 종류입니다.");
    }
}
