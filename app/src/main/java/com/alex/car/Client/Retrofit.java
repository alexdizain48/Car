package com.alex.car.Client;

import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {

    private static final String BASE_URL = "";
    private static retrofit2.Retrofit.Builder builder = new retrofit2.Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private static retrofit2.Retrofit retrofit = builder.build();


    public static <S> S getDatas(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }

}
