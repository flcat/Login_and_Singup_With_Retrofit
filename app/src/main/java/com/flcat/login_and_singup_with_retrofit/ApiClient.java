package com.flcat.login_and_singup_with_retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static final String BASE_URL = "http://flcat.vps.phps.kr/inmoongram/";
    private static ApiClient mInstance;
    public static Retrofit retrofit = null;

    private ApiClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()) // Retrofit build 할때 client를 새로  interceptor가 추가 되어있는  client 로 교체한다
                    .build();
        }
    }

    public static synchronized ApiClient getInstance(){
        if (mInstance == null) {
            mInstance = new ApiClient();
        }
        return mInstance;
    }

    public ApiInterface getApi(){
        return retrofit.create(ApiInterface.class);
    }
}