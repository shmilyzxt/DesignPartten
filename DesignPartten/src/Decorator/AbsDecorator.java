package Decorator;

/**
 * Created by shmilyzxt on 2015/6/24.
 */
abstract public class AbsDecorator implements IDecorator{

    protected IDecorator iDecorator;

    public  void dosomething(){
        try {
            this.iDecorator.dosomething();
        }catch (Exception e){
            print("无法执行装饰");
        }

    }

    public void setDecorator(IDecorator iDecorator){
        this.iDecorator = iDecorator;
    }

    public void print(String str){
        System.out.println(str);
    }



}
