package com.example.myapplication2.data;

import com.example.myapplication2.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {
        LoggedInUser fakeUser;

        try {
            if(username.equals("ma@o2.pl")){
                fakeUser = new LoggedInUser(java.util.UUID.randomUUID().toString(),"Mati");
            }else 
                {
                // TODO: handle loggedInUser authentication
                fakeUser = new LoggedInUser(java.util.UUID.randomUUID().toString(), "Jane Doe");
            }
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}