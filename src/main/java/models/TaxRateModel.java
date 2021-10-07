package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TaxRateModel {

    private String taxName;
    private String taxRate;
}
