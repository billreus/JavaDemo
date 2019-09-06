package designmodel.proxy.dynamicProxy;

import designmodel.proxy.iuserDao;
import designmodel.proxy.userDao;

public class dynamicProxy {
    public static void main(String[] args){
        //创建目标对象
        iuserDao target = new userDao();
        System.out.println("目标对象: " + target.getClass());
        //代理对象
        iuserDao proxy = (iuserDao)new proxyFactory(target).getProxyInstance();
        System.out.println("代理对象："+proxy.getClass());
        //执行代理对象的方法
        proxy.save();
    }

}
