package Proxy;

/**
 * Created by shmilyzxt on 2015/6/24.
 */
public class RealSubject extends AbsSubject implements ISubject{
    @Override
    public void firstRequest() {
        print("真实对象的第一个请求");
    }

    @Override
    public void secondRequest() {
        print("真实对象的第二个请求");
    }

    @Override
    public void thirdRequest() {
        print("真实对象的第三个请求");
}
}
