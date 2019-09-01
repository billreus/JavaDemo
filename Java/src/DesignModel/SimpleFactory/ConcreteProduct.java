package DesignModel.SimpleFactory;
//接口实体类
public class ConcreteProduct implements Product {

    @Override
    public void show(){
        System.out.println("Product");
    }
}
