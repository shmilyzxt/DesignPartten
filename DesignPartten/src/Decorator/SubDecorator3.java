package Decorator;

/**
 * Created by shmilyzxt on 2015/6/24.
 */
public class SubDecorator3 extends AbsDecorator implements IDecorator {

    public SubDecorator3(){print("调用了装饰器3的无参构造器");}

    public SubDecorator3(IDecorator iDecorator){
        this.iDecorator = iDecorator;
    }

    @Override
    public void dosomething() {
        super.dosomething();
        //this.iDecorator.dosomething();
        print("装饰器3装饰了被装饰类");
    }
}
