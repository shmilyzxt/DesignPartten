package Client;

import Builder.*;
import Decorator.*;
import Facade.Facage;
import Factory.*;
import Factory.AbsSubject;
import Observer.*;
import Observer.ISubject;
import Proxy.*;
import Strategy.AbsStrategy;
import Strategy.IStrategy;
import Strategy.StrategyFactory;
import Template.AbsTemplate;
import Template.Template1;
import Template.Template2;


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

        //工厂模式client
        IFactory subject1Factory = new Subject1Factory();
        AbsSubject sub1 = subject1Factory.createSubject();
        sub1.dosomething();
        IFactory subject2Factory = new Subject2Factory();
        AbsSubject sub2 = subject2Factory.createSubject();
        sub2.dosomething();
        IFactory subject3Factory = new Subject3Factory();
        AbsSubject sub3 = subject3Factory.createSubject();
        sub3.dosomething();

        //策略模式
        AbsStrategy iStrategy = StrategyFactory.createStrategy(1);
        iStrategy.setA(100);
        iStrategy.setB(200);
        Double result = iStrategy.operation();
        iStrategy.print(result.toString());
        AbsStrategy iStrategy2 = StrategyFactory.createStrategy(2);
        iStrategy2.setA(100);
        iStrategy2.setB(200);
        Double result2 = iStrategy2.operation();
        iStrategy2.print(result2.toString());
        AbsStrategy iStrategy3 = StrategyFactory.createStrategy(3);
        iStrategy3.setA(100);
        iStrategy3.setB(200);
        Double result3 = iStrategy3.operation();
        iStrategy3.print(result3.toString());
        AbsStrategy iStrategyUnknow = StrategyFactory.createStrategy(123);
        iStrategyUnknow.setA(100);
        iStrategyUnknow.setB(200);
        Double resultUnknow = iStrategyUnknow.operation();
        iStrategyUnknow.print(resultUnknow.toString());

        //模版模式
        AbsTemplate absTemplate = new Template1();
        absTemplate.templateMethod123();
        absTemplate.templateMethod321();
        AbsTemplate t2 = new Template2();
        t2.templateMethod321();
        t2.templateMethod123();

        //观察者模式
        ISubject concreteSubject = new ConcreteSubject();
        concreteSubject.nofifyObserver();
        ObserverOne observerOne = new ObserverOne();
        ObserverTwo observerTwo = new ObserverTwo();
        int i = concreteSubject.addObserver(observerOne).addObserver(observerTwo).nofifyObserver();
        System.out.println(i+" observers has been notifyChanges");
        //manageObserver.addObserver(observerTwo);
        //manageObserver.notifyObserver();
        concreteSubject.removeObserver(observerTwo).nofifyObserver();

        //外观模式
        Facage facage = new Facage();
        facage.facadeMethodOne();
        facage.facadeMethodTwo();

        //建造者模式
        Director director = new Director();
        IBuilder iBuilder = new RedBuilder();
        director.setBuilder(iBuilder);
        director.contruct();
        Product product = iBuilder.getProduct();
        System.out.println(product.getPartA().getName().toString());
        iBuilder = new GreenBuilder();
        director.setBuilder(iBuilder);
        director.contruct();
        product = iBuilder.getProduct();

    }
}
