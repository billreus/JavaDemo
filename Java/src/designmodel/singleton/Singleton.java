package designmodel.singleton;

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton(){}//私有构造函数，该类无法实例化

    public static Singleton getUniqueInstance(){
    //public static synchronized Singleton getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void show(){
        System.out.println("hello uniqueInstance");
    }
}
