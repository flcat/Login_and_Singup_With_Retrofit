package com.flcat.login_and_singup_with_retrofit;

import com.google.gson.annotations.SerializedName;

public class User {
    //Model Class
    @SerializedName("response")
    private String Response;

    @SerializedName("name")
    private String userName;

    public String getResponse() {
        return Response;
    }

    public String getuserName() {
        return userName;
    }
}