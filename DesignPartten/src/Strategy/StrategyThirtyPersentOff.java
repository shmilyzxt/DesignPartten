package Strategy;

/**
 * Created by shmilyzxt on 2015/6/25.
 */
public class StrategyThirtyPersentOff extends AbsStrategy implements IStrategy{

    public StrategyThirtyPersentOff(){}

    public StrategyThirtyPersentOff(double a,double b){
        super(a,b);
    }

    @Override
    public double operation() {
        return (a+b)*0.3;
    }
}
