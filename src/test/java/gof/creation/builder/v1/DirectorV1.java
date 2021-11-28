package gof.creation.builder.v1;

public class DirectorV1 {

    public final BuilderProductV1 builderProductV1;


    public DirectorV1(BuilderProductV1 builderProductV1) {
        this.builderProductV1 = builderProductV1;
    }

    public BuilderProductV1 construct() {
        return this.builderProductV1;
    }

}
