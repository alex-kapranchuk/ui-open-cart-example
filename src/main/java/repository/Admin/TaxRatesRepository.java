package repository.Admin;

import models.TaxRateModel;

public class TaxRatesRepository {

    public static TaxRateModel getTestTaxRateModel(){
        return TaxRateModel.builder()
                .taxName("TestTax")
                .taxRate("3")
                .build();
    }
}
