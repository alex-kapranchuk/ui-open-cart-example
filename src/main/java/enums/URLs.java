package enums;


public enum URLs {
    BASE_URL("http://localhost/opencartsite/index.php?route=common/home"),
    ADMIN_LOGIN_URL("http://localhost/opencartsite/admin/index.php?route=common/login");

    private final String value;

    URLs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}