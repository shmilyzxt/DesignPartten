package Observer;

/**
 * Created by Administrator on 2015/6/27 0027.
 */
public interface ISubject {
    ISubject addObserver(IObserver iObserver);
    ISubject removeObserver(IObserver iObserver);
    int nofifyObserver();
}
