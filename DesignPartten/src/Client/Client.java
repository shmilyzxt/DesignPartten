package Client;

import Decorator.*;
import Proxy.*;


/**
 * Created by shmilyzxt on 2015/6/24.
 */
public class Client {

    public static void main(String[] args){
        //第一种方式，通过构造函数进行装饰
        IDecorator iDecorator = new SubDecorator3(new SubDecorator2(new SubDecorator(new Decoratored())));
        iDecorator.dosomething();
        //第二种方式，通过setDecorator方法进行装饰
        Decoratored decoratored = new Decoratored();
        SubDecorator subDecorator = new SubDecorator();
        SubDecorator2 subDecorator2 = new SubDecorator2();
        SubDecorator3 subDecorator3 = new SubDecorator3();
        subDecorator.setDecorator(decoratored);
        subDecorator2.setDecorator(subDecorator);
        subDecorator3.setDecorator(subDecorator2);
        subDecorator3.dosomething();

        //代理模式client
        Proxy proxy = new Proxy(new RealSubject());
        proxy.firstRequest();
        proxy.secondRequest();
        proxy.thirdRequest();
        Proxy proxy1 = new Proxy();
        proxy1.setProxy(new RealSubject());
        proxy1.firstRequest();
        proxy1.secondRequest();
        proxy1.thirdRequest();

    }
}
