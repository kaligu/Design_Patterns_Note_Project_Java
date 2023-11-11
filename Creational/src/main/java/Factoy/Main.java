/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : Design_Patterns_Note_Project_Java
  @ Date         : 11/11/2023
  @ Time         : 9:54 AM
*/
package Factoy;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 11/11/2023
 * Time    : 9:54 AM
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        shapeFactory.getShape(ShapeType.CIRCLE).draw();

        shapeFactory.getShape(ShapeType.SQUARE).draw();

        shapeFactory.getShape(ShapeType.RECTANGLE).draw();
    }
}
