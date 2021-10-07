package repository.Admin;

import models.CreateProductModel;


public class CreateProductAdminRepository {


    public static CreateProductModel getNokiaModel() {
        return CreateProductModel.builder()
                .productName("Nokia")
                .metaTagTitle("Nokia-1100")
                .productModel("Product Model 1100")
                .build();
    }
}

