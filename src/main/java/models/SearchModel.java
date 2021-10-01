package models;

public class SearchModel {

    private String missingProduct;

    private String foundProduct;

    private String createdProduct;

    public static SearchModel.Builder builder() {
        return new SearchModel().new Builder();
    }

    public String getInValidProduct() {
        return missingProduct;
    }

    public String getValidProduct() {
        return foundProduct;
    }

    public String getCreatedProduct() {
        return createdProduct;
    }

    public class Builder {
        public SearchModel.Builder setMissingProduct(String value) {
            missingProduct = value;
            return this;
        }

        public SearchModel.Builder setFoundProduct(String value) {
            foundProduct = value;
            return this;
        }

        public SearchModel.Builder setCreatedProduct(String value) {
            createdProduct = value;
            return this;
        }

        public SearchModel build() {
            return SearchModel.this;
        }
    }
}
    

