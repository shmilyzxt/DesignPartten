package Builder;

import Builder.ProductPart.PartA;
import Builder.ProductPart.PartB;
import Builder.ProductPart.PartC;

/**
 * Created by Administrator on 2015/6/27 0027.
 */
public class Product {
    private PartA partA;
    private PartB partB;
    private PartC partC;

    public void setPartA(PartA partA){
        this.partA = partA;
    }

    public void setPartB(PartB partB){
        this.partB = partB;
    }

    public void setPartC(PartC partC){
        this.partC = partC;
    }

    public PartA getPartA(){
        return this.partA;
    }

    public PartB getPartB(){
        return this.partB;
    }

    public PartC getPartC(){
        return this.partC;
    }
}
