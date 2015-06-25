package Template;

/**
 * Created by shmilyzxt on 2015/6/25.
 */
public abstract class AbsTemplate {

    abstract void method1();
    abstract void method2();
    abstract void method3();

    public void templateMethod123(){
        method1();
        method2();
        method3();
        print("模版方法结束:方法执行顺序123");
    }

    public void templateMethod321(){
        method3();
        method2();
        method1();
        print("模版方法结束:方法执行顺序321");
    }

    public void print(String str){
        System.out.println(str);
    }
}
