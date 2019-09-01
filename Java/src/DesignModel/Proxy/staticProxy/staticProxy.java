package DesignModel.Proxy.staticProxy;

import DesignModel.Proxy.IUserDao;

public class staticProxy {

    public static void main(String[] args) {
        IUserDao proxy = new UserDaoProxy();
        proxy.save();
    }
}
