package gof.creation.builder;

public class Director {

    public final BuilderProduct builderProduct;


    public Director(BuilderProduct builderProduct) {
        this.builderProduct = builderProduct;
    }

    public BuilderProduct construct() {
        return this.builderProduct;
    }

}
