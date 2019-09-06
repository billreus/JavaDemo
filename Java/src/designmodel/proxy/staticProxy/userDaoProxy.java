package designmodel.proxy.staticProxy;

import designmodel.proxy.iuserDao;
import designmodel.proxy.userDao;

//静态代理
public class userDaoProxy implements iuserDao {
    // 代理对象，需要维护一个目标对象
    private iuserDao target = new userDao();

    @Override
    public void save() {
        System.out.println("代理操作： 开启事务...");
        target.save();   // 执行目标对象的方法
        System.out.println("代理操作：提交事务...");
    }

    @Override
    public void find() {
        target.find();
    }
}
