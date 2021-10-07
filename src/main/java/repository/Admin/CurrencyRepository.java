package repository.Admin;

import models.CurrencyModel;


public class CurrencyRepository {

    public static CurrencyModel getEuroCurrencyModel() {
        return CurrencyModel.builder()
                .euro("€")
                .build();
    }

    public static CurrencyModel getDollarCurrencyModel() {
        return CurrencyModel.builder()
                .dollar("$")
                .build();
    }

    public static CurrencyModel getPoundCurrencyModel() {
        return CurrencyModel.builder()
                .pound("£")
                .build();
    }

    public static CurrencyModel getHryvniaCurrencyModel(){
        return CurrencyModel.builder()
                .hryvnia("₴")
                .build();
    }

    public static CurrencyModel getAddCurrencyModel(){
        return CurrencyModel.builder()
                .currencyTitle("Гривня ")
                .code("UAH")
                .symbolLeft("₴")
                .value("0.0375790")
                .build();
    }





}
