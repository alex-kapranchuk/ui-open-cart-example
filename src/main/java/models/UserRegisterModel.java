package models;

import lombok.Getter;

@Getter
public class UserRegisterModel {

    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;
    private String passwordConfirm;

    public static UserRegisterModel.Builder builder() {
        return new UserRegisterModel().new Builder();
    }

    public class Builder {

        public UserRegisterModel.Builder setFirstName(String value) {
            firstName = value;
            return this;
        }

        public UserRegisterModel.Builder setLastName(String value) {
            lastName = value;
            return this;
        }

        public UserRegisterModel.Builder setEmail(String value) {
            email = value;
            return this;
        }

        public UserRegisterModel.Builder setTelephone(String value) {
            telephone = value;
            return this;
        }

        public UserRegisterModel.Builder setPassword(String value) {
            password = value;
            return this;
        }

        public UserRegisterModel.Builder setPasswordConfirm(String value) {
            passwordConfirm = value;
            return this;
        }

        public UserRegisterModel build() {
            return UserRegisterModel.this;
        }
    }
}
