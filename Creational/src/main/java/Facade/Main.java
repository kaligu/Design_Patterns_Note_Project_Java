/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : Design_Patterns_Note_Project_Java
  @ Date         : 11/11/2023
  @ Time         : 10:10 AM
*/
package Facade;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 11/11/2023
 * Time    : 10:10 AM
 */
public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
