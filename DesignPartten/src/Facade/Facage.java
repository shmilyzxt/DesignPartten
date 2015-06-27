package Facade;

/**
 * Created by Administrator on 2015/6/27 0027.
 */
public class Facage {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;

    public Facage(){
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
    }

    public void facadeMethodOne(){
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
    }

    public void facadeMethodTwo(){
        subSystemTwo.methodTwo();
        subSystemOne.methodOne();
    }
}
