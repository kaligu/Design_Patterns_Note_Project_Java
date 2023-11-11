/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : Design_Patterns_Note_Project_Java
  @ Date         : 11/11/2023
  @ Time         : 11:21 AM
*/
package decorator;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 11/11/2023
 * Time    : 11:21 AM
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redShapeDecorator = new RedShapeDecorator(new Circle());
        Shape shape2 = new ShapeDecorator(new Rectangle());

        System.out.println("withput decorator");
        circle.draw();

        System.out.println();

        System.out.println("with decorator");
        redShapeDecorator.draw();
    }
}
