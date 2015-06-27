package Builder;

/**
 * Created by Administrator on 2015/6/27 0027.
 */
public class Director {
    private IBuilder iBuilder;

    public Director(){}

    public Director(IBuilder iBuilder){
        this.iBuilder = iBuilder;
    }

    public void setBuilder(IBuilder iBuilder){
        this.iBuilder = iBuilder;
    }

    public void contruct(){
        this.iBuilder.buildPartA();
        this.iBuilder.buildPartB();
        this.iBuilder.buildPartC();
    }
}
