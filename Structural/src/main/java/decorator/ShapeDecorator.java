/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : Design_Patterns_Note_Project_Java
  @ Date         : 11/11/2023
  @ Time         : 11:04 AM
*/
package decorator;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 11/11/2023
 * Time    : 11:04 AM
 */
public class ShapeDecorator implements Shape{
    protected Shape decoratorShape;
    @Override
    public void draw() {
        decoratorShape.draw();
    }

    public ShapeDecorator (Shape decoratorShape){
        this.decoratorShape = decoratorShape;
    }
}
