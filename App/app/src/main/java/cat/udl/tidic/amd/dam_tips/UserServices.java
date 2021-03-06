package cat.udl.tidic.amd.dam_tips;

import com.google.gson.JsonObject;

import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserServices
{

    //@Headers("Authorization:656e50e154865a5dc469b80437ed2f963b8f58c8857b66c9bf")

    @GET("/account/logout")
    Call <Void> logOut(@Header("Authorization") String tokenAuth);

    @POST("/account/update_profile")
    Call<Void> editProfile(@Header("Authorization") String tokenAuth,  /*@Path (value = "user_id") String user_id,*/ @Body JsonObject userJson);


    @GET("/trivial/question/list")
    Call <  List<DataModel.Favour>> getFavours(@Query("user_id") String user_id);

    @GET("/trivial/question/list")
    Call <DataModel.Favour> getAllFavours(@Query("user_id") String user_id);



//    @Headers({"Content-Type:application/json"})
//    @POST("/users/register")
//    Call<Void> registerUser(@Body UserModel user);
//
//    @Headers({"Content-Type:application/json"})
//    @POST("/users/register")
//    Call<Void> registerUser2(@Body String userJson);

    @Headers({"Content-Type:application/json"})
    @POST("/users/register")
    Call<Void> registerUser3(@Body JsonObject userJson);

    @POST ("/account/create_token")
    Call<ResponseBody> createToken(@Header("Authorization") String tokenAuth);


    @POST("/favours/post/{favour_id}")
    Call<Void> postFavour(@Header("Authorization") String tokenAuth, @Body JsonObject userJson);

    @POST("/favours/update/{favour_id}")
    Call<Void> setFavours(@Header("Authorization") String tokenAuth, @Path(value = "favour_id") int favour_id, @Body JsonObject userJson);

    @GET("/favours/delete/{id}")
    Call<Void> deleteFavour(@Header("Authorization") String tokenAuth, @Path(value = "id") int id);

    @POST("/trivial/question/rate/{id}")
    Call<Void> postRate(@Path(value = "id") int id, @Body JsonObject opinionJson);

}
