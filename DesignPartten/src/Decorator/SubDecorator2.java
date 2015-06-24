package Decorator;

/**
 * Created by shmilyzxt on 2015/6/24.
 */
public class SubDecorator2 extends AbsDecorator implements IDecorator {

    public SubDecorator2(){print("调用了装饰器2无参构造器");}

    public SubDecorator2(IDecorator iDecorator){
        this.iDecorator = iDecorator;
    }

    @Override
    public void dosomething() {
        super.dosomething();
        //this.iDecorator.dosomething();
        print("装饰器2装饰了被装饰类");
    }
}
