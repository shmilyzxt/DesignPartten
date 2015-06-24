package Decorator;

/**
 * Created by shmilyzxt on 2015/6/24.
 */
public class SubDecorator extends AbsDecorator implements IDecorator {

    public SubDecorator(){print("调用了装饰器1的无参构造器");}

    public SubDecorator(IDecorator iDecorator){
        this.iDecorator = iDecorator;
    }

    @Override
    public void dosomething(){
        super.dosomething();
        //this.iDecorator.dosomething();
        print("装饰器1装饰了被装饰类");
    }
}
