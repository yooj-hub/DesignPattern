package gof.creation.builder.v2;

public class Directorv2 {

    public final BuilderProductV2 builderProduct;


    public Directorv2(BuilderProductV2 builderProduct) {
        this.builderProduct = builderProduct;
    }

    public BuilderProductV2 construct() {
        return this.builderProduct;
    }

}
