package Strategy;

/**
 * Created by shmilyzxt on 2015/6/25.
 */
public class StrategyMuti extends AbsStrategy implements  IStrategy{

    public StrategyMuti(){}

    public StrategyMuti(double a, double b){
        super(a,b);
    }

    @Override
    public double operation() {
        return  a*b;
    }
}
