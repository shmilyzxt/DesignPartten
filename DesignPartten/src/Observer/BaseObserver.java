package Observer;

/**
 * Created by Administrator on 2015/6/26 0026.
 */
public abstract class BaseObserver implements IObserver{

    public void print(String str){
        System.out.println(str);
    }
}
