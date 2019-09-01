package DesignModel.FactoryMethod;

import DesignModel.SimpleFactory.ConcreteProduct;
import DesignModel.SimpleFactory.ConcreteProduct1;
import DesignModel.SimpleFactory.Product;

public class ConcreteFactory1 extends Factory {
    public Product factoryMethod(){
        return new ConcreteProduct1();
    }
}
