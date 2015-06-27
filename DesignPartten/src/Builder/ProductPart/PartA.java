package Builder.ProductPart;

/**
 * Created by Administrator on 2015/6/27 0027.
 */
public class PartA {
    private String name = "product partA";

    public PartA(){}

    public PartA(String s){
        System.out.println(s);
    }

    public String getName(){
        return this.name;
    }
}
