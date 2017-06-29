package io.github.ziginsider.retrofitexample.api;

import java.util.List;

import io.github.ziginsider.retrofitexample.PostModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by zigin on 26.06.2017.
 */

public interface UmoriliApi {

    @GET("/api/get")
    Call<List<PostModel>> getData(@Query("name") String resourceName, @Query("num") int count);
}
