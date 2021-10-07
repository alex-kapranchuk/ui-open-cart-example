package repository;

import models.SearchModel;

public class SearchProductRepository {

    public static SearchModel getMissingProductModel() {
        return SearchModel.builder()
                .setMissingProduct("Test")
                .build();
    }

    public static SearchModel getFoundProductModel(){
        return SearchModel.builder()
                .setFoundProduct("Mac")
                .build();
    }
    public static SearchModel getCreatedProductModel() {
        return SearchModel.builder()
                .setCreatedProduct("Nokia")
                .build();
    }
}
