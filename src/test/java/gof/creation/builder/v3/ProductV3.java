package gof.creation.builder.v3;

import java.time.LocalDate;

public class ProductV3 {
    private final String name;
    private final LocalDate createdDate;
    public static final Builder builder = new Builder();

    public ProductV3(String name, LocalDate createdDate) {
        this.name = name;
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public static class Builder {

        private String name;
        private LocalDate createdDate;
        private static final Builder builder = new Builder();

        public static Builder getInstance() {
            return ProductV3.builder;
        }

        private Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder createdDate(LocalDate createdDate) {
            this.createdDate = createdDate;
            return this;

        }

        public ProductV3 build() {
            try {
                return new ProductV3(name, createdDate);
            } finally {
                this.name = null;
                this.createdDate = null;
            }
        }

    }
}
