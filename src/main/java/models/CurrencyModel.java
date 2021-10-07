package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CurrencyModel {

    private String euro;
    private String dollar;
    private String pound;
    private String hryvnia;

    /** Add Currencies*/

    private String currencyTitle;
    private String code;
    private String symbolLeft;
    private String value;
}
