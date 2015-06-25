package Factory;

/**
 * Created by shmilyzxt on 2015/6/25.
 */
public abstract class AbsSubject {
    public abstract void dosomething();


    protected void print(String str){
        System.out.println(str);
    }
}
