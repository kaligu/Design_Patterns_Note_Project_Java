/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : Design_Patterns_Note_Project_Java
  @ Date         : 11/11/2023
  @ Time         : 12:36 PM
*/
package Stratergy;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 11/11/2023
 * Time    : 12:36 PM
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeOPeration(int nu1, int num2){
        return strategy.doOperation(nu1,num2);
    }
}
