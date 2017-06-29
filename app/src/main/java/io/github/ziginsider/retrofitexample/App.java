package io.github.ziginsider.retrofitexample;

import android.app.Application;

import io.github.ziginsider.retrofitexample.api.UmoriliApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zigin on 26.06.2017.
 */

public class App extends Application {
    private static UmoriliApi umoriliApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("http://umorili.herokuapp.com/") //Базовая часть адреса
                .addConverterFactory(GsonConverterFactory.create()) //Конвертер, необходимый для преобразования JSON'а в объекты
                .build();
        umoriliApi = retrofit.create(UmoriliApi.class); //Создаем объект, при помощи которого будем выполнять запросы
    }

    public static UmoriliApi getApi() {
        return umoriliApi;
    }

}
