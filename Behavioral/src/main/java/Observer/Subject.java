/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : Design_Patterns_Note_Project_Java
  @ Date         : 11/11/2023
  @ Time         : 11:52 AM
*/
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 11/11/2023
 * Time    : 11:52 AM
 */
public class Subject {
    private List<Observer> observerList = new ArrayList<Observer>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer:observerList){
            observer.update();
        }
    }
}
