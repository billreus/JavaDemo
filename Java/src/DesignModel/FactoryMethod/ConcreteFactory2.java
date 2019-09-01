package DesignModel.FactoryMethod;

import DesignModel.SimpleFactory.ConcreteProduct;
import DesignModel.SimpleFactory.ConcreteProduct2;
import DesignModel.SimpleFactory.Product;

public class ConcreteFactory2 extends Factory {
    public Product factoryMethod(){
        return new ConcreteProduct2();
    }
}
