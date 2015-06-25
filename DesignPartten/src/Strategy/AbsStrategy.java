package Strategy;

/**
 * Created by shmilyzxt on 2015/6/25.
 */
public class AbsStrategy implements IStrategy{
    protected double a;
    protected double b;
    public static final int MUTI = 1;
    public static final int PLUS = 2;
    public static final int OFF = 3;

    AbsStrategy(){}

    AbsStrategy(double a,double b){
        this.a = a;
        this.b = b;
    }

    public void setA(double a){this.a = a;}

    public void setB(double b){this.b = b;}

    @Override
    public double operation(){
        print("输入错误的参数，没有适当的计算策略");
        return 0.00;
    }

    public void print(String str){
        System.out.println(str);
    }
}
