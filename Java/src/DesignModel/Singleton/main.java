package DesignModel.Singleton;

public class main {
    public static void main(String[] args){
        //单例无法直接构造函数
        //Singleton singleton = new Singleton();

        Singleton singleton = Singleton.getUniqueInstance();
        singleton.show();
    }
}
