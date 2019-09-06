package designmodel.factoryMethod;

import designmodel.simpleFactory.ConcreteProduct1;
import designmodel.simpleFactory.Product;

public class ConcreteFactory1 extends Factory {
    public Product factoryMethod(){
        return new ConcreteProduct1();
    }
}
