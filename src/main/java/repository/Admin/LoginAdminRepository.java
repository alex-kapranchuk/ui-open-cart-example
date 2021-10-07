package repository.Admin;

import models.LoginAdminModel;

public class  LoginAdminRepository {

    public static LoginAdminModel getValidLoginModel(){
        return LoginAdminModel.builder()
                .setUserName("Admin")
                .setPassword("1234")
                .build();
    }
}
