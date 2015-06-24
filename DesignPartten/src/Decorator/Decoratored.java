package Decorator;

/**
 * Created by shmilyzxt on 2015/6/24.
 * 被装饰的类
 */
public class Decoratored implements IDecorator {

    @Override
    public void dosomething() {
        System.out.println("我是被装饰类");
    }
}
