package com.massive.bakingapp.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by minafaw on 11/21/2017.
 */

public class RetrofitClient {
    private static Retrofit retrofit = null;
    private static final String Url = "https://d17h27t6h515a5.cloudfront.net/";

    public static Retrofit retrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;

    }
}
