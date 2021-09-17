package enums;


public enum URLs {

    BASE_URL("https://demo.opencart.com/index.php?route=common/home");

    private final String value;

    URLs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
