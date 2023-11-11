/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : Design_Patterns_Note_Project_Java
  @ Date         : 11/11/2023
  @ Time         : 9:34 AM
*/
package Singleton;

import java.security.Signature;
import java.security.SignedObject;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 11/11/2023
 * Time    : 9:34 AM
 */
public class SingleObject {
    private static SingleObject singleObject = new SingleObject();

    private SingleObject(){

    }

    public static SingleObject getInstance(){
        return singleObject;
    }
}
