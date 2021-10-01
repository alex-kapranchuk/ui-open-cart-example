package models;

import lombok.Getter;
@Getter

public class LoginAdminModel {

    private String userName;
    private String password;

    public static LoginAdminModel.Builder builder(){
        return new LoginAdminModel().new Builder();
    }

    public class Builder {
        public LoginAdminModel.Builder setUserName(String value) {
            userName = value;
            return this;
        }

        public LoginAdminModel.Builder setPassword(String value) {
            password = value;
            return this;
        }
        public LoginAdminModel build(){
            return LoginAdminModel.this;
        }
    }

}
