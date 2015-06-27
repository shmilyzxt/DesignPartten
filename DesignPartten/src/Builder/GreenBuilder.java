package Builder;

import Builder.ProductPart.PartA;
import Builder.ProductPart.PartB;
import Builder.ProductPart.PartC;

/**
 * Created by Administrator on 2015/6/27 0027.
 */
public class GreenBuilder implements IBuilder{
    private Product product = new Product();

    public GreenBuilder(){}

    public GreenBuilder(Product product){
        this.product = product;
    }

    @Override
    public PartA buildPartA() {
        PartA partA =  new PartA("this is green builder ,build a green partA ");
        this.product.setPartA(partA);
        return partA;
    }

    @Override
    public PartB buildPartB() {
        PartB partB =  new PartB("this is green builder ,build a green partB");
        this.product.setPartB(partB);
        return partB;
    }

    @Override
    public PartC buildPartC() {
        PartC partC =  new PartC("this is green builder ,builde a green partC");
        this.product.setPartC(partC);
        return partC;
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
}
