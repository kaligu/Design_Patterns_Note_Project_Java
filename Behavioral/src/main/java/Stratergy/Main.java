/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : Design_Patterns_Note_Project_Java
  @ Date         : 11/11/2023
  @ Time         : 12:38 PM
*/
package Stratergy;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 11/11/2023
 * Time    : 12:38 PM
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("10 + 5 = " + context.executeOPeration(10, 5));

        context = new Context(new SubstractOperation());
        System.out.println("10 - 5 = " + context.executeOPeration(10, 5));

        context = new Context(new MultiplyOperation());
        System.out.println("10 * 5 = " + context.executeOPeration(10, 5));
    }

}
