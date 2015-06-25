package Strategy;

/**
 * Created by shmilyzxt on 2015/6/25.
 */
public class StrategyPlus extends AbsStrategy implements  IStrategy{

    public StrategyPlus(){}

    public StrategyPlus(double a, double b){
       super(a,b);
    }

    @Override
    public double operation() {
        return  a+b;
    }
}
