package Observer;

/**
 * Created by Administrator on 2015/6/26 0026.
 */
public class ObserverOne extends BaseObserver implements IObserver {

    @Override
    public void notifyChanges() {
        print("ObserverOne received change message");
    }
}
