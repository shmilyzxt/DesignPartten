package Builder;

import Builder.ProductPart.PartA;
import Builder.ProductPart.PartB;
import Builder.ProductPart.PartC;

/**
 * Created by Administrator on 2015/6/27 0027.
 */
public interface IBuilder {
    PartA buildPartA();
    PartB buildPartB();
    PartC buildPartC();
    Product getProduct();
}
