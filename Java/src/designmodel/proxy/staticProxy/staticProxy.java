package designmodel.proxy.staticProxy;

import designmodel.proxy.iuserDao;

public class staticProxy {

    public static void main(String[] args) {
        iuserDao proxy = new userDaoProxy();
        proxy.save();
    }
}
