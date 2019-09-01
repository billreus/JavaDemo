package DesignModel.Proxy.dynamicProxy;

import DesignModel.Proxy.IUserDao;
import DesignModel.Proxy.UserDao;

public class dynamicProxy {
    public static void main(String[] args){
        //创建目标对象
        IUserDao target = new UserDao();
        System.out.println("目标对象: " + target.getClass());
        //代理对象
        IUserDao proxy = (IUserDao)new ProxyFactory(target).getProxyInstance();
        System.out.println("代理对象："+proxy.getClass());
        //执行代理对象的方法
        proxy.save();
    }

}
