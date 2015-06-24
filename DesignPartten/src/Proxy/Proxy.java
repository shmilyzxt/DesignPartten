package Proxy;

/**
 * Created by shmilyzxt on 2015/6/24.
 */
public class Proxy implements ISubject{

    private ISubject iSubject;

    public Proxy(){}

    public Proxy(ISubject iSubject){
        this.iSubject = iSubject;
    }

    public void setProxy(ISubject iSubject){
        this.iSubject = iSubject;
    }


    @Override
    public void firstRequest() {
        this.iSubject.firstRequest();
    }

    @Override
    public void secondRequest() {
        this.iSubject.secondRequest();

    }

    @Override
    public void thirdRequest() {
        this.iSubject.thirdRequest();

    }
}
