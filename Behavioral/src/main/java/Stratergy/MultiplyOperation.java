/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : Design_Patterns_Note_Project_Java
  @ Date         : 11/11/2023
  @ Time         : 12:35 PM
*/
package Stratergy;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 11/11/2023
 * Time    : 12:35 PM
 */
public class MultiplyOperation implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
