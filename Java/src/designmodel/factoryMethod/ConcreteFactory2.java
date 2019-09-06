package designmodel.factoryMethod;

import designmodel.simpleFactory.ConcreteProduct2;
import designmodel.simpleFactory.Product;

public class ConcreteFactory2 extends Factory {
    public Product factoryMethod(){
        return new ConcreteProduct2();
    }
}
