package repository;

import models.UserRegisterModel;
import org.apache.commons.lang3.RandomStringUtils;

public class UserRegisterRepository {

    public static UserRegisterModel getValidModel() {
        String password = RandomStringUtils.randomAlphabetic(7);
        return UserRegisterModel.builder()
                .setFirstName(RandomStringUtils.randomAlphabetic(6))
                .setLastName(RandomStringUtils.randomAlphabetic(6))
                .setEmail(RandomStringUtils.randomAlphabetic(6) + "@gmail.com")
                .setTelephone(RandomStringUtils.randomNumeric(10))
                .setPassword(password)
                .setPasswordConfirm(password)
                .build();
    }
}
