/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : Design_Patterns_Note_Project_Java
  @ Date         : 11/11/2023
  @ Time         : 9:38 AM
*/
package Singleton;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 11/11/2023
 * Time    : 9:38 AM
 */
public class Main {
    public static void main(String[] args){
        SingleObject singleObject = SingleObject.getInstance();
        System.out.println(singleObject.toString());

        SingleObject singleObject1 = SingleObject.getInstance();
        System.out.println(singleObject1.toString());
    }
}
