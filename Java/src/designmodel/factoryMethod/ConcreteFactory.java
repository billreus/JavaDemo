package designmodel.factoryMethod;

import designmodel.simpleFactory.ConcreteProduct;
import designmodel.simpleFactory.Product;

public class ConcreteFactory extends Factory {
    public Product factoryMethod(){
        return new ConcreteProduct();
    }
}
