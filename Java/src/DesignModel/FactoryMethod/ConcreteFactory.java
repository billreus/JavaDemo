package DesignModel.FactoryMethod;

import DesignModel.SimpleFactory.ConcreteProduct;
import DesignModel.SimpleFactory.Product;

public class ConcreteFactory extends Factory {
    public Product factoryMethod(){
        return new ConcreteProduct();
    }
}
