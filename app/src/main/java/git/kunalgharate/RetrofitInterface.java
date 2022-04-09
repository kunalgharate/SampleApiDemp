package git.kunalgharate;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface RetrofitInterface {

    @POST("json_for_help_and_support_data_list.php")
    @FormUrlEncoded
    Call<List<ApiData>> getUsers(@Field("type") String type);

}