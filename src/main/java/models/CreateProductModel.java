package models;

import lombok.Builder;
import lombok.Data;

/** with plugin builder*/
@Data
@Builder
public class CreateProductModel {

    private String productName;
    private String metaTagTitle;
    private String productModel;

}
