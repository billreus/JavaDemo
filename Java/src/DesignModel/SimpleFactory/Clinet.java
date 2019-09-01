package DesignModel.SimpleFactory;

public class Clinet {
    public static void main(String[] args){
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(2);
        product.show();
    }
}
