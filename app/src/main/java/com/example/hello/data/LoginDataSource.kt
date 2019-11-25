package com.example.hello.data

import android.content.Context
import android.content.SharedPreferences
import com.example.hello.data.model.LoggedInUser
import java.io.IOException

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    var theUser =  LoggedInUser(java.util.UUID.randomUUID().toString(), "Administrator",true)


    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication
            //Search user
            if(checkUser(username,password)){
                return Result.Success(this.theUser)
            }else {
                return Result.Error(IOException("Error logging in",null))
            }
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }

    fun checkUser(username: String, password: String): Boolean {
        if(username.equals("admin") && password.equals("admin1")){
            this.theUser = LoggedInUser(java.util.UUID.randomUUID().toString(), "Administrator",true)
            return true
        }else if(username.equals("keeper") && password.equals("keeper")){
            this.theUser = LoggedInUser(java.util.UUID.randomUUID().toString(), "Keeper",false)
            return true
        }else if(username.equals("greener") && password.equals("greener")){
            this.theUser = LoggedInUser(java.util.UUID.randomUUID().toString(), "Greener",false)
            return true
        }else{
            return false
        }
    }
}

