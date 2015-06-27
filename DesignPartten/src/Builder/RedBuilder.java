package Builder;

import Builder.ProductPart.PartA;
import Builder.ProductPart.PartB;
import Builder.ProductPart.PartC;

/**
 * Created by Administrator on 2015/6/27 0027.
 */
public class RedBuilder implements IBuilder {
    private  Product product = new Product();

    public RedBuilder(){}

    public RedBuilder(Product product){
        this.product = product;
    }

    @Override
    public PartA buildPartA() {
        PartA partA =  new PartA("this is red builder ,build a red partA ");
        this.product.setPartA(partA);
        return partA;
    }

    @Override
    public PartB buildPartB() {
        PartB partB =  new PartB("this is red builder ,build a red partB");
        this.product.setPartB(partB);
        return partB;
    }

    @Override
    public PartC buildPartC() {
        PartC partC = new PartC("this is red builder ,builde a red partC");
        this.product.setPartC(partC);
        return partC;
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
}
