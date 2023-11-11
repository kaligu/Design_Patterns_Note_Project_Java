/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : Design_Patterns_Note_Project_Java
  @ Date         : 11/11/2023
  @ Time         : 9:49 AM
*/
package Factoy;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 11/11/2023
 * Time    : 9:49 AM
 */
public class ShapeFactory {
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }
    }
}
