package Strategy;

/**
 * Created by shmilyzxt on 2015/6/25.
 */
public class StrategyFactory {

    public static AbsStrategy createStrategy(int type){
        switch (type){
            case AbsStrategy.MUTI:
                return new StrategyMuti();

            case AbsStrategy.PLUS:
                return new StrategyPlus();

            case AbsStrategy.OFF:
                return new StrategyThirtyPersentOff();

            default:return new AbsStrategy();
        }
    }

}
