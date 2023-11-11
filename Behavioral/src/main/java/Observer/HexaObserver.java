/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : Design_Patterns_Note_Project_Java
  @ Date         : 11/11/2023
  @ Time         : 12:12 PM
*/
package Observer;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 11/11/2023
 * Time    : 12:12 PM
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Binary Value : "+Integer.toHexString(subject.getState()));
    }

}
