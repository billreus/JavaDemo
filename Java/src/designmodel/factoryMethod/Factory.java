package designmodel.factoryMethod;

import designmodel.simpleFactory.Product;

/**
 * 在简单工厂中，创建对象的是另一个类，而在工厂方法中，是由子类来创建对象。
 */

public abstract class Factory {
    abstract public Product factoryMethod();
    public void doSomthing(){
        Product product = factoryMethod();
    }
}
