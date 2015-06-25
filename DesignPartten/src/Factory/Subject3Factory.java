package Factory;

/**
 * Created by shmilyzxt on 2015/6/25.
 */
public class Subject3Factory implements IFactory {
    @Override
    public AbsSubject createSubject() {
        return new SubSubject3();
    }
}
