package designmodel.observer;

/**
 * 八进制观察者实体
 * @Author liu
 * @Date 2019/9/26 17:36
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attch(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
