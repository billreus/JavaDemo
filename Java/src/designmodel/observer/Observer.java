package designmodel.observer;

/**
 * 观察者
 * @Author liu
 * @Date 2019/9/26 17:22
 */
public abstract class Observer {
    public Subject subject;
    public abstract void update();
}
