/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : Design_Patterns_Note_Project_Java
  @ Date         : 11/11/2023
  @ Time         : 11:15 AM
*/
package decorator;

/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 11/11/2023
 * Time    : 11:15 AM
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw(){
        decoratorShape.draw();
        setRedShap(decoratorShape);
    }

    private void setRedShap(Shape redShape){
        System.out.println("set Red Border");
    }
}
