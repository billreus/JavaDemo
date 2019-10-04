package designmodel.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题类
 * @Author liu
 * @Date 2019/9/26 17:17
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attch(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
